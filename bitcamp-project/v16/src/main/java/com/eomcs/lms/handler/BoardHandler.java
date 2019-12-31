package com.eomcs.lms.handler; // 자기가 직접 배열을 만들일이 없음

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Board;

public class BoardHandler {

  BoardList boardList;
  Scanner input;
  
  
  public BoardHandler (Scanner input) {
    this.input = input;
    boardList = new BoardList();
  }
  
  
  public BoardHandler(Scanner input, int capacity) {
    this.input = input;
    boardList = new BoardList(capacity);
  }
  
  
  public void addBoard() { 
    Board board = new Board();

    System.out.print("번호? ");
    board.setNo(input.nextInt()); 
    input.nextLine(); 

    System.out.print("제목? ");
    board.setTitle(input.nextLine());

    board.setDate(new Date(System.currentTimeMillis()));

    board.setViewCount(0);

    this.boardList.add(board); //배식차주소.add (식판주소)
    
    System.out.println("저장하였습니다.");
  }


  public void listBoard() {
    Board[] boards = boardList.toArray();
    for (Board b : boards) { 
      System.out.printf("%d, %s, %s, %d\n", 
          b.getNo(), b.getTitle(), b.getDate(), b.getViewCount());
    }
  }
  
  
  public void detailBoard() {
    System.out.println("게시물 번호? ");
    int no = input.nextInt();
    input.nextLine(); //숫자 뒤에 남은 공백 제거
    
    Board board = boardList.get(no);
    
    if (board == null) {
      System.out.println("게시물 번호가 유효하지 않습니다.");
      return; //메소드의 리턴타입이 void일 경우 그냥 리턴만 쓰면 중단됨
    }
    
    
    System.out.printf("번호: %d\n", board.getNo());
    System.out.printf("제목: %s\n", board.getTitle());
    System.out.printf("등록일: %s\n", board.getDate());
    System.out.printf("조회수: %d\n", board.getViewCount());
  }
  
}

