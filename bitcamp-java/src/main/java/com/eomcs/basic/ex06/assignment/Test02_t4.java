package com.eomcs.basic.ex06.assignment;
// 만들었던 메소드(코드블럭)을 복사해서 가져왔다.(주의! 메소드 안에 메소드넣으면 안된당)
import java.util.Scanner;

public class Test02_t4 {

  public static void main(String[] args) {

    //1. 밑 변 길이 내놔라 (인풋인트 메소드) 블록을 꼽기 실행할 메소드의 이름(필요값없음 ); 리턴값받는 메소드라 앞에 타입및 변수선언함. 메인에 위드와 인풋인트의 위드를 서로다른 위드
    int width = inputInt();


    int line = 0;
    while (line < width) { 
      line++;
      drawLine(line); //2. 드로우라인블록가서 실행해 line개수만큼 별을 그린다.
      System.out.println();
    }
    line--; 

    while (--line > 0) { 
      int x = 0;             
      while ( x++ < line) { 
        System.out.print("*"); 
      }
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


  static void drawLine (int length) { 
    int x = 0;             
    while ( x++ < length) {
      System.out.print("*"); 
    }
  } //드로우 라인 메소드


}//class
