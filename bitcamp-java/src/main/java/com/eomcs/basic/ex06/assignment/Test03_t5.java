package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class Test03_t5 {

  public static void main(String[] args) {



    int width = inputInt(); // 메소드 실행하고 리턴된 값을 넣을 변수를 좌측 선언
    
    if (width % 2 == 0)
      width--;

    int spaceSize = width >> 1; //(=> width / 2)
    int line = 0; 
    while (line++ < width) {
      if (line%2 == 0) {
        continue;
      }

      int count = 0;
      while (count++ < spaceSize) {
        System.out.print(" ");
      }
      spaceSize--;

      drawLine(line); // ()안에 line왜 있지..
      
      System.out.println();
    }



  }//main


  static int inputInt() {  
    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변의 길이? "); 
    int width = keyScan.nextInt(); 
    keyScan.close();
    return width;
  }//인풋인트 메서드



  static void drawLine (int length) { 
    int x = 0;             
    while ( x++ < length) {
      System.out.print("*"); 
    }
  }//드로우라인메소드


}//class