// 과제2: 다섯 개의 정수 값을 입력 받고, 최소값, 최대값 구하기
// 실행 예)
// 입력? 4 17 -1 6 9
// 최소값: -1
// 최대값: 17
package com.eomcs.basic.ex05.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Test2_1 {
  public static void main(String[] args) {

    System.out.println("입력?");
    
    int[] arr = new int[5];

    Scanner scanner = new Scanner(System.in);

    arr[0] = scanner.nextInt();
    arr[1] = scanner.nextInt();
    arr[2] = scanner.nextInt();
    arr[3] = scanner.nextInt();
    arr[4] = scanner.nextInt();

    System.out.println(Arrays.toString(arr)); // 입력받은 5개 배열 출력하는 코드 

    scanner.close();

    int max = arr[0];
    int min = arr[0];

    for(int i=1; i < 5; i++) {
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


//https://emflant.tistory.com/210 참고