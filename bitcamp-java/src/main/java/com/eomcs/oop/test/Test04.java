package com.eomcs.oop.test;

// gym 회원 정보를 입력 받아 출력
public class Test04 {

  public static void main(String[] args) {

    // 회원 정보를 담을 수 있는 메모리의 설계도
    class Member {
      int no;
      String name;
      int birthYear;
      char gender; 
      float height; 
      float weight;
      boolean personalTraning; 
    }


    Member m1; //레퍼런스
    m1 = new Member(); // 주소를 m1에 넣는다.
    m1.no = 100; // 사용가능!
    System.out.println(m1); // 인스턴스에 부여된 고유 번호와 클래스 명이 출력된다. //출력시 나오는 번호 주소아님.
    System.out.println(m1.no);

    // 레퍼런스의 주소를 없애는 방법
    m1 = null;
    System.out.println(m1); //null출력. 주소가 없다는 의미로 실제 메모리에 0으로 설정된다.
    //System.out.println(m1.no); // 컴파일에러 java.lang.NullPointerException 28라인 에러다. 가리키는 게 없다=널포인트익셉션 = 주소없이 썼다.
  }
}
