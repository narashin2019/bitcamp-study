package com.eomcs.basic.ex04;
//# 변수 선언 오류 II
//
public class Exam142 {
  public static void main(String[] args) {
    // 같은 메서드(함수) 안에 같은 이름의 변수를 중복해서 선언할 수 없다.
   
    int i; 

    int j;

    int i; // 컴파일오류: variable i is already defined in method main(String[])
    

  }
}
