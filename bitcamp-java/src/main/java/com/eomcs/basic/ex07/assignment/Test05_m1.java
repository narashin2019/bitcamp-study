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
public class Test05_m1 {
  public static void main(String[] args) {
    // 사용자로부터 밑변의 길이를 입력 받는다.
    int base = 0;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("밑변 길이?");
    base = keyboard.nextInt();
    keyboard.nextLine();
    
    // 직삼각형을 출력한다.
    printTriangle(base);
    
    keyboard.close();
  }
  
  static void printTriangle(int base) {
    // 코드를 완성하시오!
    if (base == 0)
      return;
    
    int result = printTriangle(++base);
    System.out.print("*");
    
    return result;
    
    
    
  }
}





