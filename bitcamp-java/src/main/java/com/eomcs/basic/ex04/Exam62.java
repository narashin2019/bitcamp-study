package com.eomcs.basic.ex04;

//# 상수 - 변수의 값을 고정하는 방법

public class Exam62 {
  public static void main(String[] args) {
  
    int a;
    a = 100;
    a = 200;
    
    // 한번 저장된 값을 변경하지 못하게 하는 문법
    //=> final 데이터타비 변수;
    final int b;
    b = 100;
    //b = 200; // 컴파일 오류
    
    final int c = 100;
    //c = 200; // 컴파일 오류
    
    // 변수와 상수를 구분하기 위해서
    // => 상수인 경우 이름을 보통 모두 대문자로 작성한다.
    // => 그리고 변수를 선언하는 문자에서 바로 값을 초기화시킨다.
    
  }
}


