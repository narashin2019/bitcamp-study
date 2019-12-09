package com.eomcs.basic.ex03;

// 리터럴(literal)
// - 자바언어에서 값을 표기하는 문법

// 정수 리터럴 - 다양한 기수법으로 정수를 표현

public class Exam21 {
    public static void main(String[] args) {
      // 10진수 리터럴 
      // 코드에서 일반적으로 정수 값 표현할 떄 사용
      System.out.println(100);

      // 8진수 리터럴
      // 코드 작성시 잘 사용 안함
      // 0으로 시작
      System.out.println(0144);

      // 2진수
      // 메모리 상태를 직설적으로 보여주고 싶을 떄
      // 0b or 0B
      // 숫자 앞에 0있어도 없어도 됨.
      System.out.println(0b01100100);
      System.out.println(0B01100100);
      System.out.println(0b1100100);
      System.out.println(0B1100100);

      // 16진수
      // 2진수를 간결하게 표현하기 위해 사용
      // 0x or 0X로 시작
      // 숫자 앞에 0있어도 없어도 됨.
      System.out.println(0x64);
      System.out.println(0X64);
      System.out.println(0x064);
      System.out.println(0X064);
      





    }
  }