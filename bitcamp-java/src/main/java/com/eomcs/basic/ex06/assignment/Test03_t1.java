package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class Test03_t1 {

  public static void main(String[] args) {

    //1. 현재와 가장가까운 test1번 소스를 가져온다.

    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변의 길이? ");
    int width = keyScan.nextInt();

    int line = 0; 
    while (line++ < width) {
      if (line%2 == 0) {
        continue;
      }
      int x = 0;             
      while ( x++ < line) { 
      System.out.print("*"); 
      }
      System.out.println();
    }
    
    keyScan.close();
 } // 메인
}