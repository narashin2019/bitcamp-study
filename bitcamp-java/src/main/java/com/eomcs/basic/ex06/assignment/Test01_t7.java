package com.eomcs.basic.ex06.assignment;
// 임포트 스캐너 뺌
public class Test01_t7 {

  public static void main(String[] args) {


    int width = Console.inputInt(); // 인풋인트의 소속 바뀌었다고 Console로 바뀌었다고 이름바꿈
    int line = 0; 
    while (line++ < width) {
      Graphic.drawLine(line); //클래스 그래픽소속으로 바뀌엇다고 이름바꿈
      System.out.println();
    }


  } // main


//인풋인트 메소드 지움 콜손로 소속바꿈


// drawline지움


}// class
