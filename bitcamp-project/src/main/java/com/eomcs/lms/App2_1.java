package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App2_1 { 
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    //1.회원정보 데이터를 저장할 메모리를 설계한다.
    class Member {
      int no;
      String name;
      String email;
      String password;
      String photo;
      String tel;
      Date registeredDate;
    }
    
    final int SIZE = 100;

    //2. Member 인스턴스의 주소를 담는 메모리, 레퍼런스 배열을 준비한다.
    Member[] members = new Member[SIZE];
    
    //3. Member 인스턴스를 생성하여 레퍼런스 배열(members)에 저장한다.
    for (int i = 0; i < SIZE; i++) {
      members[i] = new Member();
    }
  
    String response; // 계속입력하시겠습니까에 대한 대답을 입력받는 nextint값을 담을 변수. 밑에 사용.
    int count = 0;  // 입력받은 개수 카운트하기 위한 변수. 밑에 출력에 사용

    for (int i = 0; i < SIZE; i++) {

      count++;

      // 4. 회원정보를 저장할 메모리를 Member 설계도에 따라 만든다.
      Member member = members[i];
      
      System.out.print("번호? ");
      member.no = keyboard.nextInt();
      keyboard.nextLine(); // 줄바꿈 기호 제거용

      System.out.print("이름? ");
      member.name = keyboard.nextLine();

      System.out.print("이메일? ");
      member.email = keyboard.nextLine();

      System.out.print("암호? ");
      member.password = keyboard.nextLine();

      System.out.print("사진? ");
      member.photo = keyboard.nextLine();

      System.out.print("전화? ");
      member.tel = keyboard.nextLine();

      member.registeredDate = new Date(System.currentTimeMillis());

      System.out.println();
      
      System.out.print("계속 입력하시겠습니까?(Y/n) ");
      response = keyboard.nextLine();
      // String response = keyboard.nextLine();를 두문장으로 쪼갬
      
      if (!response.equalsIgnoreCase("y"))
        break;
    }
    
    keyboard.close();

    System.out.println();

    for (int i = 0; i < count; i++) {
      Member member = members[i]; // 5. [0]번에 저장된 주소가 가리키는 member식판을 출력한다.
      System.out.printf("%d, %s, %s, %s, %s\n", 
          member.no, member.name, member.email, member.tel, member.registeredDate);
    }
    
  }
}
