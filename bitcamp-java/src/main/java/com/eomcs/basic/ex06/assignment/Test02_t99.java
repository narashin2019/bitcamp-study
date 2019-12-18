package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class Test02_t99 {

  public static void main(String[] args) {

    System.out.println("밑변 길이? ");

    Scanner keyScan = new Scanner(System.in);
    int len = keyScan.nextInt();

    int count = 1;
    while (count <= len) { //바깥while문 1~5=len 행
      int starCnt = 1;  // 별 개수 1행1개 2행2개 3행3개 4행4개 5행5개, 별개수 n행일때 1~n개
      while (starCnt <= count) { //별1개일떄 <= 카운트1행
        System.out.print("*"); // 별찍음
        starCnt++; // 별개수 1증가 별개수1개+1 -> 별개수2개
      }             //별2개인데 카운트1행이야 아직 조건식 false
      System.out.println(); // 다음 줄로 갑니다.
      count++; //카운드1행+1 -> 2행이된당.
    }

    //4      5  
    count = len - 1;
    while (count >= 1) {
      int starCnt = 1;
      while (starCnt <= count) {
        System.out.print("*");
        starCnt++;
      }
      System.out.println();
      count--;
    }


    keyScan.close();

  }
}
