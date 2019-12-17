// 과제2: 다섯 개의 정수 값을 입력 받고, 최소값, 최대값 구하기
// 실행 예)
// 입력? 4 17 -1 6 9
// 최소값: -1
// 최대값: 17

package com.eomcs.basic.ex05.assignment;

import java.util.Scanner;

public class Test2_4_teacher4 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);

    //1. if문을 조건연산자? (조건식)? 표현문1 : 표현문2 를 쓴다. **넘 어렵다 다시 공부하자
    System.out.print("입력? ");

    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < 5; i++) {
      int no = keyScan.nextInt();

      min = no < min ? no : min;
      max = no > max ? no : max;
    }


      //2. 최대값과 최소값을 출력합니다.
      System.out.printf("최소값: %d\n", min);
      System.out.printf("최대값: %d\n", max);

      keyScan.close();
    }
  }

