package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class Test01_t3 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);

    System.out.print("밑변 길이? "); 
    int width = keyScan.nextInt();
  
////1)
//    int line = 0; // line++를 while의 (조건식)에 넣으려고 변수 초기화 0으로함.
//    while (line++ < width) {
//      int x = 1;
//      while ( x++ <= line) { // 현재 x값 1을 놓고 x는 x대로 변수 증가시키고 아까 놓은 x(1)과 line을 비교
//      System.out.print("*"); 
//      }
//      System.out.println();
//    }


//2)
    int line = 0;
    while (line++ < width) {
      int x = 0;             //
      while ( x++ < line) { // x 0부터 시작하려고 =뺌 0부터 시작하면 =안붙이면됨. 1부터 시작하면 <=임.
      System.out.print("*"); 
      }
      System.out.println();
    }
    
    keyScan.close();
    
    
  } // main
} // class
