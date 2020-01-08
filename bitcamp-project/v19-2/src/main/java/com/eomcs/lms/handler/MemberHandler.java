// 게시글 번호로 객체를 찾는 코드를 관리하기 쉽게 별도의 메서드로 분리한다.
// => indexOfBoard(int) 메서드 추가
// 내부에서만 쓸거니까 private로 // 임시변수도 없앰.
//

package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Member;
import com.eomcs.util.ArrayList;

public class MemberHandler {

  ArrayList<Member> memberList;
  Scanner input; // default나 private. 생성자로 받기 때문 

  //생성자 2개와 1개인 경우 차이 암기**
  public MemberHandler(Scanner input) {
    this.input = input;
    this.memberList = new ArrayList<>();
  }


  public void addMember() {

    Member member = new Member();

    System.out.print("번호? ");
    member.setNo(input.nextInt());
    input.nextLine(); // 줄바꿈 기호 제거용

    System.out.print("이름? ");
    member.setName(input.nextLine());

    System.out.print("이메일? ");
    member.setEmail(input.nextLine());

    System.out.print("암호? ");
    member.setPassword(input.nextLine());

    System.out.print("사진? ");
    member.setPhoto(input.nextLine());

    System.out.print("전화? ");
    member.setTel(input.nextLine());

    member.setRegisteredDate(new Date(System.currentTimeMillis()));

    memberList.add(member); 

    System.out.println("저장하였습니다.");
  }


  public void listMember() {
    // Member 객체의 목록을 저장할 배열을 넘기는데 크기가 0인 배열을 넘긴다.
    // toArray()는 내부에서 새 배열을 만들고, 값을 복사한 후 리턴한다.(리턴값은 새배열 arr)
    // 굳이 괄호안에 방 갯수를 줄 필요 없이 toArray는 알아서 내부적으로 새 배열을 멤버리스트 크기만큼 만들어서 복사하고 arr로 리턴
    Member[] arr = this.memberList.toArray(new Member[] {});
    for (Member m : arr) {
      System.out.printf("%d, %s, %s, %s, %s\n", 
          m.getNo(), m.getName(), m.getEmail(), m.getTel(), m.getRegisteredDate());
    }
  }


  public void detailMember() {
    System.out.println("번호? ");
    int no = input.nextInt();
    input.nextLine(); //숫자 뒤에 남은 공백 제거

    int index = indexOfMember(no);

    if (index == -1) {
      System.out.println("회원 인덱스가 유효하지 않습니다.");
      return;
    }

    Member member = this.memberList.get(index); 

    System.out.printf("번호: %d\n", member.getNo());
    System.out.printf("이름: %s\n", member.getName());
    System.out.printf("이메일: %s\n", member.getEmail());
    System.out.printf("암호: %s\n", member.getPassword());
    System.out.printf("사진: %s\n", member.getPhoto());
    System.out.printf("전화: %s\n", member.getTel());
    System.out.printf("가입일: %s\n", member.getRegisteredDate());
  }


  public void updateMember() {
    System.out.println("번호? ");
    int no = input.nextInt();
    input.nextLine(); //숫자 뒤에 남은 공백 제거

    int index = indexOfMember(no);

    if (index == -1) {
      System.out.println("해당 번호의 회원이 없습니다.");
      return;
    }

    Member oldMember = this.memberList.get(index); //일단 수정전것을 oldMember에 저장함

    boolean changed = false; // 변경했는지 안했는지 알아보기 위한 변수
    String inputStr = null; //빈 문자열 입력했는지 알아보기 위한 변수
    Member newMember = new Member(); // 뉴멤버 식판을 하나 만든다.

    newMember.setNo(oldMember.getNo()); // 숫자는 그대로 받아옴

    System.out.printf("이름(%s)? ", oldMember.getName());
    inputStr = input.nextLine();
    if (inputStr.length() == 0) {
      newMember.setName(oldMember.getName());
    } else {
      newMember.setName(inputStr);
      changed = true;
    }

    System.out.printf("이메일(%s)? ", oldMember.getEmail());
    inputStr = input.nextLine();
    if (inputStr.length() == 0) {
      newMember.setEmail(oldMember.getEmail());
    } else {
      newMember.setEmail(inputStr);
      changed = true;
    }


    System.out.printf("암호(%s)? ", oldMember.getPassword());
    inputStr = input.nextLine();
    if (inputStr.length() == 0) {
      newMember.setPassword(oldMember.getPassword());
    } else {
      newMember.setPassword(inputStr);
      changed = true;
    }


    System.out.printf("사진(%s)? ", oldMember.getPhoto());
    inputStr = input.nextLine();
    if (inputStr.length() == 0) {
      newMember.setPhoto(oldMember.getPhoto());
    } else {
      newMember.setPhoto(inputStr);
      changed = true;
    }


    System.out.printf("전화(%s)? ", oldMember.getTel());
    inputStr = input.nextLine();
    if (inputStr.length() == 0) {
      newMember.setTel(oldMember.getTel());
    } else {
      newMember.setTel(inputStr);
      changed = true;
    }



    if (changed) {
      this.memberList.set(index, newMember);
      System.out.println("회원정보를 변경했습니다.");
    } else {
      System.out.println("회원정보 변경을 취소하였습니다.");
    }

  }


  public void deleteMember() {
    System.out.println("번호? ");
    int no = input.nextInt();
    input.nextLine(); //숫자 뒤에 남은 공백 제거

    int index = indexOfMember(no);
    
    if (index == -1) {
      System.out.println("회원 인덱스가 유효하지 않습니다.");
      return;
    }

    this.memberList.remove(index);

    System.out.println("회원을 삭제했습니다.");
  }
  
  
  private int indexOfMember(int no) {
    for (int i = 0; i < this.memberList.size(); i++) {
      if (this.memberList.get(i).getNo() == no) {
        return i;
      }
    }
    return -1;
  }


}


