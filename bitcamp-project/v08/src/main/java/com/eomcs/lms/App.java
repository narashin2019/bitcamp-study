package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    class Lesson {
      int no;
      String title;
      String description; 
      Date startDate;
      Date endDate;
      int totalHours;
      int dayHours;
    }

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

    final int LESSSON_SIZE = 100;
    final int MEMBER_SIZE = 100;
    final int BOARD_SIZE = 100;


    Lesson[] lessons = new Lesson[LESSSON_SIZE];
    Member[] members = new Member[MEMBER_SIZE];
    Board[] boards = new Board[BOARD_SIZE];

    int lessonCount = 0;
    int memberCount = 0;
    int boardCount = 0;

    String command;


    do {
      System.out.print("\n명령> ");
      command = keyboard.nextLine();

      switch (command) {

        case "lesson/add":

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


          lessons[lessonCount++] = lesson; // 레슨0번방에 넣고 카운트 +1
          System.out.println("저장하였습니다.");


          break;

        case "/lesson/list":

          for(int i = 0; i < lessonCount; i++) { //SIZE만큼이 아니라 count만큼만 반복

            Lesson l = lessons[i]; 

            System.out.printf("%d, %s, %s ~ %s, %d\n", 
                l.no, l.title, l.startDate, 
                l.endDate, l.totalHours);
          }
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

          members[memberCount++] = member; // 레슨0번방에 넣고 카운트 +1

          System.out.println("저장하였습니다.");

          break;

        case "/member/list":

          for (int i = 0; i < memberCount; i++) {
            Member m = members[i]; // 출력할 식판 순서대로 부름
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
      }
    } while (!command.equalsIgnoreCase("quit"));
    System.out.println("안녕");

    keyboard.close();

  }
}
