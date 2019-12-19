package com.eomcs.oop.test;

// gym 회원 정보를 입력받아 출력 예제
// 인스턴스 주소 주고 받기
public class Test21 {

  // 여러 메소드가 공유할 클래스 설계도는 main밖으로 꺼낸다. 꺼내는 대신 static붙인다.
  // 회원 정보를 담을 수 있는 메모리의 설계도
  static class Member {
    int no;
    String name;
    int birthYear;
    char gender;
    float height;
    float weight;
    boolean personalTraning;
  }

  public static void main(String[] args) {

    // 인스턴스 주소 주고 받기

    //1) 인스턴스 주소 받기
    Member m1;
    m1 = creatMember();

    //2) 인스턴스에 주소 넘기기
    setMemberValues(m1); // **m1에 저장된 주소를 setMemberValues에 넘긴다. 넘긴 값을 받을 레퍼런스 변수를 선언해야한다.

    printMember(m1); // 메서드를 호출한다 콜 메서드 (실행할때)
  }

  static Member creatMember() {
    //Member인스턴스를 만드는 코드
    Member m = new Member();
    return m; //멤버인스턴스의 주소를 리턴하면 리턴타입을 void에 적어야 한다 =>// 인스턴스 주소 주고 받기

  }

  static void setMemberValues(Member m) { // **m1에 저장된 주소를 setMemberValues에 넘긴다. 넘긴 값을 받을 레퍼런스 변수를 선언해야한다.
    // Member인스턴스에 값을 저장하는 코드
    m.no = 100;
    m.name = "홍길동";
    m.birthYear = 2000;

  }

  static void printMember(Member m) { // 로컬변수 중에 파라미터 => Member m
    //Member인스턴스에 저장한 값을 꺼내는 코드
    System.out.println(m.no);
    System.out.println(m.name);
    System.out.println(m.birthYear);
  }


}
