package com.eomcs.basic.ex06;

//# 흐름 제어문 - for 반복문
//
public class Exam4_1 {
  public static void main(String[] args) {
    // for (변수선언 및 초기화; 조건; 증감문) 문장;
    // for (변수선언 및 초기화; 조건; 증감문) {문장1; 문장2; ...}

    // for 문의 전형적인 예
    for (int i = 1; i <= 5; i++) 
      System.out.println(i);

    // for문에서 선언한 변수는 그 for문 안에서만 사용할 수 있다.
    //System.out.println(i); // 컴파일 오류!
    
    System.out.println("----------------------");
    
    for (int i = 1; i <= 5;) {
      System.out.println(i);
      i++; 
    }

    System.out.println("----------------------");
    
    int i = 1; // 초기화식에 변수항목을 밖으로 뻄
    for (; i <= 5;) {
      System.out.println(i);
      i++; 
    }
    System.out.println(i); // for문 밖에서도 i변수 사용이 가능하다.
    
    System.out.println("----------------------");
    //비워놔도 되지만 ()안에 ;빠뜨리면 안됨.
   
    i = 1;
    for (;;) {
      if (i > 5)
        break;
      System.out.println(i);
      i++; 
    }
    // 이방식으로 할꺼라면 while문으로 쓰고 말지..
    
  }
}

