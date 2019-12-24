package com.eomcs.lms;

//데이터는 개별로 관리하고 메서드는 공유한다 = 인스턴스 필드의 존재이유

//import java.sql.Date;
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
    // new BoardHandler(); 스태틱 안붙은 애들(메서드는 아님 인스턴스 필트만)의 메모리 공간 Heap에 생성하고 그 주소를 boardHandler1에 저장하라
    BoardHandler 게시판1 = new BoardHandler(); //(boardHandler1대신 게시판1로함
    BoardHandler 게시판2 = new BoardHandler();
    BoardHandler 게시판3 = new BoardHandler();
    BoardHandler 게시판4 = new BoardHandler();
    BoardHandler 게시판5 = new BoardHandler();
    BoardHandler 게시판6 = new BoardHandler();
    
    LessonHandler 정규수업 = new LessonHandler(); // lessonHandler대신 정규수업이라고 이름지음 
    MemberHandler 일반회원 = new MemberHandler();
    
    
    String command;

    
    do {
      System.out.print("\n명령> ");
      command = keyboard.nextLine();

      switch (command) {
        case "/lesson/add":
          // 다른 클래스로 분리한 메서드를 호출할 때는
          // 클래스 이름을 지정해야 한다.
          LessonHandler.addLesson(정규수업);
          break;

        case "/lesson/list":
          LessonHandler.listLesson(정규수업);
          break;

        case "/member/add":
          MemberHandler.addMember(일반회원);
          break;

        case "/member/list":
          MemberHandler.listMember(일반회원);
          break;

        case "/board/add":
          BoardHandler.addBoard(게시판1); // 파라미터로 어느 배열에 저장할 지 주소 줘.
          break;

        case "/board/list":
          BoardHandler.listBoard(게시판1);
          break;
          
        case "/board/detail":
          BoardHandler.detailBoard(게시판1);
          break;
          
        case "/board2/add":
          BoardHandler.addBoard(게시판2); //같은 메서드를 사용해서 () 게시판만 다르게 수행한다.
          break;

        case "/board2/list":
          BoardHandler.listBoard(게시판2);
          break;
          
        case "/board2/detail":
          BoardHandler.detailBoard(게시판2);
          break;
          
        case "/board3/add":
          BoardHandler.addBoard(게시판3);
          break;

        case "/board3/list":
          BoardHandler.listBoard(게시판3);
          break;
          
        case "/board3/detail":
          BoardHandler.detailBoard(게시판3);
          break;
          
        case "/board4/add":
          BoardHandler.addBoard(게시판4);
          break;

        case "/board4/list":
          BoardHandler.listBoard(게시판4);
          break;
          
        case "/board4/detail":
          BoardHandler.detailBoard(게시판4);
          break;
          
        case "/board5/add":
          BoardHandler.addBoard(게시판5);
          break;

        case "/board5/list":
          BoardHandler.listBoard(게시판5);
          break;
          
        case "/board5/detail":
          BoardHandler.detailBoard(게시판5);
          break;
          
        case "/board6/add":
          BoardHandler.addBoard(게시판6);
          break;

        case "/board6/list":
          BoardHandler.listBoard(게시판6);
          break;
          
        case "/board6/detail":
          BoardHandler.detailBoard(게시판6);
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


// 게시판 추가하기
//방법1)
//static Board[] boards2 = new Board[BOARD_SIZE];
//static int boardCount2 = 0;
//하위 코드에서도 변경해야함.
//그럼 게시판 또 추가하려면??? 계속 추가하고 뜯어고칠거야?
//=> 위대한 복붙을 보여주겟다.

// 방법2)
// 보드핸들러2복붙하고 여기에 2개 추가 = 키보드 임포트, 케이스문에 2개
// 복붙 장점 쉽다. 단점 유지보수가 어렵다
// 하나 수정하면 보드핸들러1, 2 둘다 수정해야함. => 두개 클래스가 함께쓰는 변수타입정의 부분을 클래스 따로 뻄 =Boaard를 생성한다 

//방법3)
// 패키지도 package com.eomcs.lms.domain;로 바꿈. 도메인 발고 vo라고도 함.
//domain = 업무영역에서 다뤄지는 데이터다. 도메인 객체.
//vo = value object 값객체 (값을 정의할 메모리 설계도)


//복붙은 기능추가는 쉬운데 유지 보수가 어렵다.

//해결책
//
//*동일한코드가 있다는것은 그 일부 바꿀때 동일한 코드 전체 다 바꿔줘야함.
//
//
//*복붙의 장점: 추가는 쉽다. 개발 편의성 중복코드 양산 
//=> 기술부채
//*단점 : 기능변경, 오류생겼을 때 유지보수가 어렵다 
//1) 기능변경 : 중복코드, 즉 복사한것마다 다 바꿔야함.
//2) 오류가 있다면? 중복코드, 즉 복사한것마다 다 오류 바꿔야함.
//
//
//=> 기술부채의 해결 = refactoring / architecture변경(renewal)
//
//
//*해결책: 
//class 의 메소드와 변수를 다른 방법으로 관리!!!!!
//
//=> ****변수는 개별관리 / 메서드는 공유******** 
//이 문법을 배우면 게시판 복붙 안해도 되고
//기능바꿀때 복붙한거 다 바꿀필요도 없고!!!