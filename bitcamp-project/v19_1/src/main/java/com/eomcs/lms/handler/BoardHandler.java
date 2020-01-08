//게시글 인덱스로 객체를 찾는 대신에 
//게시글을 입력할 때 등록한 번호로 객체를 찾도록 변경한다.

package com.eomcs.lms.handler; 

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Board;
import com.eomcs.util.ArrayList;

public class BoardHandler {

  ArrayList<Board> boardList; 
  Scanner input;
  
  
  public BoardHandler (Scanner input) {
    this.input = input;
    boardList = new ArrayList<>(); // <Board>보드 생략가능 <>는 놔두고
  }
  
  public BoardHandler(Scanner input, int capacity) {
    this.input = input;
    this.boardList = new ArrayList<>(capacity); // <Board>에서 Board 생략가능
  }

//**생성자 개수 다른 이유:
//-2개로 해도 되고 하나만 해도 된다.
//-차이: 위에것은 디폴트값 2개 생성
//-       아래 것은 사용자가 입력한 값이 최소 생성갯수가 된다. 

  
  public void addBoard() { 
    Board board = new Board();

    System.out.print("번호? ");
    board.setNo(input.nextInt()); 
    input.nextLine(); 

    System.out.print("내용? ");
    board.setTitle(input.nextLine());

    board.setDate(new Date(System.currentTimeMillis()));

    board.setViewCount(0);

    this.boardList.add(board); 
    
    System.out.println("저장하였습니다.");
  }


  public void listBoard() {
    // BoardList의 보관된 값을 받을 배열을 준비한다.    
    Board[] arr = new Board[this.boardList.size()];
    
    //toArray()에게 빈 배열을 넘겨서 복사 받는다.
    this.boardList.toArray(arr);
    
    for (Board b : arr) { 
      System.out.printf("%d, %s, %s, %d\n", 
          b.getNo(), b.getTitle(), b.getDate(), b.getViewCount());
    }
  }
  
  
  public void detailBoard() {
    System.out.println("게시글 인덱스? ");
    int index = input.nextInt();
    input.nextLine(); //숫자 뒤에 남은 공백 제거
    
    Board board = this.boardList.get(index); 
    
    if (board == null) {
      System.out.println("게시글 인덱스가 유효하지 않습니다.");
      return;
    }
    
    System.out.printf("번호: %d\n", board.getNo());
    System.out.printf("내용: %s\n", board.getTitle());
    System.out.printf("등록일: %s\n", board.getDate());
    System.out.printf("조회수: %d\n", board.getViewCount());
  }
  
  
  public void updateBoard() {
    System.out.println("게시글 인덱스? ");
    int index = input.nextInt();
    input.nextLine(); //숫자 뒤에 남은 공백 제거
    
    Board oldBoard = this.boardList.get(index); 
    
    if (oldBoard == null) {
      System.out.println("게시글 인덱스가 유효하지 않습니다.");
      return;
    }
    
    System.out.printf("내용(%s)? ", oldBoard.getTitle());
    String title = input.nextLine();
    
    if (title.length() == 0) {
      System.out.println("게시글 변경을 취소했습니다.");
      return;
    }
    
    Board newBoard = new Board();
    newBoard.setNo(oldBoard.getNo());
    newBoard.setViewCount(oldBoard.getViewCount());
    newBoard.setTitle(title);
    newBoard.setDate(new Date(System.currentTimeMillis()));

    this.boardList.set(index, newBoard);
    
    System.out.println("게시글을 변경했습니다.");
  }
  
  
  public void deleteBoard() {
    System.out.println("게시글 인덱스? ");
    int index = input.nextInt();
    input.nextLine(); //숫자 뒤에 남은 공백 제거
    
    Board board = this.boardList.get(index);
    
    if (board == null) {
      System.out.println("게시글 인덱스가 유효하지 않습니다.");
      return;
    }
    
    
    this.boardList.remove(index);
    
    System.out.println("게시글을 삭제했습니다.");
    
  }
  
  
  
  
}
