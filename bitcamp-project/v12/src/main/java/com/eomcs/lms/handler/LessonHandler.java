package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Lesson;

public class LessonHandler {

  public static Scanner keyboard; 
 
  static final int LESSSON_SIZE = 100;
  static Lesson[] lessons = new Lesson[LESSSON_SIZE];
  static int lessonCount = 0;
  // public 다른패키지에 있는 클래스에서도 이 변수를 사용하게 하려면 공개해야 한다.
  // 다 공개하지 말고 공개할 것만 공개해야함 , 공개하지 않는게 기본. 
  // default = 같은 패키지 소속된 클래스끼리는 공유가능
  // private 이 내부에서만 씀
  // protected 이 클래스, 상속받은 자식클래스만

  public static void addLesson() { 
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

    lessons[lessonCount++] = lesson; 
    System.out.println("저장하였습니다.");
  } // addLesson 메소드

  public static void listLesson() { 
    for(int i = 0; i < lessonCount; i++) { 

      Lesson l = lessons[i]; 

      System.out.printf("%d, %s, %s ~ %s, %d\n", 
          l.no, l.title, l.startDate, 
          l.endDate, l.totalHours);
    }
  }//listLesson메서드
  
  
  

}
