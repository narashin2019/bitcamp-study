package com.eomcs.lms;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.domain.Member;
import com.eomcs.lms.handler.BoardHandler;
import com.eomcs.lms.handler.LessonHandler;
import com.eomcs.lms.handler.MemberHandler;
import com.eomcs.util.Prompt;

public class App {
  
  static Scanner keyboard = new Scanner(System.in);
  
  // java.util.Stack에서 제공하는 Iterator 객체는 FIFO 방식으로 값을 꺼내준다.(오버라이딩안됨)
  // 그래서  LIFO 방식으로 꺼내는 Iterator가 필요하다면 
  // java.util.Deque 구현체를 사용하라.
  static Deque<String> commandStack = new ArrayDeque<>();
  static Queue<String> commandQueue = new LinkedList<>();
  //    큐는 인터페이스 / 링크드리스트는 클래스
  // 가능하면 레퍼런스를 인터페이스로 하면 뒤에 것을 쉽게 교체할 수 있는 범위가 넓어짐.
  // 그 인터페이스 규칙을 따른 클래스를 여러개 교체할 수 있당.
  
  public static void main(String[] args) {
    
    Prompt prompt = new Prompt(keyboard);
    
    
    // 단지 유지보수를 좋게 하기 위해 ArrayList와 LinkerList의 공통 분모를 뽑아서 
    // 만든 클래스가 List이다.
    // List클래스는 실제 작업을 하는 클래스가 아니다.
    // 그럼에도 불구하고 개발자가 다음과 같이 List 객체를 사용하려 한다면 막을 수 없다.
    // =>  BoardHandler의 경우 아무런 작업을 수행하지 않을 것이다.
    // => 왜? List 클래스에 정의된 메서드는 아무것도 하지 않는다.
    //
//    List<Board> boardList = new List<>();
  
    // 해결책?
    // => 이렇게 generalization을 통해 만든 클래스의 경우
    //    서브 클래스에게 공통 분모를 물려주기 위한 용도로 사용된다.
    // => 이런 류의 클래스는 직접 인스턴스를 생성하지 못하도록 해서
    //    직접 사용하는 것을 막아야 한다.
    // => 이런 용도로 사용하는 문법이 "추상 클래스(abstract class)"이다.
    //
    // List클래스를 추상 클래스로 만들면
    // 다음과 같이 인스턴스를 생성할 수 없다.
    // 아예 인스턴스 생성을 원천적으로 차단하는 효과가 있다.
    //
    //AbstractList<Board> boardList = new AbstractList<>(); // 컴파일 오류!
    //
    // 반드시 AbstractList의 일반 하위 객체를 정의해야 한다.
    //
    LinkedList<Board> boardList = new LinkedList<>();
    BoardHandler boardHandler = new BoardHandler(prompt, boardList);
    
    ArrayList<Lesson> lessonList = new ArrayList<>();
    LessonHandler lessonHandler = new LessonHandler(prompt, lessonList);
    
    LinkedList<Member> memberList = new LinkedList<>();
    MemberHandler memberHandler = new MemberHandler(prompt, memberList);
    
    
    
    String command;
    
    do {
      System.out.print("\n명령> ");
      command = keyboard.nextLine();
      
      if (command.length() == 0)
        continue;
      
      commandStack.push(command);
      
      commandQueue.offer(command);
      
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
          boardHandler.addBoard();
          break;
        case "/board/list":
          boardHandler.listBoard();
          break;
        case "/board/detail":
          boardHandler.detailBoard();
          break;  
        case "/board/update":
          boardHandler.updateBoard();
          break; 
        case "/board/delete":
          boardHandler.deleteBoard();
          break; 
        case "history":
          printCommandHistory(commandStack.iterator());
          break;
        case "history2":
          printCommandHistory(commandQueue.iterator());
          break;
        default:
          if (!command.equalsIgnoreCase("quit")) {
            System.out.println("실행할 수 없는 명령입니다.");
          }
      }
      
    } while (!command.equalsIgnoreCase("quit"));
    
    System.out.println("안녕!");
    
    keyboard.close();
  }
  


  // 이전에는 Stack에서 값을 꺼내는 방법과 Queue에서 값을 꺼내는 방법이 다르기 때문에
  // printCommandHistory()와 printCommandHistory2() 메서드를 따로 정의했다.
  // 이제 Stack과 Queue는 일관된 방식으로 값을 꺼내주는 Iterator가 있기 때문에
  // 두 메서드를 하나로 합칠 수 있다.
  // 파라미터로 Iterator를 받아서 처리하기만 하면 된다.
  //
  private static void printCommandHistory(Iterator<String> iterator) {
    int count = 0;
    
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
      count++;
      
      if ((count % 5) == 0) {
        System.out.print(":");
        String str = keyboard.nextLine();
        if (str.equalsIgnoreCase("q")) {
          break;
        }
      }
    }
  }
  
}






