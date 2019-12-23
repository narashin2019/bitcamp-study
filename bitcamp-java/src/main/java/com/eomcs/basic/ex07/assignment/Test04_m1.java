package com.eomcs.basic.ex07.assignment;

import java.util.Scanner;

// 과제: 재귀호출을 이용하여 n! 을 계산하라.
// 실행)
// 입력? 5
// 5! = 1 * 2 * 3 * 4 * 5 = 120
//
public class Test04_m1 {
  public static void main(String[] args) {
    // 사용자로부터 정수 값을 입력 받는다.
    int n = 0;
  
    Scanner keyboard = new Scanner(System.in);
    System.out.println("양의 정수 값 1개를 입력하시오.");
    n = keyboard.nextInt();
    keyboard.nextLine(); // nextInt() 후에 남아 있는 줄바꿈 기호를 제거한다.
    
    // n! 을 계산한다.
    int result = factorial(n);
    
    // 결과 값을 출력한다.
    
    System.out.printf("%d! = ", n);
    for(int d = n; d > 1 ; d--) {
      System.out.print(d);
      System.out.print(" * ");
    }
    System.out.printf("%d = %d\n", n/n, result);
    
    keyboard.close();
  }
  
  static int factorial(int n) {
    if (n == 1)
      return 1;
    
    int result = n*factorial(n-1);
    return result ;
  }
}

