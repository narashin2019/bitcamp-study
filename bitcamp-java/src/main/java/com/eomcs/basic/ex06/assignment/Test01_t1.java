package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class Test01_t1 {

  public static void main(String[] args) {

    System.out.print("밑변의 길이? "); // 줄바꿈 없이 옆에 입력하게 print

    Scanner keyScan = new Scanner(System.in); //우항: 설계도에 따라 만든 것 객체, 인스턴스 / 인스턴스 스캐너를 다루는 리모컨 keyScan
  
    int width = keyScan.nextInt(); // 키스캔으로 스캐너를 인트값받도록 조종. 그값을 width로 한다


    // 별을 입력받은 width수 만큼 행을 실행 할 것이고 각 행에 "*"표시. 
    int i = 0;
    while(i < width) {
      System.out.println("*");
      i++;
    }
    
    keyScan.close();
    
  } // main
} // class

/*

결과값)

밑변의 길이? 5
*
*
*
*
*


*/
