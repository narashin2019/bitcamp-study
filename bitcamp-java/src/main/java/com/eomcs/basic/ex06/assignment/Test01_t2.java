package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class Test01_t2 {

  public static void main(String[] args) {

    System.out.print("밑변의 길이? "); // 줄바꿈 없이 옆에 입력하게 print

    Scanner keyScan = new Scanner(System.in); //우항: 설계도에 따라 만든 것 객체, 인스턴스 / 인스턴스 스캐너를 다루는 리모컨 keyScan
  
    int width = keyScan.nextInt(); // 키스캔으로 스캐너를 인트값받도록 조종. 그값을 width로 한다

    // 반복문 중첩으로 쓰는 사례
    // 별을 line(1~width)행 마다 별을 x개씩 출력
    int line = 1; //행이 1부터 width까지 증가한다 라인 변수 바깥에 선언 
    while (line <= width) {
      int x = 1; // 별의 개수 변수 1부터 시작한다. 
      while ( x <= line) {
      System.out.print("*"); // 별은 옆으로 출력 ln을 print로 변경
      x++; // 별의 개수x변수 1씩 증가
      }
      System.out.println();
      line++; // 라인넘버(행)가 1씩 증가
    }

    //바깥 반복문은 몇 째줄인지. 행을 나타냄.
    // n줄은 n개 별
    
    keyScan.close();
    
    
  } // main
} // class
