package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class Test01_t4 {

  public static void main(String[] args) {

    System.out.print("밑변의 길이? "); // 줄바꿈 없이 옆에 입력하게 print

    Scanner keyScan = new Scanner(System.in); //우항: 설계도에 따라 만든 것 객체, 인스턴스 / 인스턴스 스캐너를 다루는 리모컨 keyScan
  
    int width = keyScan.nextInt(); // 키스캔으로 스캐너를 인트값받도록 조종. 그값을 width로 한다

  
//1)
    int line = 0; // line++ 올리려고 변수초기화 0으로함.
    while (line++ < width) {
      int x = 1;
      while ( x++ <= line) {} // 이자리에 현재 x값을 놓고 x는 x대로 변수 증가시키고 아까 놓은 x를 line가 비교
      System.out.print("*"); 
      }
      System.out.println();
    }


//2)
    int line = 0; // line++ 올리려고 변수초기화 0으로함.
    while (line++ < width) {
      int x = 0;             //
      while ( x++ < line) {} // x 0부터 시작하려고 =뺌 0부터 시작하면 =안붙이면됨./ 1부터 시작하면 =를 붙여야함
      System.out.print("*"); 
      }
      System.out.println();
    }
    
    
    
    keyScan.close();


    
  } // main
}
