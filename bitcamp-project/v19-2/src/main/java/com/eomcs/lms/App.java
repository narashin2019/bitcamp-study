package com.eomcs.lms;


import java.util.Scanner;
import com.eomcs.lms.handler.BoardHandler;
import com.eomcs.lms.handler.LessonHandler;
import com.eomcs.lms.handler.MemberHandler;

public class App {

  static Scanner keyboard = new Scanner(System.in); 
  
  public static void main(String[] args) {
    
    
    BoardHandler boardHandler = new BoardHandler(keyboard); 
    LessonHandler lessonHandler = new LessonHandler(keyboard);
    MemberHandler memberHandler = new MemberHandler(keyboard); 
    
    String command;

    do {
      System.out.print("\n명령> ");
      command = keyboard.nextLine();

      switch (command) {
        case "/lesson/add":
          lessonHandler.addLesson();
          break;

        case "/lesson/list":
          lessonHandler.listLesson();
          break;
          
        case "/lesson/detail":
          lessonHandler.detailLesson();
          break;
          
        case "/lesson/update":
          lessonHandler.updateLesson();
          break;
          
        case "/lesson/delete":
          lessonHandler.deleteLesson();
          break;

        case "/member/add":
          memberHandler.addMember();
          break;

        case "/member/list":
          memberHandler.listMember();
          break;
          
        case "/member/detail":
          memberHandler.detailMember();
          break;
          
        case "/member/update":
          memberHandler.updateMember();
          break;
          
        case "/member/delete":
          memberHandler.deleteMember();
          break;

        case "/board/add":
          boardHandler.addBoard(); // 인스턴스 메서드 호출하는 법
          break;

        case "/board/list":
          boardHandler.listBoard(); // 인스턴스 메서드 호출하는 법
          break;
          
        case "/board/detail":
          boardHandler.detailBoard(); // 인스턴스 메서드 호출하는 법
          break;
          
        case "/board/update":
          boardHandler.updateBoard(); // 인스턴스 메서드 호출하는 법
          break;
          
        case "/board/delete":
          boardHandler.deleteBoard(); // 인스턴스 메서드 호출하는 법
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

