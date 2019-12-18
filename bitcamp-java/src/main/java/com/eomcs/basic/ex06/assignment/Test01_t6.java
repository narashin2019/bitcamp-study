package com.eomcs.basic.ex06.assignment;

//Console, Graphic 소스파일 따로 생성
//main메서드 밖으로 뺴놨던 drawline과 inputInt를 main메서드 호출할 수 있어서 밖에것은 지우고 main안에 주소적어줌.
//com.eomcs.basic.ex06.assignment;Test01.java.09번 참고

//import java.util.Scanner; // 이제 여기서는 없으니 제거

public class Test01_t6 {

  public static void main(String[] args) {
    
    int width = Console.inputInt(); //Console.inputInt()라고 Console.추가 // 인풋인트의 소속 Console로 바뀌었다고 이름바꿈
    int line = 0; 
    while (line++ < width) {
      Graphic.drawLine(line); //클래스 Graphic 안에 drawLine(line)이 있다고 Graphic.추가 (메서드의 소속바뀜)
      System.out.println();
    }
    
   // 인풋인트 메소드 지움 위에서 콜손로 소속바꿈
   // drawline 메소드 지움 위에서 그래픽으로 소속바꿈
  }
}