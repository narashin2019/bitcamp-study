package com.eomcs.lms;

//데이터는 개별로 관리하고 메서드는 공유한다 = 인스턴스 필드의 존재이유

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
    // 따로 관리할 필요 없어서 클래스에서 공유하는 변수를 사용
    LessonHandler.keyboard = keyboard;
    MemberHandler.keyboard = keyboard;
    BoardHandler.keyboard = keyboard;
    
    //BoardHandler의 메서드가 사용할 메모리만 게시판마다 따로 생성한다.
    // new BoardHandler(); 스태틱 안붙은 애들(메서드는 아님 인스턴스 필트만)의 메모리 공간 Heap에 생성하고 그 주소를 게시판1에 저장하라
    BoardHandler 게시판1 = new BoardHandler(); 
    BoardHandler 게시판2 = new BoardHandler();
    BoardHandler 게시판3 = new BoardHandler();
    BoardHandler 게시판4 = new BoardHandler();
    BoardHandler 게시판5 = new BoardHandler();
    BoardHandler 게시판6 = new BoardHandler();
    
    LessonHandler 정규수업 = new LessonHandler();
    
    MemberHandler 일반회원 = new MemberHandler();
    
    
    String command;

    
    do {
      System.out.print("\n명령> ");
      command = keyboard.nextLine();

      switch (command) {
        case "/lesson/add":
          //인스턴스 메서드 호출 방법
          정규수업.addLesson();
          break;

        case "/lesson/list":
          정규수업.listLesson();
          break;

        case "/member/add":
          일반회원.addMember();
          break;

        case "/member/list":
          일반회원.listMember();
          break;

        case "/board/add":
          게시판1.addBoard(); // 인스턴스 메서드 호출하는 법
          break;

        case "/board/list":
          게시판1.listBoard(); // 인스턴스 메서드 호출하는 법
          break;
          
        case "/board/detail":
          게시판1.detailBoard(); // 인스턴스 메서드 호출하는 법
          break;
          
        case "/board2/add":
          게시판2.addBoard(); //같은 메서드를 사용해서 () 게시판만 다르게 수행한다.
          break;

        case "/board2/list":
          게시판2.listBoard();
          break;
          
        case "/board2/detail":
          게시판2.detailBoard();
          break;
          
        case "/board3/add":
          게시판3.addBoard();
          break;

        case "/board3/list":
          게시판3.listBoard();
          break;
          
        case "/board3/detail":
          게시판3.detailBoard();
          break;
          
        case "/board4/add":
          게시판4.addBoard();
          break;

        case "/board4/list":
          게시판4.listBoard();
          break;
          
        case "/board4/detail":
          게시판4.detailBoard();
          break;
          
        case "/board5/add":
          게시판5.addBoard();
          break;

        case "/board5/list":
          게시판5.listBoard();
          break;
          
        case "/board5/detail":
          게시판5.detailBoard();
          break;
          
        case "/board6/add":
          게시판6.addBoard();
          break;

        case "/board6/list":
          게시판6.listBoard();
          break;
          
        case "/board6/detail":
          게시판6.detailBoard();
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
