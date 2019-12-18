package com.eomcs.basic.ex06.assignment;

//사용자 입력값받는 문장을 메소드로 바꿔본다.
//static int inputInt()로 변환
//com.eomcs.basic.ex06.assignment;Test01.java.08번 참고

import java.util.Scanner;

public class Test01_t5 {

  public static void main(String[] args) {
    
    int width = inputInt();
    int line = 0; 
    while (line++ < width) {
      drawLine(line);
      System.out.println();
    }
  }
  
  // 1.메인메서드에서 빼내서 밑변길이 값받는 것을 static void inputInt(){}로 모음.
  // 리턴값이 width=밑변길이 다.
  static int inputInt() {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변 길이? ");
    int width = keyScan.nextInt();
    keyScan.close();
    return width;
  }
  
  static void drawLine(int length) {
    int x = 0;
    while (x++ < length) {
      System.out.print("*");
    }
  }

}