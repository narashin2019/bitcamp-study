package com.eomcs.basic.ex06;

//# 흐름 제어문 - 반복문 while
//
public class Exam3_1 {

  public static void main(String[] args) {

    int count = 0;

    // while (조건) 문장;
    // => 조건이 참인 동안 문장을 계속 실행한다. false가 될 때 까지. false가 안되면 무한루프.
    while (count < 5) 
      System.out.println(count++); //현재 count의 값을 놓고 증가 시키고 출력은 그 전에 놓은 값

    System.out.println("---------------------------");

    // while (조건) {}
    // => 여러 개의 문장을 반복 실행하려면 블록으로 묶어라!
    count = 0;
    while (count < 5) {
      System.out.println(count);
      count++;
    }
    
    
  }
}
