package com.eomcs.basic.ex06.assignment;
//inputInt()와 drawLine(line);를 main 메소드 밖으로 뺀다.
import java.util.Scanner;

public class Test03_t4 {

  public static void main(String[] args) {
    
    int width = inputInt(); //메서드 밑에 있음 // 메소드 실행하고 리턴된 값을 넣을 변수를 좌측 선언
    
    //4. 짝수길이 입력 시 공백생기는 문제 해결
    if (width % 2 == 0)
      width--;
    
    int spaceSize = width >> 1;
    int line = 0; 
    while (line++ < width) {
      if (line % 2 == 0) {
        continue;
      }
      
      int count = 0;
      while (count++ < spaceSize) {
        System.out.print(" ");
      }
      spaceSize--;
      
      drawLine(line); //메서드 밑에 있음
      System.out.println();
    }
    
  }//main메서드
  
  static int inputInt() {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변 길이? ");
    int width = keyScan.nextInt();
    keyScan.close();
    return width;
  } // inputInt()메섣,
  
  static void drawLine(int length) {
    int x = 0;
    while (x++ < length) {
      System.out.print("*");
    }
  } //drawLine(int length)메서드
  
}// class
  


//4. 밑변의 길이? 6 짝수일때 앞에 공백생기는 문제
//     *
//    ***
//   *****
//  문제