package com.eomcs.basic.ex06.assignment;
//임포트 스캐너 없앰
public class Test02_t6 {

  public static void main(String[] args) {

    int width = Console.inputInt(); // 소속이름 바꿔주고 


    int line = 0;
    while (line < width) { 
      line++;
      Graphic.drawLine(line); // 이름 바꿈 그래픽에 소속된 드로우 라인 실행해줘. 
      System.out.println();
    }
    line--; 

    while (--line > 0) { 
      Graphic.drawLine(line); // 이름 바꿈 그래픽에 소속된 드로우 라인 실행해줘. 
      System.out.println();
    }



  } //main 메소드


//인풋인트 메소드 지움


//드로우 라인 메소드 지움


}//class
