package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.handler.BoardHandler;
import com.eomcs.lms.handler.LessonHandler;
import com.eomcs.lms.handler.MemberHandler;

public class App {

  // 여러 메소드끼리 공유하니까 main메서드 밖으로 뺴고 static붙임
  static Scanner keyboard = new Scanner(System.in); 
  
  public static void main(String[] args) {
    
    // Handler의 메서드를 사용하기 전에
    // 그 메서드가 작업할 때 사용할 키보드 객체를 설정해줘야 한다.
    //(상호참조하도록 하면 안됩니다. 여기선 LH언급해도 LH에선 App언급하면 안됨)
    LessonHandler.keyboard = keyboard;
    MemberHandler.keyboard = keyboard;
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

//클래스의 구성원 = 클래스 멤버도 접근제어 해야한다
//디폴트: 같은패키지
//퍼블릭: 공개모드로 바꿈