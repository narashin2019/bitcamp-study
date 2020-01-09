// 사용자 입력을 받는 코드를 별도의 메서드로 분리한다.

package com.eomcs.lms.handler;

import java.sql.Date;
import com.eomcs.lms.domain.Member;
import com.eomcs.util.ArrayList;
import com.eomcs.util.Prompt;

public class MemberHandler {

  ArrayList<Member> memberList;
  
  Prompt prompt; 


  public MemberHandler(Prompt prompt) {
    this.prompt = prompt;
    this.memberList = new ArrayList<>();
  }


  public void addMember() {

    Member member = new Member();

    member.setNo(prompt.inputInt("번호? "));
    member.setName(prompt.inputString("이름? "));
    member.setEmail(prompt.inputString("이메일? "));
    member.setPassword(prompt.inputString("암호? "));
    member.setPhoto(prompt.inputString("사진? "));
    member.setTel(prompt.inputString("전화? "));
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

    int index = indexOfMember(prompt.inputInt("번호? "));

    if (index == -1) {
      System.out.println("해당 번호의 회원이 없습니다.");
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
    int index = indexOfMember(prompt.inputInt("번호? "));

    if (index == -1) {
      System.out.println("해당 번호의 회원이 없습니다.");
      return;
    }

    Member oldMember = this.memberList.get(index); //일단 수정전것을 oldMember에 저장함
    Member newMember = new Member(); // 뉴멤버 식판을 하나 만든다.

    newMember.setNo(oldMember.getNo()); // 숫자는 그대로 받아옴

    newMember.setName(prompt.inputString(
        String.format("이름(%s)? ", oldMember.getName()), 
        oldMember.getName())); 

    newMember.setEmail(prompt.inputString(
        String.format("이메일(%s)? ", oldMember.getEmail()), 
        oldMember.getEmail())); 

    newMember.setPassword(prompt.inputString(
        String.format("암호(%s)? ", oldMember.getPassword()), 
        oldMember.getPassword())); 

    newMember.setPhoto(prompt.inputString(
        String.format("사진(%s)? ", oldMember.getPhoto()), 
        oldMember.getPhoto())); 

    newMember.setTel(prompt.inputString(
        String.format("전화(%s)? ", oldMember.getTel()), 
        oldMember.getTel())); 

    newMember.setRegisteredDate(oldMember.getRegisteredDate());

    
    if (oldMember.equals(newMember)) {
      System.out.println("회원 변경을 취소하었습니다.");
      return;
    } 
      
    this.memberList.set(index, newMember);
      System.out.println("회원을 변경했습니다.");
    

  }


  public void deleteMember() {
    int index = indexOfMember(prompt.inputInt("번호? "));

    if (index == -1) {
      System.out.println("해당 번호의 회원이 없습니다.");
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


