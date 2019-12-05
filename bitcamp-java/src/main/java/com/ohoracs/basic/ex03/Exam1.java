package com.ohoracs.basic.ex03;

// 리터럴(literal)
// - 자바언어에서 값을 표기하는 문법
  public class Exam1 {
    public static void main(String[] args) {
      // 정수 리터럴
      System.out.println(78); // 10진수 표기법 println은 무조건 10진수로 출력
      // 78이 정수 리터럴이다.
      
      System.out.println(+78);  // 10진수 표기법 
      System.out.println(-78);  // 10진수 표기법

      System.out.println(0116);  // 8진수 표기법 근데 78로 출력 
      System.out.println(-0116);  // 8진수 표기법 근데 -78로 출력 

      System.out.println(0x4e);  // 16진수 표기법 근데 78로 출력
      System.out.println(-0x4e);  // 16진수 표기법 근데 -78로 출력 

      System.out.println(0b01001110);  // 2진수 표기법 근데 78로 출력
      

      // 부동소수점 리터럴

      //논리 리터럴

      // 문자 리터럴

    }
  }