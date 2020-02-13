// "/lesson/detail" 명령처리

package com.eomcs.lms.handler;

import com.eomcs.lms.dao.LessonDao;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.util.Prompt;

public class LessonDetailCommand implements Command {

  Prompt prompt;
  LessonDao lessonDao;
  // 다양한 프록시가 될 수 있음으로 인터페이스명을 쓴다. 물론 넘어올때는 보드디에이오프록시 객체가 넘어온다.

  public LessonDetailCommand(LessonDao lessonDao, Prompt prompt) {
    this.lessonDao = lessonDao;
    this.prompt = prompt;
  }

  @Override
  public void execute() {

    try {
      int no = prompt.inputInt("번호? ");

      Lesson lesson = lessonDao.findByNo(no);
      System.out.printf("번호: %d\n", lesson.getNo());
      System.out.printf("수업명: %s\n", lesson.getTitle());
      System.out.printf("수업내용: %s\n", lesson.getDescription());
      System.out.printf("기간: %s ~ %s\n", lesson.getStartDate(), lesson.getEndDate());
      System.out.printf("총수업시간: %d\n", lesson.getTotalHours());
      System.out.printf("일수업시간: %d\n", lesson.getDayHours());

    } catch (Exception e) {
      System.out.println("조회 실패!");
    }

  }
}


