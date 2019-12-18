package com.eomcs.basic.ex06.assignment;
// 이전 버전에서 만들었던 메소드(코드블럭)을 복사해서 가져왔다.(주의! 메소드 안에 메소드넣으면 안된당)
// 이제 Graphic에 있는 drawLine(line);이라고 소속 클래스명 명시해주고
// main 밖에 있던 drawLine은 지운다.
import java.util.Scanner;

public class Test02_t5 {

  public static void main(String[] args) {

    int width = inputInt();

    int line = 0;
    while (line++ < width) { 
      Graphic.drawLine(line); // 이름 바꿈 그래픽에 소속된 드로우 라인 실행해줘. 
      System.out.println();
    }
    
    line--; 

    while (--line > 0) { 
      Graphic.drawLine(line); // 이름 바꿈 그래픽에 소속된 드로우 라인 실행해줘. 
      System.out.println();
    }
  } //main 메소드


  static int inputInt() {  
    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변의 길이? "); 
    int width = keyScan.nextInt(); 
    keyScan.close();
    return width;
  } //인풋인트 메소드

 //드로우 라인 메소드 지움

}//class
