// "/lesson/add" 명령 처리

package com.eomcs.lms.handler;

import com.eomcs.lms.dao.LessonDao;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.util.Prompt;

public class LessonAddCommand implements Command {

  Prompt prompt;
  LessonDao lessonDao;
  // 다양한 프록시가 될 수 있음으로 인터페이스명을 쓴다. 물론 넘어올때는 보드디에이오프록시 객체가 넘어온다.

  public LessonAddCommand(LessonDao lessonDao, Prompt prompt) {
    this.lessonDao = lessonDao;
    this.prompt = prompt;
  }

  @Override
  public void execute() {
    Lesson lesson = new Lesson();

    lesson.setTitle(prompt.inputString("수업명? "));
    lesson.setDescription(prompt.inputString("설명? "));
    lesson.setStartDate(prompt.inputDate("시작일? "));
    lesson.setEndDate(prompt.inputDate("종료일? "));
    lesson.setTotalHours(prompt.inputInt("총수업시간? "));
    lesson.setDayHours(prompt.inputInt("일수업시간? "));
    try {
      lessonDao.insert(lesson);
      System.out.println("저장하였습니다.");

    } catch (Exception e) {
      System.out.println("저장 실패!");
    }
  }
}


