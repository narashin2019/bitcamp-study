package com.eomcs.lms;

// 상호참조하도록 하면 안됩니다. App이라는 클래스 언급되면 안된다. 
// 컴파일러가 무한루프 도는 문제 유지보수차원에서도 문제

import java.sql.Date;
import java.util.Scanner;

public class LessonHandler {

  
  static class Lesson { 
    int no;
    String title;
    String description; 
    Date startDate;
    Date endDate;
    int totalHours;
    int dayHours;
  }
  static final int LESSSON_SIZE = 100;
  static Lesson[] lessons = new Lesson[LESSSON_SIZE];
  static int lessonCount = 0;
  static Scanner keyboard;


  static void addLesson() { 
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

  static void listLesson() { 
    for(int i = 0; i < lessonCount; i++) { 

      Lesson l = lessons[i]; 

      System.out.printf("%d, %s, %s ~ %s, %d\n", 
          l.no, l.title, l.startDate, 
          l.endDate, l.totalHours);
    }
  }//listLesson메서드
  
  
  

}
