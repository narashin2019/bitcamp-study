package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Board;

public class BoardHandler {


  // 인스턴스 필드
  // => new 명령을 실행해야만 생성되는 변수이다. (클래스가 로딩되도 존재하지 않음)
  // => 개별적으로 관리되어야 하는 값일 경우 인스턴스 필드로 선언한다. (static을 뺀다)
  Board[] boards = new Board[BOARD_SIZE];
  int boardCount = 0;
  
  // 클래스 필드
  // => Method Area에 클래스 코드가 로딩될 때 자동 생성된다.
  // => 공통으로 허용할 값일 경우 클래스 필드로 선언한다.
  static final int BOARD_SIZE = 100; // new boardHandler해서 힙에 메모리 각각 만들어도 항상 변하지 않는 값이라 static으로 바꿈
  public static Scanner keyboard; 
  
  
  // 클래스 메서드
  // => 인스턴스 없이 호출하는 메서드이다.
  // => 인스턴스를 사용하려면 파라미터를 통해 호출할 때 외부에서 받아야 한다.
  public static void addBoard(BoardHandler boardHandler) { //변경 //private : 내부에서만 사용 클래스 밖에서 못씀! 따라서 붙이면 안됨)

    Board board = new Board();

    System.out.print("번호? ");
    board.no = keyboard.nextInt(); 
    keyboard.nextLine(); 

    System.out.print("제목? ");
    board.title = keyboard.nextLine();

    board.date = new Date(System.currentTimeMillis());

    board.viewCount = 0;

    boardHandler.boards[boardHandler.boardCount++] = board; // 변경

    System.out.println("저장하였습니다.");
  }

  public static void listBoard(BoardHandler boardHandler) { //보드 핸들러설계로에 따라 만든 인스턴스의 주소를 담는 변수 (리모컨)
    for (int i = 0; i < boardHandler.boardCount; i++) { 
      Board b = boardHandler.boards[i]; // 변경
      System.out.printf("%d, %s, %s, %d\n", 
          b.no, b.title, b.date, b.viewCount);
    }
  }
  
  public static void detailBoard(BoardHandler boardHandler) {//변경
    System.out.println("게시물 번호? ");
    int no = keyboard.nextInt();
    keyboard.nextLine(); //숫자 뒤에 남은 공백 제거
    
    Board board = null;
    for (int i = 0; i < boardHandler.boardCount; i++) {
      if (boardHandler.boards[i].no == no) { // 변경 // 보드i번방에 들어있는 i식판의 no번호와 사용자 입력번호를 비교해서 같다면 바로 그식판!
        board = boardHandler.boards[i]; //변경
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

//메인메소드가 없어서 run as 에 안뜸
// app에서 명령어 추가
//   public static void detailBoard() {
//System.out.println("게시물 번호? ");
//int no = keyboard.nextInt();
//keyboard.nextLine(); //이거 꼭 넣어야함 숫자 뒤에 남은 공백 제거
//
//if (no < 0 || no >= boardCount) {
//  System.out.println("게시물 번호가 유효하지 않습니다.");
//  return; //메소드의 리턴타입이 void일 경우 그냥 리턴만 쓰면 중단됨
//}
//
//Board board = boards[no];
//
//System.out.printf("번호: %d\n", board.no);
//System.out.printf("제목: %s\n", board.title);
//System.out.printf("등록일: %s\n", board.date);
//System.out.printf("조회수: %d\n", board.viewCount);
//} 생성 나머지 보드핸들러2, 3도


//* 게시물은 중간에 게시물이 삭제되어도 번호가 바뀌면 안된다!!! 이용자가 서로 전달을 못해
//삭제된 번호 빵꾸는 유지해야함. 버려
// > 배열로 하면 배열 인덱스 번호가 땡겨짐...
//게시물 특징: 번호는 계속 앞으로 직진만 한다.
// > 그래서 게시물 고유번호가 필요함.
// 게시물 조회시 배열인덱스로 조회하는 건 나쁘다. 게시물 고유 보드로 찾아야 한다. 
