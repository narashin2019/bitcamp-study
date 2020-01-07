package com.eomcs.oop.ex08.test;
//#클래스 구성 5개 / static이 붙은것과 아닌것. 
public class B {
  // field
  static int a; // 클래스 필드 = 스태틱 필드. 클래스가 메모리에 로딩될때 자동 올라감.
  String v;     // 인스턴스 필드 = 논스태틱필드. new로 생성시 힙에 메모리 생성
  
  //method
  static void m1() {}  // 클래스 메서드 = 스태틱메서드 , 클래스 이름으로 호출
  int m2() {return 0;} //인스턴스 메서드 = 논스태틱메서느, 레퍼런스로 호출

  // initializer block
  static {} // 스태틱블록
  {}        // 인스턴스 블록
  
  //constructor
  B() {}
  
  //nested class
  static class B1 {} // static nested class
  class B2 {} // non-static nested class = inner class
  
  
  
}
