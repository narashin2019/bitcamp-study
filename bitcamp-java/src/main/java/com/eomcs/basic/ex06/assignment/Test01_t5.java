package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class Test01_t5 {

  public static void main(String[] args) {

    System.out.print("밑변의 길이? "); // 줄바꿈 없이 옆에 입력하게 print

    Scanner keyScan = new Scanner(System.in); //우항: 설계도에 따라 만든 것 객체, 인스턴스 / 인스턴스 스캐너를 다루는 리모컨 keyScan
  
    int width = keyScan.nextInt(); // 키스캔으로 스캐너를 인트값받도록 조종. 그값을 width로 한다

  

    int line = 0; 
    while (line++ < width) {
      drawLine(line); //2. 드로우라인 메소드의 사용, line값 변하는 동안?
      System.out.println();
    }
    
    keyScan.close();
    
  } // main
  
  
  static void drawLine (int length) { // 1. void=리턴하지 않을때, static 무조건 붙이자고 지금은. / 라인을 그리는 명령어다. 길이를 알아야 해서 길이 나타내는 변수 선언미리 해줌
    int x = 0;             
    while ( x++ < length) {
    System.out.print("*"); 
    }
  }
  
  
}
