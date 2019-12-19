package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App3_1 {

  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
    
    // 1. 게시글 데이터를 저장할 메모리를 설계한다.
    class Board {
      int no;
      String title;
      Date date;
      int viewCount;
    }
    
    final int SIZE = 100;
    
    // 2. Board 인스턴스의 주소를 담을 레퍼런스 배열을 준비한다. 100개 고정
    Board[] boards = new Board[SIZE];
    
    // 3. Board 인스턴스르 생성하여 레퍼런스 배열에 저장한다. 100개 고정
    for (int i = 0; i < SIZE; i++) {
      boards[i] = new Board();
    }
    
    String response;
    int count = 0;
    
    for (int i = 0; i < 100; i++) {
      
      count++;

      // 4. 레퍼런스배열 [0]부터 시작. 그 주소는 board에 담긴다. 
      // 사용자 입력 카운트가 증가하지 않아도 주소배열과 인스턴스(식판)은 이미 백개다
      Board board = boards[i]; 
      
      System.out.print("번호? ");
      board.no = keyboard.nextInt(); 
      keyboard.nextLine(); 

      System.out.print("제목? ");
      board.title = keyboard.nextLine();

      board.date = new Date(System.currentTimeMillis());

      board.viewCount = 0;


      System.out.println();

      System.out.print("계속 입력하시겠습니까?(Y/n) ");
      response = keyboard.next();
      System.out.println();
      if (!response.equalsIgnoreCase("y")) {
        break;
      }
    }
    
    keyboard.close();
    
    System.out.println();
    
    for (int i = 0; i < count; i++) {
      Board board = boards[i]; // 5. [0]에 저장된 식판이 board다.
      System.out.printf("%d, %s, %s, %d\n", 
          board.no, board.title, board.date, board.viewCount);
    }
      
  }
}

  
  
  
  

