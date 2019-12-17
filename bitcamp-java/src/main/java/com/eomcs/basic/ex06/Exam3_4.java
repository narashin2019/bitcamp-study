package com.eomcs.basic.ex06;

//# 흐름 제어문 - do ~ while 반복문
//
// 먼저실행한다음에 반복할지 말지 결정 = 즉 1번이상 반복
// cf. while문은 반복할지 말지 결정하고 실행 = 즉 0번이상 반복
public class Exam3_4 {
  public static void main(String[] args) {

    int i = 0;

    // 1부터 10까지 출력하기 (이게 더 이쁨)
    do 
      System.out.println(++i);
    while (i < 10);

    System.out.println("---------------------");

    
    
    // 여러 개의 문장을 반복할 때는 블록으로 묶어라!
    i = 0;
    do {
      i += 1;
      System.out.println(i);
    } while (i < 10);
  }
}
