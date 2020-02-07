// "/lesson/delete" 명령 처리

package com.eomcs.lms.handler;

import com.eomcs.lms.dao.LessonDao;
import com.eomcs.util.Prompt;

public class LessonDeleteCommand implements Command {

  Prompt prompt;
  LessonDao lessonDao;
  // 다양한 프록시가 될 수 있음으로 인터페이스명을 쓴다. 물론 넘어올때는 보드디에이오프록시 객체가 넘어온다.

  public LessonDeleteCommand(LessonDao lessonDao, Prompt prompt) {
    this.lessonDao = lessonDao;
    this.prompt = prompt;
  }

  @Override
  public void execute() {

    try {
      int no = prompt.inputInt("번호? ");
      lessonDao.delete(no);
      System.out.println("수업을 삭제했습니다.");

    } catch (Exception e) {
      System.out.println("삭제 실패!");
    }

  }
}


