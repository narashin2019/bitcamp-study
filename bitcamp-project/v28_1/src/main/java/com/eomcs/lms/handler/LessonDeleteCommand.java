// "/lesson/list" 명령 처리

package com.eomcs.lms.handler;

import java.util.Iterator;
import java.util.List;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.util.Prompt;

public class LessonDeleteCommand implements Command {

  List<Lesson> lessonList;

  Prompt prompt;

  public LessonDeleteCommand(Prompt prompt, List<Lesson> list) {
    this.prompt = prompt;
    this.lessonList = list;
  }



  @Override
  public void execute() {

    // 컬렉션에서 값을 꺼내는 일을 해 줄 Iteraror 객체를 준비한다.
    Iterator<Lesson> iterator = lessonList.iterator();

    // Iterator 객체를 통해 LessonList에 보관되어 있는 값을 꺼낸다.
    while (iterator.hasNext()) {
      Lesson l = iterator.next();
      System.out.printf("%d, %s, %s ~ %s, %d\n", l.getNo(), l.getTitle(), l.getStartDate(),
          l.getEndDate(), l.getTotalHours());
    }
  }



}


