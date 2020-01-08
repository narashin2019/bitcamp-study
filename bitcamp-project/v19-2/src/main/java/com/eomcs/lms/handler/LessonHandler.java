// 게시글 번호로 객체를 찾는 코드를 관리하기 쉽게 별도의 메서드로 분리한다.
// => indexOfBoard(int) 메서드 추가
// 내부에서만 쓸거니까 private로 // 임시변수도 없앰.
//

package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.util.ArrayList;

public class LessonHandler {

  ArrayList<Lesson> lessonList;//

  Scanner input; 

  public LessonHandler(Scanner input) { 
    this.input = input;
    this.lessonList = new ArrayList<>();//
  }


  public LessonHandler(Scanner input, int capacity) {
    this.input = input;
    this.lessonList = new ArrayList<>(capacity);
  }


  public void addLesson () { 
    Lesson lesson = new Lesson();

    System.out.print("번호? ");
    lesson.setNo(input.nextInt()); 
    input.nextLine(); 

    System.out.print("수업명? ");
    lesson.setTitle(input.nextLine());

    System.out.print("설명? ");
    lesson.setDescription(input.nextLine());

    System.out.print("시작일? ");
    lesson.setStartDate(Date.valueOf(input.next())); 

    System.out.print("종료일? ");
    lesson.setEndDate(Date.valueOf(input.next()));

    System.out.print("총수업시간? ");
    lesson.setTotalHours(input.nextInt());

    System.out.print("일수업시간? ");
    lesson.setDayHours(input.nextInt());
    input.nextLine();       

    lessonList.add(lesson);

    System.out.println("저장하였습니다.");
  }


  public void listLesson() {
    // 수업 객체 목록을 복사 받을 배열을 준비하고, toArray()를 실행한다.
    // toArray()의 리턴 값은 파라미터로 넘겨준 배열의 주소이다. (기존배열그대로씀)
    Lesson[] arr = this.lessonList.toArray(new Lesson[this.lessonList.size()]);
    for (Lesson l : arr) {
      System.out.printf("%d, %s, %s ~ %s, %d\n", 
          l.getNo(), l.getTitle(), l.getStartDate(), 
          l.getEndDate(), l.getTotalHours());
    }
  }


  public void detailLesson() {
    System.out.println("번호? ");
    int no = input.nextInt();
    input.nextLine(); //숫자 뒤에 남은 공백 제거

    int index = indexOfLesson(no);

    if (index == -1) {
      System.out.println("수업 인덱스가 유효하지 않습니다.");
      return;
    }

    Lesson lesson = this.lessonList.get(index);

    System.out.printf("번호: %d\n", lesson.getNo());
    System.out.printf("수업명: %s\n", lesson.getTitle());
    System.out.printf("수업내용: %s\n", lesson.getDescription());
    System.out.printf("기간: %s ~ %s\n", lesson.getStartDate(), lesson.getEndDate());
    System.out.printf("총수업시간: %d\n", lesson.getTotalHours());
    System.out.printf("일수업시간: %d\n", lesson.getDayHours());
  }




  public void updateLesson() {
    System.out.println("번호? ");
    int no = input.nextInt();
    input.nextLine(); //숫자 뒤에 남은 공백 제거

    int index = indexOfLesson(no);
    
    if (index == -1) {
      System.out.println("해당 번호의 수업이 없습니다.");
      return;
    }

    Lesson oldLesson = this.lessonList.get(index); 

    boolean changed = false; // 변경했는지 안했는지 알아보기 위한 변수
    String inputStr = null; //빈문자열 입력했는지 알아보기 위한 변수
    Lesson newLesson = new Lesson(); // 뉴레슨 식판을 하나 만든다.

    newLesson.setNo(oldLesson.getNo());

    System.out.printf("수업명(%s)? ", oldLesson.getTitle());
    inputStr = input.nextLine();
    if (inputStr.length() == 0) {
      newLesson.setTitle(oldLesson.getTitle());
    } else {
      newLesson.setTitle(inputStr);
      changed = true;
    }

    System.out.print("설명? ");
    inputStr = input.nextLine();
    if (inputStr.length() == 0) {
      newLesson.setDescription(oldLesson.getDescription());
    } else {
      newLesson.setDescription(inputStr);
      changed = true;
    }

    System.out.printf("시작일(%s)? ", oldLesson.getStartDate());
    inputStr = input.nextLine();
    if (inputStr.length() == 0) {
      newLesson.setStartDate(oldLesson.getStartDate());
    } else {
      newLesson.setStartDate(Date.valueOf(inputStr));
      changed = true;
    }

    System.out.printf("종료일(%s)? ", oldLesson.getEndDate());
    inputStr = input.nextLine();
    if (inputStr.length() == 0) {
      newLesson.setEndDate(oldLesson.getEndDate());
    } else {
      newLesson.setEndDate(Date.valueOf(inputStr));
      changed = true;
    }

    System.out.printf("총수업시간(%d)? ", oldLesson.getTotalHours());
    inputStr = input.nextLine();
    if (inputStr.length() == 0) {
      newLesson.setTotalHours(oldLesson.getTotalHours());
    } else {
      newLesson.setTotalHours(Integer.parseInt(inputStr));
      changed = true;
    }

    System.out.printf("일수업시간(%d)? ", oldLesson.getDayHours());
    inputStr = input.nextLine();
    if (inputStr.length() == 0) {
      newLesson.setDayHours(oldLesson.getDayHours());
    } else {
      newLesson.setDayHours(Integer.parseInt(inputStr));
      changed = true;
    }

    if (changed) {
      this.lessonList.set(index, newLesson);
      System.out.println("수업을 변경했습니다.");
    } else {
      System.out.println("수업 변경이 취소되었습니다.");
    }
    
  }


  public void deleteLesson() {
    System.out.println("번호? ");
    int no = input.nextInt();
    input.nextLine(); //숫자 뒤에 남은 공백 제거

    int index = indexOfLesson(no);
    
    if (index == -1) {
      System.out.println("해당 번호의 수업이 없습니다.");
      return;
    }

    this.lessonList.remove(index);

    System.out.println("수업을 삭제했습니다.");

  }


  private int indexOfLesson(int no) {
    for (int i = 0; i < this.lessonList.size(); i++) {
      if (this.lessonList.get(i).getNo() == no) {
        return i;
      }
    }
    return -1;
 }
}


/*
*
nextInt()): 숫자입력할때까지 리턴안함. 엔터만 치면 그냥 엔터만 넘어가고 다음 단계가 안보임..
> 그냥 엔터치면 넘어가게 하고 싶어
> nextInt를 nextLine으로 바꿈!

*
빈문자열 판단 조건식: 
System.out.printf("수업명(%s)? ", oldLesson.getTitle());
    inputStr = input.nextLine();
 이거랑   if (inputStr.equals("")) / 이것 중에 ( if (inputStr.length() == 0) 편한걸로 하면됨. 

*
nextLine은 무조건 문자열로 리턴한다.
> Integer.parseInt(inputStr) 괄호안(사용자가 입력한 문자열)을 정수로 바꾼다!

*내용 변경 했는지 안했는지 판단해서 출력 다르게 하는 코드 추가: boolean


*/
