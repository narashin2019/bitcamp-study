package com.eomcs.basic.ex06.assignment;
//Console, Graphic 클래스에서 메서드 불러오기, main밖에거 지우기
//삭제import java.util.Scanner;

public class Test03_t6 {

  public static void main(String[] args) {

    int width = Console.inputInt(); // 소속클래스 명시

    if (width % 2 == 0)
      width--;

    int spaceSize = width >> 1; //(=> width / 2)
    int line = 0; 
    while (line++ < width) {
      if (line%2 == 0) {
        continue;
      }

      Graphic.drawLine(spaceSize, ' '); //소속클래스 명시.
      spaceSize--;

      Graphic.drawLine(line, '*'); //소속클래스 명시.
      System.out.println();
    }
  }//main
  
  //inputInt, drawLine메서드 삭제 main내부에서 클래스로 호출
}//class