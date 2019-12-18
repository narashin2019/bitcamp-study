package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class Test02_t3 {

  public static void main(String[] args) {

    // 1. 현재 과제와 유사한 결과를 내는 기존 소르를 가져온다.
    System.out.println("밑변 길이? ");

    Scanner keyScan = new Scanner(System.in);
    int len = keyScan.nextInt();


    int line = 0; // 1,2,3,4,5,6
    while (line < width) { // 조건식에 후위증감할 것이냐, 아님 참일때 반복문에 라인후위증감할 것이냐.
      line++;
      int x = 0;             
      while ( x++ < line) {
      System.out.print("*"); 
      }
      System.out.println();
    }
    line--; //현재 라인이 6까지 와서 반복문 빠져나간 상태. 1번 먼저 빼주고 작업. 5됨**조건문에 ++이 이미실행되기 때문

    while (--line > 0) { //현재 라인이 6까지 왔으니 줄여야함. --line 이 1이 될때까지. --line >= 1  => --line > 0
      int x = 0;             
      while ( x++ < line) { 
      System.out.print("*"); 
      }
      System.out.println();
    }

    
    




    keyScan.close();

  }
}
