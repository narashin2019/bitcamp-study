package com.eomcs.basic.ex06.assignment;
//line변수에 붙은 내용 정리 (중간설명)
import java.util.Scanner;

public class Test02_t3 {

  public static void main(String[] args) {

    System.out.println("밑변 길이? ");

    Scanner keyScan = new Scanner(System.in);
    int width = keyScan.nextInt();


    int line = 0; // 1,2,3,4,5,6
    while (line < width) { // 조건식에 후위증감할 것이냐, 아님 참일때 반복문에 라인후위증감할 것이냐.
      line++;
      int x = 0;             
      while ( x++ < line) {
      System.out.print("*"); 
      }
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

    keyScan.close();

  }
}
