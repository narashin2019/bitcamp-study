package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Board;

public class BoardHandler3 {


  public static Scanner keyboard;

  static final int BOARD_SIZE = 100;
  static Board[] boards = new Board[BOARD_SIZE];
  static int boardCount = 0;
  
  
  public static void addBoard() { //(private : 내부에서만 사용 클래스 밖에서 못씀! 따라서 붙이면 안됨)

    Board board = new Board();

    System.out.print("번호? ");
    board.no = keyboard.nextInt(); 
    keyboard.nextLine(); 

    System.out.print("제목? ");
    board.title = keyboard.nextLine();

    board.date = new Date(System.currentTimeMillis());

    board.viewCount = 0;

    boards[boardCount++] = board;

    System.out.println("저장하였습니다.");
  }

  public static void listBoard() {
    for (int i = 0; i < boardCount; i++) { 
      Board b = boards[i]; 
      System.out.printf("%d, %s, %s, %d\n", 
          b.no, b.title, b.date, b.viewCount);
    }
  }
  
  
  public static void detailBoard() {
    System.out.println("게시물 번호? ");
    int no = keyboard.nextInt();
    keyboard.nextLine(); //숫자 뒤에 남은 공백 제거
    
    Board board = null;
    for (int i = 0; i < boardCount; i++) {
      if (boards[i].no == no) {
        board = boards[i];
        break;
      }
    }
    
    if (board == null) {
      System.out.println("게시물 번호가 유효하지 않습니다.");
      return; //메소드의 리턴타입이 void일 경우 그냥 리턴만 쓰면 중단됨
    }
    
//    Board board = boards[no];
    
    System.out.printf("번호: %d\n", board.no);
    System.out.printf("제목: %s\n", board.title);
    System.out.printf("등록일: %s\n", board.date);
    System.out.printf("조회수: %d\n", board.viewCount);
  }
  
}
