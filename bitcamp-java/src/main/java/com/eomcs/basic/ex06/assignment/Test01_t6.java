package com.eomcs.basic.ex06.assignment;

//space size변수 추가. 반복문 추가 > 다음단계에서 메소드로 바꿈

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