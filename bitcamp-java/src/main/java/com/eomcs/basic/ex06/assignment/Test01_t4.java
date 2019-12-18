package com.eomcs.basic.ex06.assignment;

// line(별)을 그리는 반복문 문장을 메소드로 바꿔본다.
// static void drawLine(int length)로 변환

import java.util.Scanner;

public class Test01_t4 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    
    System.out.print("밑변의 길이? "); 
    int width = keyScan.nextInt();
    
// 2. 드로우라인 메소드의 사용, 
//    (line)=매개변수(여러 개 일 수 있음. cf.리턴값은 언제나 하나여야함. 한 메소드는 하나의 역할을 하기 때문에)
    int line = 0; 
    while (line++ < width) {
      drawLine(line); 
      System.out.println();
    }
    
    keyScan.close();
  } // main
  
// 1. static 무조건 붙이자고 지금은
//    void=리턴하지 않을 때=sysout은 값을 리턴하는 문장이 아님
//    void의 반대 = 값을 리턴할 때 리턴값의 타입을 적음.
//    라인을 그리는 명령어들을 모았다. 그릴 라인의 길이를 알아야 해서 길이 나타내는 변수 length선언 미리 해줌
  static void drawLine(int length) {
    int x = 0;             
    while (x++ < length) {
    System.out.print("*"); 
    }
  }
  
  
}
