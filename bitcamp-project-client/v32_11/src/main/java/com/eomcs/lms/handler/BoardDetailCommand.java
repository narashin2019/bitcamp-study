package com.eomcs.lms.handler;

import com.eomcs.lms.dao.BoardDao;
import com.eomcs.lms.domain.Board;
import com.eomcs.util.Prompt;

// "/board/detail" 명령 처리
public class BoardDetailCommand implements Command {

  Prompt prompt;
  BoardDao boardDao;
  // 다양한 프록시가 될 수 있음으로 인터페이스명을 쓴다. 물론 넘어올때는 보드디에이오프록시 객체가 넘어온다.

  public BoardDetailCommand(BoardDao boardDao, Prompt prompt) {
    this.boardDao = boardDao;
    this.prompt = prompt;
  }

  @Override
  public void execute() {
    try {
      int no = prompt.inputInt("번호? ");

      Board board = boardDao.findByNo(no);
      System.out.printf("번호: %d\n", board.getNo());
      System.out.printf("제목: %s\n", board.getTitle());
      System.out.printf("등록일: %s\n", board.getDate());
      System.out.printf("조회수: %d\n", board.getViewCount());

    } catch (Exception e) {
      System.out.println("조회 실패!");
    }
  }
}


