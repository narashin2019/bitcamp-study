// "lesson/update" 명령처리

package com.eomcs.lms.handler;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.util.Prompt;

public class LessonUpdateCommand implements Command {


  ObjectOutputStream out;
  ObjectInputStream in;

  Prompt prompt;

  public LessonUpdateCommand(ObjectOutputStream out, ObjectInputStream in, Prompt prompt) {
    this.out = out;
    this.in = in;
    this.prompt = prompt;
  }

  @Override
  public void execute() {
    
    
    try {
      int no = prompt.inputInt("번호? ");

      // 기존의 게시물을 가져온다.
      out.writeUTF("/lesson/detail");
      out.writeInt(no);
      out.flush();

      String response = in.readUTF();
      if (response.equals("FAIL")) {
        System.out.println(in.readUTF());
        return;
      }
      Lesson oldLesson = (Lesson) in.readObject();
      Lesson newLesson = new Lesson(); // 뉴레슨 식판을 하나 만든다.
  
      newLesson.setNo(oldLesson.getNo());
      newLesson.setTitle(
          prompt.inputString(String.format("수업명(%s)? ", oldLesson.getTitle()), oldLesson.getTitle())); // 메소드
      newLesson.setDescription(prompt.inputString("설명? ", oldLesson.getTitle()));
      newLesson.setStartDate(prompt.inputDate(String.format("시작일(%s)? ", oldLesson.getStartDate()),
          oldLesson.getStartDate()));
      newLesson.setEndDate(prompt.inputDate(String.format("종료일(%s)? ", oldLesson.getEndDate()),
          oldLesson.getEndDate()));
      newLesson.setTotalHours(prompt.inputInt(String.format("총수업시간(%d)? ", oldLesson.getTotalHours()),
          oldLesson.getTotalHours()));
      newLesson.setDayHours(prompt.inputInt( // 프롬프트 객체에 들어있는 인풋으로 호출
          String.format("일수업시간(%d)? ", oldLesson.getDayHours())));
  
      if (newLesson.equals(oldLesson)) {
        System.out.println("게시글 변경을 취소했습니다.");
        return;
      }

      out.writeUTF("/lesson/update");
      out.writeObject(newLesson);
      out.flush();

      response = in.readUTF();
      if (response.equals("FAIL")) {
        System.out.println(in.readUTF());
        return;
      }

      System.out.println("게시글을 변경했습니다.");

    } catch (Exception e) {
      System.out.println("명령 실행 중 오류 발생!");
    }
    
    
  }

}


