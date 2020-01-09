// 사용자 입력을 받는 코드를 별도의 메서드로 분리한다.
//
package com.eomcs.lms.handler; 

import java.sql.Date;
import com.eomcs.lms.domain.Board;
import com.eomcs.util.ArrayList;
import com.eomcs.util.Prompt;

public class BoardHandler {

  ArrayList<Board> boardList; 
  Prompt prompt;

  public BoardHandler (Prompt prompt) {
    this.prompt = prompt;
    boardList = new ArrayList<>();// <Board>에서 Board 생략가능 <>는 남기고
  }

  public BoardHandler(Prompt prompt, int capacity) {
    this.prompt = prompt;
    this.boardList = new ArrayList<>(capacity); 
  }


  public void addBoard() { 
    Board board = new Board();

    board.setNo(prompt.inputInt("번호? ")); 
    board.setTitle(prompt.inputString("내용? "));
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
    int index = indexOfBoard(prompt.inputInt("번호? ")); // 임시변수도 없앰

    if (index == -1) {
      System.out.println("게시글 번호가 유효하지 않습니다.");
      return;
    }


    Board board = this.boardList.get(index);
    
    System.out.printf("번호: %d\n", board.getNo());
    System.out.printf("내용: %s\n", board.getTitle());
    System.out.printf("등록일: %s\n", board.getDate());
    System.out.printf("조회수: %d\n", board.getViewCount());
  }


  public void updateBoard() {
    int index = indexOfBoard(prompt.inputInt("번호? ")); // 임시변수도 없앰

    if (index == -1) {
      System.out.println("게시글 번호가 유효하지 않습니다.");
      return;
    }


    Board oldBoard = this.boardList.get(index);
    Board newBoard = new Board();
    
    newBoard.setNo(oldBoard.getNo());
    newBoard.setViewCount(oldBoard.getViewCount());
    newBoard.setDate(new Date(System.currentTimeMillis()));
    
    newBoard.setTitle(prompt.inputString(
        String.format("내용(%s)? ", oldBoard.getTitle()), 
        oldBoard.getTitle())); 

    if (oldBoard.equals(newBoard)) {
      System.out.println("게시글 변경을 취소했습니다.");
      return;
    }



    this.boardList.set(index, newBoard);
    System.out.println("게시글을 변경했습니다.");
  }


  public void deleteBoard() {
    int index = indexOfBoard(prompt.inputInt("번호? ")); // 임시변수도 없앰

    if (index == -1) {
      System.out.println("게시글 번호가 유효하지 않습니다.");
      return;
    }


    this.boardList.remove(index);

    System.out.println("게시글을 삭제했습니다.");

  }

 private int indexOfBoard(int no) { // 내부에서만 쓸거니까 private로. 임시변수도 없앰.
   for (int i = 0; i < this.boardList.size(); i++) {
     if (this.boardList.get(i).getNo() == no) {
       return i;
     }
   }
   return -1;
 }


}

