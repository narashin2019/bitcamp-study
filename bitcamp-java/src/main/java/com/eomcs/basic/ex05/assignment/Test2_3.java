// 과제2: 입력값 중 최소값, 최대값 구하기
package com.eomcs.basic.ex05.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Test2_3 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("몇 개? ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    
    System.out.println("입력? ");
    for(int i=0; i<n; i++) {
      arr[i] = sc.nextInt();
    }
    
    Arrays.sort(arr);
    
    System.out.println("--------------------");
    System.out.println("최소값: " + arr[0]);
    System.out.println("최대값: " + arr[n-1]);
    
    sc.close();


 }
}


//https://emflant.tistory.com/210 참고