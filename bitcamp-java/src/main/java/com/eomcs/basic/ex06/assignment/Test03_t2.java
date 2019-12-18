package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

//
public class Test03_t2 {

  public static void main(String[] args) {

    Scanner keyScan = new Scanner(System.in);
  
    System.out.print("밑변의 길이? ");
    int width = keyScan.nextInt();

    int line = 0; 
    while (line++ < width) {
      //추가된 if문 continue사용을 위해 넣은 방법.
      //line이 짝수 일 때 넘어간다.
      //if 문으로 짝수 별 개수는 건너 뛴다. (두칸씩 증가하는게 더 쉬움)
      if (line % 2 == 0) { 
        continue;
      }
      
      int x = 0;             
      while (x++ < line) { 
      System.out.print("*"); 
      }
      System.out.println();
    }
    
    keyScan.close();
 } // main
} //class