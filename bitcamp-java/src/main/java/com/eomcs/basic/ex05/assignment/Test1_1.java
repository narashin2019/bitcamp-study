//과제 1 : 숫자 s1~s2까지의 합 구하기
package com.eomcs.basic.ex05.assignment;

import java.util.Scanner;

public class Test1_1 {
  public static void main(String[] args) {

    System.out.println("입력?");
    
    Scanner scanner = new Scanner(System.in);

    int u1 = scanner.nextInt();
    int u2 = scanner.nextInt();

    System.out.printf("%d, %d\n", u1, u2); // 입력받은 숫자 출력

    scanner.close();

    int sum = 0;

    if(u1<u2) {
      for(int i=u1; i<=u2; i++) {
        sum = sum + i;
      }
      System.out.printf("%d에서 %d까지의 합은 %d입니다.", u1, u2, sum);
    }


    if(u2<u1) {
      for(int i=u2; i<=u1; i++) {
        sum = sum + i;
      }
      System.out.printf("%d에서 %d까지의 합은 %d입니다.", u2, u1, sum);
    }



  }
}
