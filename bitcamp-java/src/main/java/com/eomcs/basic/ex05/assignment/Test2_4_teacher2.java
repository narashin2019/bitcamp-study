// 과제2: 다섯 개의 정수 값을 입력 받고, 최소값, 최대값 구하기
// 실행 예)
// 입력? 4 17 -1 6 9
// 최소값: -1
// 최대값: 17

package com.eomcs.basic.ex05.assignment;

import java.util.Scanner;

public class Test2_4_teacher2 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    
    //1. 사용자에게 입력받은 입력 값을 배열로 바꿉니다. 
    System.out.print("입력? ");
    int no[] = new int[5];
    
    for (int i = 0; i < 5; i++) {
      no[i] = keyScan.nextInt();
    }
    
    //2. if문을 for문으로 바꿉니다. 조건문을 반복문으로!
    int min = no[0];
    int max = no[0];
    
    for (int i = 1; i < 5; i++) {
      if (no[i] < min) {
        min = no[i];
      } else if (no[i] > max) {
        max = no[i];
      }
    }
    
    
    //2. 최대값과 최소값을 출력합니다.
    System.out.printf("최소값: %d\n", min);
    System.out.printf("최대값: %d\n", max);

    keyScan.close();
  }
}

