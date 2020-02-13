// " /lesson/list" 명령처리

package com.eomcs.lms.handler;

import java.util.List;
import com.eomcs.lms.dao.LessonDao;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.util.Prompt;

public class LessonListCommand implements Command {

  Prompt prompt;
  LessonDao lessonDao;
  // 다양한 프록시가 될 수 있음으로 인터페이스명을 쓴다. 물론 넘어올때는 보드디에이오프록시 객체가 넘어온다.

  public LessonListCommand(LessonDao lessonDao) {
    this.lessonDao = lessonDao;
  }

  @SuppressWarnings("unchecked")
  @Override
  public void execute() {

    try {

      List<Lesson> lessons = lessonDao.findAll();
      for (Lesson l : lessons) {
        System.out.printf("%d, %s, %s ~ %s, %d\n", l.getNo(), l.getTitle(), l.getStartDate(),
            l.getEndDate(), l.getTotalHours());
      }

    } catch (Exception e) {
      System.out.println("목록 조회 실패!");
    }

  }
}


