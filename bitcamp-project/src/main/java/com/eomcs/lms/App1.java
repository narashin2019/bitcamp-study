package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App1 {

  static Scanner keyboard = new Scanner(System.in); // 위로 빼고 static

  static class Lesson { // 메소드끼리 공유하니까 main메서드 밖으로 뺴고 static붙임
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

  
  
  
  
  public static void main(String[] args) {


    class Member {
      int no;
      String name;
      String email;
      String password;
      String photo;
      String tel;
      Date registeredDate;
    }

    class Board {
      int no;
      String title;
      Date date;
      int viewCount;
    }

    final int MEMBER_SIZE = 100;
    final int BOARD_SIZE = 100;


    Member[] members = new Member[MEMBER_SIZE];
    Board[] boards = new Board[BOARD_SIZE];

    int memberCount = 0;
    int boardCount = 0;

    String command;

    
    do {
      System.out.print("\n명령> ");
      command = keyboard.nextLine();

      switch (command) {
        case "/lesson/add":
          // 분리된 코드 (메서드)를 실행(호풀)시킨다.
          // => 보통 "메서드를 호출한다"라고 표현한다. 
          addLesson();
          
          break;

        case "/lesson/list":

          listLesson();
          
          break;

        case "/member/add":

          Member member = new Member();

          System.out.print("번호? ");
          member.no = keyboard.nextInt();
          keyboard.nextLine(); // 줄바꿈 기호 제거용

          System.out.print("이름? ");
          member.name = keyboard.nextLine();

          System.out.print("이메일? ");
          member.email = keyboard.nextLine();

          System.out.print("암호? ");
          member.password = keyboard.nextLine();

          System.out.print("사진? ");
          member.photo = keyboard.nextLine();

          System.out.print("전화? ");
          member.tel = keyboard.nextLine();

          member.registeredDate = new Date(System.currentTimeMillis());

          members[memberCount++] = member; 

          System.out.println("저장하였습니다.");
          break;

        case "/member/list":

          for (int i = 0; i < memberCount; i++) {
            Member m = members[i]; 
            System.out.printf("%d, %s, %s, %s, %s\n", 
                m.no, m.name, m.email, m.tel, m.registeredDate);
          }
          break;

        case "/board/add":

          Board board = new Board();

          System.out.print("번호? ");
          board.no = keyboard.nextInt(); 
          keyboard.nextLine(); 

          System.out.print("제목? ");
          board.title = keyboard.nextLine();

          board.date = new Date(System.currentTimeMillis());

          board.viewCount = 0;

          boards[boardCount++] = board;
          
          System.out.println("저장하였습니다.");
          break;

        case "/board/list":

          for (int i = 0; i < boardCount; i++) { 
            Board b = boards[i]; 
            System.out.printf("%d, %s, %s, %d\n", 
                b.no, b.title, b.date, b.viewCount);
          }
          break;

        default:
          if(!command.equalsIgnoreCase("quit")){
            System.out.println("실행할 수 없는 명령입니다.");
          } 
       } // switch문
    } while (!command.equalsIgnoreCase("quit"));  // do while문
    System.out.println("안녕");

    keyboard.close();

  } // main
  
  
  // 1. addLesson 메소드 main에서 분리
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
  
  
  static void listLesson() { //listLesson메서드
    for(int i = 0; i < lessonCount; i++) { 

      Lesson l = lessons[i]; 

      System.out.printf("%d, %s, %s ~ %s, %d\n", 
          l.no, l.title, l.startDate, 
          l.endDate, l.totalHours);
    }
  }//listLesson메서드
  
  
} // class
