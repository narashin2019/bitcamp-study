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
public class Test05_t1 {
  public static void main(String[] args) {

    // 사용자로부터 밑변의 길이를 입력 받는다.
    Scanner keyScan = new Scanner(System.in); //keyScan객체의 주소를 담는 변수(레퍼런스)보다 리모콘 비유가 좋은 경우
    System.out.print("밑변의 길이? ");
    int base = keyScan.nextInt();
    keyScan.close();
    
    
    
    // 직삼각형을 출력한다.
    printTriangle(base);
    
    
    
  }

  static void printTriangle(int base) {
    // 코드를 완성하시오!
    System.out.println(base);


  }
}





