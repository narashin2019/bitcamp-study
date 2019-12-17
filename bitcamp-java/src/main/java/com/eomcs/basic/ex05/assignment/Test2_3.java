// 과제2: n개 입력값 중 최소값, 최대값 구하기
package com.eomcs.basic.ex05.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Test2_3 {
  public static void main(String[] args) {
    
    //1. 사용자에게 배열 몇개 입력받을지 물어본다
    Scanner sc = new Scanner(System.in);
    System.out.println("몇 개? ");
    int n = sc.nextInt();
    
    //2. 사용자가 입력한 개수n만큼 배열을 생성한다.
    int[] arr = new int[n];
    
    System.out.println("입력? ");
    for(int i=0; i<n; i++) {
      arr[i] = sc.nextInt();
    }
    
    //3. 생성된 배열을 순차정렬한다.
    Arrays.sort(arr);
    
    //4. 최대 최소를 출력한다.
    System.out.println("--------------------");
    System.out.println("최소값: " + arr[0]);
    System.out.println("최대값: " + arr[n-1]);
    
    sc.close();


 }
}


//https://emflant.tistory.com/210 참고