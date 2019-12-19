package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App3_2 {

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
    
    // 2. Board 인스턴스의 주소를 담을 레퍼런스 배열을 미리 준비한다. 100개
    Board[] boards = new Board[SIZE];
    
// 제거 Board 인스턴스르 생성하여 레퍼런스 배열에 저장한다.
//     for (int i = 0; i < SIZE; i++) {
//       boards[i] = new Board();
//     }
    
    String response;
    int count = 0;
    
    for (int i = 0; i < 100; i++) {
      // 3. 사용자 입력한 게시물 데이터를 저장할 메모리를 Board 설계도에 따라 만든다.
      Board board = new Board();
      
      System.out.print("번호? ");
      board.no = keyboard.nextInt(); 
      keyboard.nextLine(); 

      System.out.print("제목? ");
      board.title = keyboard.nextLine();

      board.date = new Date(System.currentTimeMillis());

      board.viewCount = 0;

      // 4. 게시물 데이터가 보관된 Board 인스턴스의 주소를 레퍼런스 배열에 저장한다.
      boards[i] = board;
      
      count++; // 

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
    
    for (int i = 0; i < count; i++) { //입력한 만큼만 꺼낸다.
      Board board = boards[i]; // 5. [0]방에 담긴 주소가 가리키는 식판 board를 출력한다.
      System.out.printf("%d, %s, %s, %d\n", 
          board.no, board.title, board.date, board.viewCount);
    }
      
  }
}

  
  
// 사용자가 입력한 만큼의 인스턴스(객체)를 생성하고 
// 그 인스턴스의 주소를 레퍼런스 배열에 담는다.
// 그래서 레퍼런스 배열은 미리 준비되어 있어야 하고
// 미리 준비한 레퍼런스 배열은 SIZE가 100이다.
  

