package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class Test02_t2 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);

    System.out.print("밑변 길이? ");
    int width = keyScan.nextInt();


    int line = 0; // 1,2,3,4,5,6
    while (line++ < width) { //line++을 조건안으로 넣은 것.
      int x = 0;             
      while (x++ < line) {
      System.out.print("*"); 
      }
      System.out.println();
    }
    //현재 라인이 6까지 와서 반복문 빠져나간 상태. 1번 먼저 빼주고 작업. 5됨** 조건문에 ++이 이미실행되기 때문
    line--;

    //라인수가 1이 될떄까지 줄여야. --line 이 1이 될때까지. --line >= 1  == --line > 0
    while (--line > 0) { 
      int x = 0;             
      while (x++ < line) { 
      System.out.print("*"); 
      }
      System.out.println();
    }

    keyScan.close();

  }
}
