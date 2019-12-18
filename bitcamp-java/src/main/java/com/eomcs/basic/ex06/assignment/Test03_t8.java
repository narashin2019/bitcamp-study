package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class Test03_t8 {

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

      Graphic.drawLine(spaceSize, ' '); //spaceSize만큼 공백을 찍는다. //소속 이름 붙임Graphic
      spaceSize--;

      Graphic.drawLine(line, '*'); // (line만큼 *을 찍는다  //소속 이름 붙임Graphic
      
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



//드로우라인메소드2를 잘라서 Graphic으로 보냄


}//class