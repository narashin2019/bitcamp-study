// 과제2: 입력값 n개 중 최소값, 최대값 구하기
package com.eomcs.basic.ex05.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Test2_2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    
    System.out.println("몇 개? ");
    int n = scanner.nextInt();
    int[] arr = new int[n];

    System.out.println("값 입력? ");
    for(int j = 0; j < n; j++) {
      arr[j] = scanner.nextInt();
    }

    System.out.print("----------------");
    System.out.println();
    
    
    scanner.close();

    int max = arr[0];
    int min = arr[0];

    for(int i = 1; i < n; i++) {
      if(arr[i] > max) {
        max = arr[i];
      } else if(arr[i] < min) {
        min = arr[i];
      }
    }

    System.out.println("최소값: "+ min);
    System.out.println("최대값: "+ max);
  }
}


//
//System.out.println("연산자(+,-,*,/)? ");
//String s = scanner.next(); // nextLine은 위에 엔터가 있어서 안됨