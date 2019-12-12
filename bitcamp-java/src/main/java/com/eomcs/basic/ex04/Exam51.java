package com.eomcs.basic.ex04;


public class Exam51 {
  public static void main(String[] args) {
    // 논리 변수
    boolean b1, b2;

    b1 = true; // 내부적으로는1
    b2 = false; // 내부적으로는 0

    System.out.println(b1);
    System.out.println(b2);

    //b1 = 1; // 컴파일오류
    //b2 = 0; // 컴파일오류

    //int i  = b1; // 컴파일오류 불린은 인스에 못담는다


  }
}