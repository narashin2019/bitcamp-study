package com.eomcs.basic.ex07.assignment;

import java.util.Scanner;

// 과제: 재귀호출을 이용하여 직삼각형을 출력하라.
// 실행)
// 밑변의 길이? 5
// *
// **
// ***
// ****
// *****
//
public class Test05_t2 {
  public static void main(String[] args) {

    // 사용자로부터 밑변의 길이를 입력 받는다.
    Scanner keyScan = new Scanner(System.in); //keyScan객체의 주소를 담는 변수(레퍼런스) 보다 리모콘 비유가 좋은 경우
    System.out.print("밑변의 길이? ");
    int base = keyScan.nextInt();
    keyScan.close();
    
    
    
    // 직삼각형을 출력한다.
    printTriangle(base);
    
    
    
  }

  static void printTriangle(int base) {
    // 코드를 완성하시오!
    
    if (base == 0)
      return; // 밑변이 0 이면 아무것도 안하고 돌아간다.
    
    printTriangle(base-1);

    for (int i = 0; i < base; i++) {
      System.out.print("*");
    }
    System.out.println();

  }
// for문과 재귀호출 문장 위치 바꾸면 결과가 달라진다.*******중요
// 지금은 아래쪽부터 들어가서 작업하고 점차 올라오는 경우
}





