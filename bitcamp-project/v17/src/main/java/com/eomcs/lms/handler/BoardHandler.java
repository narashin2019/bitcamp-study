package com.eomcs.lms.handler; 

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Board;

public class BoardHandler {

 
  ArrayList boardList; 
  Scanner input;
  
  
  public BoardHandler (Scanner input) {
    this.input = input;
    boardList = new ArrayList();
  }
  
  public BoardHandler(Scanner input, int capacity) {
    this.input = input;
    boardList = new ArrayList(capacity);
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

    this.boardList.add(board); 
    
    System.out.println("저장하였습니다.");
  }


  public void listBoard() {
    Object[] arr = boardList.toArray();
    for (Object obj : arr) { 
      Board b = (Board) obj; // 실제 쓰기전에 동물인데 개라고 정확히 말해줌. 그러니까 b는 게시판이라 생각하고 호출해주렴.
      System.out.printf("%d, %s, %s, %d\n", 
          b.getNo(), b.getTitle(), b.getDate(), b.getViewCount());
    }
  }
  
  
  public void detailBoard() {
    System.out.println("게시물 인덱스? ");
    int index = input.nextInt();
    input.nextLine(); //숫자 뒤에 남은 공백 제거
    
    Board board = (Board) this.boardList.get(index); // 형변환으로 실제 데이터 타입알려줘서 꺼낼 수 있게 알려줌.
    
    if (board == null) {
      System.out.println("게시물 인덱스가 유효하지 않습니다.");
      return;
    }
    
    System.out.printf("번호: %d\n", board.getNo());
    System.out.printf("제목: %s\n", board.getTitle());
    System.out.printf("등록일: %s\n", board.getDate());
    System.out.printf("조회수: %d\n", board.getViewCount());
  }
  
}

