package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Lesson;

public class LessonHandler {

  // 인스턴스 필드 (non-static field)
  // => 각 수업 목록을 개별적으로 관리
  Lesson[] lessons = new Lesson[LESSSON_SIZE];
  int lessonCount = 0;

  // 클래스 필드 (static field)
  static final int LESSSON_SIZE = 100;
  public static Scanner keyboard; 

  
  // 클래스 메서드
  // => 인스턴스 없이 호출하는 메서드이다.
  // => 인스턴스를 사용하려면 파라미터를 통해 호출할 때 외부에서 받아야 한다.
  public static void addLesson(LessonHandler lessonHandler) { //addLesson이 클래스필드가 아니기 때문에 접근 파라미터 준다. 레퍼런스변수는 소문자
    Lesson lesson = new Lesson(); // 

    System.out.print("번호? ");
    lesson.no = keyboard.nextInt(); 
    keyboard.nextLine(); 

    System.out.print("수업명? ");
    lesson.title = keyboard.nextLine();

    System.out.print("설명? ");
    lesson.description = keyboard.nextLine();

    System.out.print("시작일? ");
    lesson.startDate = Date.valueOf(keyboard.next()); 

    System.out.print("종료일? ");
    lesson.endDate = Date.valueOf(keyboard.next());

    System.out.print("총수업시간? ");
    lesson.totalHours = keyboard.nextInt();

    System.out.print("일수업시간? ");
    lesson.dayHours = keyboard.nextInt();
    keyboard.nextLine();       

    lessonHandler.lessons[lessonHandler.lessonCount++] = lesson; 
    System.out.println("저장하였습니다.");
  }

  public static void listLesson(LessonHandler lessonHandler) { 
    for(int i = 0; i < lessonHandler.lessonCount; i++) { 

      Lesson l = lessonHandler.lessons[i]; 

      System.out.printf("%d, %s, %s ~ %s, %d\n", 
          l.no, l.title, l.startDate, 
          l.endDate, l.totalHours);
    }
  }
  
  
  

}
