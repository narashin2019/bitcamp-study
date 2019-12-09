package com.eomcs.basic.ex03;

//# 정수 리터럴 - 자릿수 표기
//- 정수를 읽기 쉽도록 밑줄(underscore; _)을 숫자 사이에 삽입할 수 있다. 
//
  public class Exam22 {
    public static void main(String[] args) {
   
      // 10진수 리터럴 
      System.out.println(2.035000000);
      System.out.println(2.0_3500_0000);
      System.out.println(2_3500_0000);
      System.out.println(235_000_000);
      System.out.println(2_35_00_0000);
      //System.out.println(_2_35_00_0000); // 맨앞자리, 맨뒷자리 안 됨.
      //System.out.println(2_35_00_0000_);


      // 8진수 리터럴
      System.out.println(01_44);
      System.out.println(0_144); // 된다***
      //System.out.println(_0144); // 맨앞자리, 맨뒷자리 안 됨.
      //System.out.println(0144_);

      // 2진수
      System.out.println(0b0110_0100);
      //System.out.println(0b_0110_0100); // 안된다***
      //System.out.println(_0b0110_0100); // 맨앞자리, 맨뒷자리 안 됨.
      //System.out.println(0b0110_0100_);


      //16진수
      System.out.println(0x00_64);
      //System.out.println(0x_0064); // 안된다***
      //System.out.println(_0x0064); // 맨앞자리, 맨뒷자리 안 됨.
      //System.out.println(0x00_64_);
      
      
      





    }
  }