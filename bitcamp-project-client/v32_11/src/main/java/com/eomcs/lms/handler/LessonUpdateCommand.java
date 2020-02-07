// "lesson/update" 명령처리

package com.eomcs.lms.handler;

import com.eomcs.lms.dao.LessonDao;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.util.Prompt;

public class LessonUpdateCommand implements Command {


  Prompt prompt;
  LessonDao lessonDao;
  // 다양한 프록시가 될 수 있음으로 인터페이스명을 쓴다. 물론 넘어올때는 보드디에이오프록시 객체가 넘어온다.

  public LessonUpdateCommand(LessonDao lessonDao, Prompt prompt) {
    this.lessonDao = lessonDao;
    this.prompt = prompt;
  }

  @Override
  public void execute() {


    try {
      int no = prompt.inputInt("번호? ");

      Lesson oldLesson = null;

      try {
        oldLesson = lessonDao.findByNo(no);
      } catch (Exception e) {
        System.out.println("해당 번호의 수업이 없습니다!");
        return;
      }


      Lesson newLesson = new Lesson(); // 뉴레슨 식판을 하나 만든다.

      newLesson.setNo(oldLesson.getNo());
      newLesson.setTitle(prompt.inputString(String.format("수업명(%s)? ", oldLesson.getTitle()),
          oldLesson.getTitle())); // 메소드
      newLesson.setDescription(prompt.inputString("설명? ", oldLesson.getTitle()));
      newLesson.setStartDate(prompt.inputDate(String.format("시작일(%s)? ", oldLesson.getStartDate()),
          oldLesson.getStartDate()));
      newLesson.setEndDate(prompt.inputDate(String.format("종료일(%s)? ", oldLesson.getEndDate()),
          oldLesson.getEndDate()));
      newLesson.setTotalHours(prompt.inputInt(
          String.format("총수업시간(%d)? ", oldLesson.getTotalHours()), oldLesson.getTotalHours()));
      newLesson.setDayHours(prompt.inputInt( // 프롬프트 객체에 들어있는 인풋으로 호출
          String.format("일수업시간(%d)? ", oldLesson.getDayHours())));

      if (newLesson.equals(oldLesson)) {
        System.out.println("게시글 변경을 취소했습니다.");
        return;
      }

      lessonDao.update(newLesson);

      System.out.println("게시글을 변경했습니다.");

    } catch (Exception e) {
      System.out.println("명령 실행 중 오류 발생!");
    }


  }

}


