package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class Test01_t99 {

  public static void main(String[] args) {

    System.out.println("밑변의 길이? ");

    int base = 0;
    Scanner keyScan = new Scanner(System.in);
    base = keyScan.nextInt();

    int count = 0
        ;
    while (count <= base) {
      int starCnt = 1;
      while (starCnt <= count) {
        System.out.print("*");
        starCnt++;
      }
      System.out.println();
      count++;
    }

    
    
    keyScan.close();


    
  } // main
}
