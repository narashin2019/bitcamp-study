// 과제 1 : 계산기 애플리케이션을 작성하라.
// - 실행
// 값1? 10
// 값2? 20
// 연산자(+,-,*,/)? +
// => 10 + 20 = 30 
//
package com.eomcs.basic.ex04.assignment2;

import java.util.Scanner;

public class Test01 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    
    System.out.println("값1? ");
    int i1 = scanner.nextInt();
    
    System.out.println("값2? ");
    int i2 = scanner.nextInt();
    
    System.out.println("연산자(+,-,*,/)? ");
    String s = scanner.next(); // nextLine은 위에 엔터가 있어서 안됨
    
    scanner.close();
    
    switch(s) {
      case "+" :
        System.out.printf("=> %d %s %d = %d", i1, s, i2, (i1+i2));
        break;

      case "-" :
        System.out.printf("=> %d %s %d = %d", i1, s, i2, (i1-i2));
        break;

      case "*" :
        System.out.printf("=> %d %s %d = %d", i1, s, i2, (i1*i2));
        break;

      case "/" :
        System.out.printf("=> %d %s %d = %d", i1, s, i2, (i1/i2));
        break;
        
      default :
        System.out.println("0");
    }

  }

}