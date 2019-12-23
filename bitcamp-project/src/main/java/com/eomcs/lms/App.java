package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App {

  // 여러 메소드끼리 공유하니까 main메서드 밖으로 뺴고 static붙임
  static Scanner keyboard = new Scanner(System.in); 
  
  public static void main(String[] args) {
    
    // LessonHandler의 메서드를 사용하기 전에
    // 그 메서드가 작업할 때 사용할 키보드 객체를 설정해줘야 한다.
    //(상호참조하도록 하면 안됩니다. 여기선 LH언급해도 LH에선 App언급하면 안됨)
    LessonHandler.keyboard = keyboard;
    
    // MemberHandler의 메서드를 사용하기 전에
    // 그 메서드가 작업할 때 사용할 키보드 객체를 설정해준다.
    MemberHandler.keyboard = keyboard;
    
    // BoardHandler의 메서드를 사용하기 전에
    // 그 메서드가 작업할 때 사용할 키보드 객체를 설정해준다.
    BoardHandler.keyboard = keyboard;
    
    
    String command;

    
    do {
      System.out.print("\n명령> ");
      command = keyboard.nextLine();

      switch (command) {
        case "/lesson/add":
          // 다른 클래스로 분리한 메서드를 호출할 때는
          // 클래스 이름을 지정해야 한다.
          LessonHandler.addLesson();
          break;

        case "/lesson/list":
          LessonHandler.listLesson();
          break;

        case "/member/add":
          MemberHandler.addMember();
          break;

        case "/member/list":
          MemberHandler.listMember();
          break;

        case "/board/add":
          BoardHandler.addBoard();
          break;

        case "/board/list":
          BoardHandler.listBoard();
          break;

        default:
          if(!command.equalsIgnoreCase("quit")){
            System.out.println("실행할 수 없는 명령입니다.");
          }
      }  // switch문
    } while (!command.equalsIgnoreCase("quit")); // do while문
    System.out.println("안녕");

    keyboard.close();

  } // main

} // class


//단계
// 1. MemberHandler 클래스 파일을 만든다
// 2. Member 관련된 변수선언 명령어들 모음 다 잘라내서 멤버핸들러에 붙여넣는다.
// 3. app클래스에서 만든 키보드를 공유하기 위해 
//    멤버핸들러 안에 static Scanner keyboard;를 넣는다.
// 4. app에는  MemberHandler.keyboard = keyboard; 추가. MemberHandler. 추가

