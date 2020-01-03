package com.eomcs.oop.ex06.c;

public class C {
  //private 접근범위 :
  // => 현재 클래스에서만 접근가능
  private void m1() {} 

  //(default) 접근 범위:
  // => 현재클래스 + 같은 패키지 소속 클래스
  void m2() {} //default


  //protected 접근 범위: 
  // 현재 클래스 + 같은 패키지 클래스 + 서브클래스만 접근 가능
  protected void m3() {} 

  //public 접근 범위:
  // => 모두
  public void m4() {}
}
