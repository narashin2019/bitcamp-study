package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Lesson;

public class LessonHandler {

  // 인스턴스 필드 (non-static field)
  // => 각 수업 목록을 개별적으로 관리
  Lesson[] lessons; //1번
  int lessonCount = 0;

  
  public Scanner input; //키보드를 인풋으로 바꿈. 개별관리 하도록 인스턴스 필드로 바꿈 
  
  // 클래스 필드 (static field)
  // => 공유할 변수 
  static final int LESSSON_SIZE = 100;

  public LessonHandler(Scanner input) { //퍼블릭으로 완전공개 레슨핸들러가 생성자()에서 스캐너 인풋받네. 반드시 필요하구나 
    this.input = input;
    this.lessons = new Lesson[LESSSON_SIZE]; 
  }
  
  public void addLesson () {
    Lesson lesson = new Lesson(); // 

    System.out.print("번호? ");
    lesson.no = input.nextInt(); 
    input.nextLine(); 

    System.out.print("수업명? ");
    lesson.title = input.nextLine();

    System.out.print("설명? ");
    lesson.description = input.nextLine();

    System.out.print("시작일? ");
    lesson.startDate = Date.valueOf(input.next()); 

    System.out.print("종료일? ");
    lesson.endDate = Date.valueOf(input.next());

    System.out.print("총수업시간? ");
    lesson.totalHours = input.nextInt();

    System.out.print("일수업시간? ");
    lesson.dayHours = input.nextInt();
    input.nextLine();       

    this.lessons[this.lessonCount++] = lesson; 
    System.out.println("저장하였습니다.");
  }

  public  void listLesson() { 
    for(int i = 0; i < this.lessonCount; i++) { 
      Lesson l = this.lessons[i]; 
      System.out.printf("%d, %s, %s ~ %s, %d\n", 
          l.no, l.title, l.startDate, 
          l.endDate, l.totalHours);
    }
  }
  

}
