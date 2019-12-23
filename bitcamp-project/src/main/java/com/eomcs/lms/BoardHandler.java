package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class BoardHandler {

  
  static class Board {
    int no;
    String title;
    Date date;
    int viewCount;
  }

  static final int BOARD_SIZE = 100;
  static Board[] boards = new Board[BOARD_SIZE];
  static int boardCount = 0;
  static Scanner keyboard;

  
  static void addBoard() { //(private : 내부에서만 사용 클래스 밖에서 못씀! 따라서 붙이면 안됨)

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

  static void listBoard() {
    for (int i = 0; i < boardCount; i++) { 
      Board b = boards[i]; 
      System.out.printf("%d, %s, %s, %d\n", 
          b.no, b.title, b.date, b.viewCount);
    }
  }
  
}
