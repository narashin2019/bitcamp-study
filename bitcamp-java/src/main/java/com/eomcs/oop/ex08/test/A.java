package com.eomcs.oop.ex08.test;

// package member class
class A1 {
  
}

// package member class 
class A2 {
  
}
// public 안붙으면 test패키지 안에서만 사용됨.
// public 이 안붙으면 귿이 소스파일과 이름 같을 필요없다.
// 그러나 만약 다른 패키지에서 이 클래스를 쓰게 하려면 public 으로 공개.
// 공개파일은 소스파일과 클래스명이 일치해야 한다. 
// 패키지에 바로 소속된 클래스 : 패키지 멤버 클래스 
// package member class 
public class A {
  
  //nested class클래스 안에 선언된 클래스 2whdfb

  // 1) non-static nested class = inner class
  class X {}
  
  // 2)  static nested class
  static class X2 {}
  
  // 이름이 없는 클래스는 정의하는 순간 인스턴스 만들어야함. 최소 수퍼클래스 이름이라도 지정해야함.
  // 나중에 인스턴스 따로 만들 수 없음. 즉시 만들고 수퍼클래스 이름, 어떤 생성자 부를지 알려줘야함. 
  // anonymous class 
  // 메서드 밖에서도 선언가능 
  Object obj = new Object() {
    @Override
    public String toString() {
      return "익명클래스";
    }
  };
  
  void m() {
    // 메소드 안에 쓰는 변수는 로컬변수
    // 메소드 안에 선언되는 클래스 로컬 클래스
    // local class
    class Y {}
    
    // anonymous class
    Object obj = new Object() {
      @Override
      public String toString() {
        return "익명클래스";
      }
    };
    

  }

}
