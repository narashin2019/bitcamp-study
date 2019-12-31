package com.eomcs.lms;

//생성자 constructor
// The constructor BoardHandler() is undefined
import java.util.Scanner;
import com.eomcs.lms.handler.BoardHandler;
import com.eomcs.lms.handler.LessonHandler;
import com.eomcs.lms.handler.MemberHandler;

public class App {

  static Scanner keyboard = new Scanner(System.in); 
  
  public static void main(String[] args) {
    
    // Handler의 메서드를 사용하기 전에
    // 그 메서드가 작업할 때 사용할 키보드 객체를 설정해줘야 한다.
    // 따로 관리할 필요 없어서 클래스에서 공유하는 변수를 사용
    //LessonHandler.input = keyboard;
    //MemberHandler.input = keyboard;
    
    // new BoardHandler(); 스태틱 안붙은 애들(메서드는 아님 인스턴스 필트만)의 메모리 공간 Heap에 생성하고 그 주소를 boardHandler1에 저장하라
    BoardHandler 게시판1 = new BoardHandler(keyboard); //BoardGandler 입력객체를 반드시 꼽도록 생성자에 강제화함.
    BoardHandler 게시판2 = new BoardHandler(keyboard, 200);
    BoardHandler 게시판3 = new BoardHandler(keyboard, 1000);
    BoardHandler 게시판4 = new BoardHandler(keyboard);
    BoardHandler 게시판5 = new BoardHandler(keyboard, 9000);
    BoardHandler 게시판6 = new BoardHandler(keyboard, 20000);
    
    LessonHandler 정규수업 = new LessonHandler(keyboard); // (); 생성자를 호출하는 명령
    MemberHandler 일반회원 = new MemberHandler(keyboard); //3번
    
    
    String command;

    
    do {
      System.out.print("\n명령> ");
      command = keyboard.nextLine();

      switch (command) {
        case "/lesson/add":
          // 다른 클래스로 분리한 메서드를 호출할 때는
          // 클래스 이름을 지정해야 한다.
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

//생성자!!
// 생성되 인스턴스가 사용하기 전에 유효한 값으로 초기화 시키는 것.
// 생성자 여러 개 만들어서 기본인 경우, 추가적인 경우 등 설정할 수 있음.
