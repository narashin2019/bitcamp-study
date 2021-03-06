package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Member;

public class MemberHandler {

  // 인스턴스 필드 = 논 스태틱 필드
  // => 개별적으로 관리해야 하는 변수
  // => new 명령을 통해 생성된다.
  Member[] members;
  int memberCount = 0;

  public Scanner input; //keyboard대신 input으로 전체 변환 // 향후 다른 스캐너 사용할 수 있으니 static 제거

  
  //클래스 필드 = 스태틱 필드
  // => 공유하는 변수
  // => 클래스가 메모리에 로딩될 때 자동으로 생성된다.
  static final int MEMBER_SIZE = 100;
  
  
  //생성자
  public MemberHandler(Scanner input) {
    this.input = input;
    this.members = new Member[MEMBER_SIZE];
  }

  //인스턴스 메서드
  public void addMember() {
    Member member = new Member();

    System.out.print("번호? ");
    member.no = input.nextInt();
    input.nextLine(); // 줄바꿈 기호 제거용

    System.out.print("이름? ");
    member.name = input.nextLine();

    System.out.print("이메일? ");
    member.email = input.nextLine();

    System.out.print("암호? ");
    member.password = input.nextLine();

    System.out.print("사진? ");
    member.photo = input.nextLine();

    System.out.print("전화? ");
    member.tel = input.nextLine();

    member.registeredDate = new Date(System.currentTimeMillis());

    this.members[this.memberCount++] = member; 

    System.out.println("저장하였습니다.");
  }

  
  //인스턴스 메서드
  public  void listMember() {
    for (int i = 0; i < this.memberCount; i++) {
      Member m = this.members[i]; 
      System.out.printf("%d, %s, %s, %s, %s\n", 
          m.no, m.name, m.email, m.tel, m.registeredDate);
    }
  }


}


