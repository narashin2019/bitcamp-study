
package com.eomcs.lms.handler; 

import java.sql.Date;
import com.eomcs.lms.domain.Board;
import com.eomcs.util.AbstractList;
import com.eomcs.util.List;
import com.eomcs.util.Prompt;

public class BoardHandler {

//목록을 다루는 객체를 지정할 때,
 // => 특정 클래스(예: AbstractList, LinkedList, ArrayList)를 지정하는 대신에,
 // => 사용 규칙(예: List)을 지정함으로써 
 // 더 다양한 타입의 객체로 교체할 수 있게 만든다.
 // => List 사용 규칙을 구현한 객체라면 어떤 클래스의 객체든지 사용할 수 있다.
 // 결국 유지보수를 더 유연하게 하기 위함이다.
  List<Board> boardList; 
  Prompt prompt;

  public BoardHandler (Prompt prompt, List<Board> list) { //참조변수는 수퍼클래스List로 하면 서브클래스ArrayList, LinkedList 다 넘겨받을 수 있다.
 // list 파라미터는 List 인터페이스를 구현한 객체를 받는다.
    this.prompt = prompt;
    this.boardList = list;
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

