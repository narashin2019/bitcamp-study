package com.eomcs.basic.ex06.assignment;
//최종버전을 봅시다
public class Test02_t7 {

  public static void main(String[] args) {

    int width = Console.inputInt(); 

    int line = 0;
    while (line++ < width) { 
      Graphic.drawLine(line);
      System.out.println();
    }
    line--; 

    while (--line > 0) { 
      Graphic.drawLine(line);
      System.out.println();
    }
  } //main 메소드
} //class
