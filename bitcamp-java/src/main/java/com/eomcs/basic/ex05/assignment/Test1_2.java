//과제 1 : 숫자 n개의 합 구하기
package com.eomcs.basic.ex05.assignment;

import java.util.Scanner;

public class Test1_2 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("몇 개? ");
    int n = scanner.nextInt();
    int[] arr = new int[n];

    System.out.println("값 입력하세요. ");
    for(int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }

    System.out.print("----------------");
    System.out.println();

    int sum = 0;

    for(int i = 0; i < n; i++) {
      sum = sum + arr[i];
    }


    System.out.printf("합계는 %d입니다.", sum);

    scanner.close();


  }
}
