package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);

    //1. 수업정보 데이터를 저장할 메모리를 설계한다.
    // 클래스?
    // - 애플리케이션에서 다룰 특정 데이터(수업정보, 학생정보, 게시물,제품정보 등)의 
    //   메모리 구조를 설계하는 문법이다.
    // - 클래스는 새로운 종류의 메모리를 설계하는 것.
    // - 이렇게 개발자가 새롭게 정의한 데이터 타입을 
    //   "사용자 정의 데이터 타입"이라 부른다.
    // - 즉 '클래스'는 '사용자 정의 데이터 타입'을 만들 때 사용하는 문법이다.
    class Lesson {
      int no;
      String title;
      String description; 
      Date startDate;
      Date endDate;
      int totalHours;
      int dayHours;
    }
    
    final int SIZE = 100;
    
    //2. Lesson 인스턴스의 주소를 담을 레퍼런스 배열을 준비한다.
    Lesson[] lessons = new Lesson[SIZE];
    
//제거      3. Lesson 인스턴스를 생성하여 레퍼런스 배열에 저장한다.
//       
//        for (int i = 0; i < SIZE; i++) {
//          lessons[i] = new Lesson();
//        }
    
    String response;
    int count = 0;

    for (int i=0;1<SIZE;i++) {
      count++; // 1됨

      Lesson lesson = new Lesson();// 바꿈!! 식판1개 생성 주소는 lesson
          
      System.out.print("번호? ");
      lesson.no = keyboard.nextInt(); 
      keyboard.nextLine(); // nextInt()후에 남아 있는 줄바꿈 기호를 제거하는 용이다.

      System.out.print("수업명? ");
      lesson.title = keyboard.nextLine();

      System.out.print("설명? ");
      lesson.description = keyboard.nextLine();

      System.out.print("시작일? ");
      lesson.startDate = Date.valueOf(keyboard.next()); // 암기. "yyyy-mm-dd"형태로 입력된 문자열을 날짜정보로 바꾼다.

      System.out.print("종료일? ");
      lesson.endDate = Date.valueOf(keyboard.next());

      System.out.print("총수업시간? ");
      lesson.totalHours = keyboard.nextInt();

      System.out.print("일수업시간? ");
      lesson.dayHours = keyboard.nextInt();
      keyboard.nextLine(); // 일수업시간nextInt()후에 남아 있는 줄바꿈 기호를 제거하는 용.

      
      // 수업정보를 담고 있는 인스턴스의 주소를 나중에 사용할 수 있도록
      // 레퍼런스 배열에 보관해둔다.
      lessons[i] = lesson;
      
      System.out.println();

      System.out.print("계속 입력하시겠습니까?(Y/n) ");
      response = keyboard.nextLine(); //String response; + response = keyboard.nextLine(); 한문장으로 한 것 
      if(!response.equalsIgnoreCase("y")) { //암기 y가 아니라면 break;실행
        break;
      }
    }

    keyboard.close();

    System.out.println();

    for(int i = 0; i < count; i++) { //SIZE만큼이 아니라 count만큼만 반복
      
      Lesson lesson = lessons[i]; // 레퍼런스 배열에 저장된 각각의 식판을 출력한다
      
      System.out.printf("%d, %s, %s ~ %s, %d\n", 
          lesson.no, lesson.title, lesson.startDate, 
          lesson.endDate, lesson.totalHours);
    }

  }
}
