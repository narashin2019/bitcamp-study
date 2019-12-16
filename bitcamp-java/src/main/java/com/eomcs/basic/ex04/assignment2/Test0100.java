package com.eomcs.basic.ex04.assignment2;

import java.util.Scanner;

public class Test0100 {
  public static void main(String[] args) {

    Scanner keyScan = new Scanner(System.in);

    System.out.print("값1? ");
    int a = keyScan.nextInt();

    System.out.print("값2? ");
    int b = keyScan.nextInt();

    System.out.print("연산자(+,-,*,/)? ");
    String op = keyScan.next();

    keyScan.close();

    int result = 0;

    if (op.equals("+")) {
      result = a + b;
    } else if (op.equals("-")) {
      result = a - b;
    } else if (op.equals("*")) {
      result = a * b;
    } else if (op.equals("/")) {
      result = a / b;
    } else {
      System.out.println("=> 사용할 수 없습니다");
      return; // 메인 을 끝내는 명령어
    }

    System.out.printf("=> %d %s %d = %d\n", a, op, b, result);

  }
}


// 이프엘스밖에 없다
// 이프 엘스는 한문장
// 엘스 이프가 탄생한 단계
// 베이직언어 말고는 엘스 이프 없다.

// 100/3 은 3이 나와! 
// 100-200는 0이 나와!
