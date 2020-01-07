package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Member;
import com.eomcs.util.ArrayList;

public class MemberHandler {

  ArrayList<Member> memberList;
  Scanner input; // default나 private. 생성자로 받기 때문 

  
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
    // toArray()는 내부에서 새 배열을 만들고, 값을 복사한 후 리턴한다.(리턴값은 새배열!)
    Member[] arr = this.memberList.toArray(new Member[] {});
    for (Member m : arr) {
      System.out.printf("%d, %s, %s, %s, %s\n", 
          m.getNo(), m.getName(), m.getEmail(), m.getTel(), m.getRegisteredDate());
    }
  }


  public void detailMember() {
    System.out.println("번호? ");
    int index = input.nextInt();
    input.nextLine(); //숫자 뒤에 남은 공백 제거
    
    Member member = (Member) this.memberList.get(index); 
    
    if (member == null) {
      System.out.println("해당 학생을 찾을 수 없습니다.");
      return;
    }
    
    System.out.printf("이름: %s\n", member.getName());
    System.out.printf("이메일: %s\n", member.getEmail());
    System.out.printf("암호: %s\n", member.getPassword());
    System.out.printf("사진: %s\n", member.getPhoto());
    System.out.printf("전화: %s\n", member.getTel());
    System.out.printf("가입일: %s\n", member.getRegisteredDate());
  }
  
  
  public void updateMember() {
    System.out.println("번호? ");
    int index = input.nextInt();
    input.nextLine(); //숫자 뒤에 남은 공백 제거
    
     Member oldMember = (Member) this.memberList.get(index); 
    
    if (oldMember == null) {
      System.out.println("해당 회원을 찾을 수 없습니다.");
      return;
    }
  
    
    System.out.printf("이름(%s)? ", oldMember.getName());
    String name = input.nextLine();

    System.out.printf("이메일(%s)? ", oldMember.getEmail());
    String email = input.nextLine();
    
    System.out.printf("암호(%s)? ", oldMember.getPassword());
    String password = input.nextLine();
    
    System.out.printf("사진(%s)? ", oldMember.getPhoto());
    String photo = input.nextLine();
    
    System.out.printf("전화(%s)? ", oldMember.getTel());
    String tel = input.nextLine();
    
    
    Member newMember = new Member();
    newMember.setName(name);
    newMember.setEmail(email);
    newMember.setPassword(password);
    newMember.setPhoto(photo);
    newMember.setTel(tel);
    newMember.setRegisteredDate(new Date(System.currentTimeMillis()));
   
    this.memberList.set(index, newMember);
    
    System.out.println("회원을 변경했습니다.");
  }
  
  
  public void deleteMember() {
    System.out.println("번호? ");
    int index = input.nextInt();
    input.nextLine(); //숫자 뒤에 남은 공백 제거
    
    Member member = (Member) this.memberList.get(index);
    
    if (member == null) {
      System.out.println("해당 회원을 찾을 수 없습니다.");
      return;
    }
    
    
    this.memberList.remove(index);
    
    System.out.println("회원을 삭제했습니다.");
    
  }
  
  
  
  
  
  
}


