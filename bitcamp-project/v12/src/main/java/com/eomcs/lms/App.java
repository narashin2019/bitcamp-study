package com.eomcs.lms;

//import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.handler.BoardHandler;
import com.eomcs.lms.handler.BoardHandler2;
import com.eomcs.lms.handler.BoardHandler3;
import com.eomcs.lms.handler.BoardHandler4;
import com.eomcs.lms.handler.BoardHandler5;
import com.eomcs.lms.handler.BoardHandler6;
import com.eomcs.lms.handler.LessonHandler;
import com.eomcs.lms.handler.MemberHandler;

public class App {

  // 여러 메소드끼리 공유하니까 main메서드 밖으로 뺴고 static붙임
  static Scanner keyboard = new Scanner(System.in); 
  
  public static void main(String[] args) {
    
    // Handler의 메서드를 사용하기 전에
    // 그 메서드가 작업할 때 사용할 키보드 객체를 설정해줘야 한다.
    //(상호참조하도록 하면 안됩니다. 여기선 LH언급해도 LH에선 App언급하면 안됨)
    // 다른 패키지에 있으니 임포트 함
    LessonHandler.keyboard = keyboard;
    MemberHandler.keyboard = keyboard;
    BoardHandler.keyboard = keyboard;
    BoardHandler2.keyboard = keyboard;
    BoardHandler3.keyboard = keyboard;
    BoardHandler4.keyboard = keyboard;
    BoardHandler5.keyboard = keyboard;
    BoardHandler6.keyboard = keyboard;
    
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
          
        case "/board/detail":
          BoardHandler.detailBoard();
          break;
          
        case "/board2/add":
          BoardHandler2.addBoard();
          break;

        case "/board2/list":
          BoardHandler2.listBoard();
          break;
          
        case "/board2/detail":
          BoardHandler2.detailBoard();
          break;
          
        case "/board3/add":
          BoardHandler3.addBoard();
          break;

        case "/board3/list":
          BoardHandler3.listBoard();
          break;
          
        case "/board3/detail":
          BoardHandler3.detailBoard();
          break;
          
        case "/board4/add":
          BoardHandler4.addBoard();
          break;

        case "/board4/list":
          BoardHandler4.listBoard();
          break;
          
        case "/board4/detail":
          BoardHandler4.detailBoard();
          break;
          
        case "/board5/add":
          BoardHandler5.addBoard();
          break;

        case "/board5/list":
          BoardHandler5.listBoard();
          break;
          
        case "/board5/detail":
          BoardHandler5.detailBoard();
          break;
          
        case "/board6/add":
          BoardHandler6.addBoard();
          break;

        case "/board6/list":
          BoardHandler6.listBoard();
          break;
          
        case "/board6/detail":
          BoardHandler6.detailBoard();
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