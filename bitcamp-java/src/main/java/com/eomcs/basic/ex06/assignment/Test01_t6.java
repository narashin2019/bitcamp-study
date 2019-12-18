package com.eomcs.basic.ex06.assignment;

// 임포트 스캐너 없앰 컨트롤 쉬프트 오

public class Test01_t6 {

  public static void main(String[] args) {



    int width = Console.inputInt(); // 소속이름 바꿔줘 
    
    if (width % 2 == 0)
      width--;

    int spaceSize = width >> 1; //(=> width / 2)
    int line = 0; 
    while (line++ < width) {
      if (line%2 == 0) {
        continue;
      }

      Graphic.drawLine(spaceSize, ' '); 
      spaceSize--;

      Graphic.drawLine(line, '*'); 
      
      System.out.println();
    }



  }//main


//인풋인트 메서드 자름. 



//드로우라인메소드2를 잘라서 Graphic으로 보냄


}//class