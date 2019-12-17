package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class Test01_2_teacher {

  public static void main(String[] args) {

    System.out.println("밑변의 길이? ");

    Scanner keyScan = new Scanner(System.in);
    int len = keyScan.nextInt();

    int count = 1;
    while (count <= len) {
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
