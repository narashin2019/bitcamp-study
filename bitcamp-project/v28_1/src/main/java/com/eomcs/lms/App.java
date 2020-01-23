// 남이 쓴 코드를 읽고 해석하는 능력이 제일 중요하다.
// 기존 코드가 비어있을 때 코드 읽어내는 능력이 없으면 채울 수도 없다.
// 코드 작성하기 = 이야기 작성하기. JVM 무슨일을 할 지 명령서 작성하는 것.

package com.eomcs.lms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.domain.Member;
import com.eomcs.lms.handler.BoardAddCommand;
import com.eomcs.lms.handler.BoardDeleteCommand;
import com.eomcs.lms.handler.BoardDetailCommand;
import com.eomcs.lms.handler.BoardListCommand;
import com.eomcs.lms.handler.BoardUpdateCommand;
import com.eomcs.lms.handler.Command;
import com.eomcs.lms.handler.ComputePlusCommand;
import com.eomcs.lms.handler.HelloCommand;
import com.eomcs.lms.handler.LessonAddCommand;
import com.eomcs.lms.handler.LessonDeleteCommand;
import com.eomcs.lms.handler.LessonDetailCommand;
import com.eomcs.lms.handler.LessonListCommand;
import com.eomcs.lms.handler.LessonUpdateCommand;
import com.eomcs.lms.handler.MemberAddCommand;
import com.eomcs.lms.handler.MemberDeleteCommand;
import com.eomcs.lms.handler.MemberDetailCommand;
import com.eomcs.lms.handler.MemberListCommand;
import com.eomcs.lms.handler.MemberUpdateCommand;
import com.eomcs.util.Prompt;

public class App {

  static Scanner keyboard = new Scanner(System.in);

  static Deque<String> commandStack = new ArrayDeque<>();
  static Queue<String> commandQueue = new LinkedList<>();

  static ArrayList<Lesson> lessonList = new ArrayList<>();
  static LinkedList<Board> boardList = new LinkedList<>();
  static LinkedList<Member> memberList = new LinkedList<>();

  public static void main(String[] args) {

    // 프로그램이 실생되면 레슨 멤버 보드파일에서 데이터를 읽어온다
    loadLessonData();
    loadBoardData();
    loadMemberData();

    //키보드에서 사용자로부터 입력을 받을 도구를 준비한다.=프롬프트 객체를 생성한다.
    Prompt prompt = new Prompt(keyboard);

    //사용자명령어를 처리할 객체를 담을 맵을 = 보관소를 준비한다.
    HashMap<String, Command> commandMap = new HashMap<>();

    //게시물, 수업정보, 회원정보 등록을 처리할 객체를 명령어 이름으로 보관소에 저장한다.
    commandMap.put("/board/add", new BoardAddCommand(prompt, boardList));
    commandMap.put("/board/list", new BoardListCommand(boardList));
    commandMap.put("/board/detail", new BoardDetailCommand(prompt, boardList));
    commandMap.put("/board/update", new BoardUpdateCommand(prompt, boardList));
    commandMap.put("/board/delete", new BoardDeleteCommand(prompt, boardList));

    commandMap.put("/lesson/add", new LessonAddCommand(prompt, lessonList));
    commandMap.put("/lesson/list", new LessonListCommand(lessonList));
    commandMap.put("/lesson/detail", new LessonDetailCommand(prompt, lessonList));
    commandMap.put("/lesson/update", new LessonUpdateCommand(prompt, lessonList));
    commandMap.put("/lesson/delete", new LessonDeleteCommand(prompt, lessonList));


    commandMap.put("/member/add", new MemberAddCommand(prompt, memberList));
    commandMap.put("/member/list", new MemberListCommand(memberList));
    commandMap.put("/member/detail", new MemberDetailCommand(prompt, memberList));
    commandMap.put("/member/update", new MemberUpdateCommand(prompt, memberList));
    commandMap.put("/member/delete", new MemberDeleteCommand(prompt, memberList));


    commandMap.put("/hello", new HelloCommand(prompt));
    commandMap.put("/compute/plus", new ComputePlusCommand(prompt));



    String command;


    // 사용자로부터 명령어를 입력받아서
    // 입력받은 명령어의 길이가 0이면 
    // 반복문이 돌아 다시 입력받고 
    // 입력받은 명령어가 quit이면 "안녕" 출력하고 반복(실행)을 멈춘다.
    
    //만약 사용자가 입력한 명령어가 
    //history면 사용자가 입력한 명령내역을 역순으로 출력한다.
    //history2면 사용자가 입력한 명령내역을 순서대로 출력한다.
    while (true) {
      System.out.print("\n명령> ");
      command = keyboard.nextLine();

      if (command.length() == 0)
        continue;

      if (command.equals("quit")) {
        System.out.println("안녕!");
        break;
      } else if (command.equals("history")) {
        printCommandHistory(commandStack.iterator());
        continue;
      } else if (command.contentEquals("history2")) {
        printCommandHistory(commandQueue.iterator());
        continue;
      }
      
      
      //사용자가 입력한 명령어는 스택과 큐에 보관한다. 나중에 쓰기 위해서.
      commandStack.push(command);
      commandQueue.offer(command);

      Command commandHandler = commandMap.get(command);

      
      //사용자가 입력한 명령어로 보관소에서 그 명령어를 처리할 객체를 찾는다.
      //만약에 찾았다면(null이 아니라면) 그 사용자 명령어를 처리할 객체를 통해서 명령어 처리를 수행.
      //명령어 처리 중 예외가 발생하면 ""명령어 실행 중 오류 발생, 무슨오류인지" 이라고 출력한다. 
      //사용자가 입력한 명령어를 처리할 객체 못찾았으면(담당자를 못찾았으면) "실행할 수 없는 명령"이라고 출력.
      
      if (commandHandler != null) {
        try {
          commandHandler.execute();
        } catch (Exception e) {
          System.out.printf("명령어 실행 중 오류 발생: %s\n", e.getMessage());
        }
      } else {
        System.out.println("실행할 수 없는 명령입니다.");
      }
    }

    //사용자가 quit을 입력하면 명령어 처리를 종료하고, 지금까지 사용한 키보드 자원을 해제한다.
    keyboard.close();

    // 수업 멤버 보드 데이터를 파일에 저장(보관).
    saveLessonData();
    saveBoardData();
    saveMemberData();


  } // main 메서드 끝


  // 이전에는 Stack에서 값을 꺼내는 방법과 Queue에서 값을 꺼내는 방법이 다르기 때문에
  // printCommandHistory()와 printCommandHistory2() 메서드를 따로 정의했다.
  // 이제 Stack과 Queue는 일관된 방식으로 값을 꺼내주는 Iterator가 있기 때문에
  // 두 메서드를 하나로 합칠 수 있다.
  // 파라미터로 Iterator를 받아서 처리하기만 하면 된다.
  //
  
  //사용자 명령어 출력 시
  //파라미터에서 그 명령어를 꺼내주는 객체(이터레이터)를 받는다. 
  //그리고 그 객체에게 사용자가 입력한 명령어 값을 꺼내달라고 하고 출력한다.
  //출력하다가 5칸 되면 :을 출력해서 계속 출력할 지 말 지 묻는다.
  
  // 예를들어, 메서드 선언부만 보고 {}를 채운다고 해보자.
  // 이 메서드가 호출될 때 값을 꺼내는 이터레이터가 주어 진다면 
  // 이 객체를 사용하여 무엇을 할 것인지 {} 안에 명령어를 채울 줄 알아야 한다. 
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


  private static void loadLessonData() {
    // 수업데이타로딩하는 메서드.
    // 변수는 읽지말고 중요한 것 먼저 읽어라.

    // 데이터가 보관된 파일을 정보를 준비한다. = 어떤 파일을 읽을지 파일정보를 준비한다. 
    File file = new File("./lesson.csv"); // 현재폴더: 비트캠프-프로젝트

    FileReader in = null;
    Scanner dataScan = null;

    try {
      // 저장된 파일에서 데이터를 읽어 줄 도구를 준비한다.
      in = new FileReader(file); // 파일리더가 도구(빨대)에 file(음료수)에 꼽는다.

      // .csv 파일에 한 줄 단위로 문자열을 읽는 기능이 필요하다.
      // FileReader에는 그런 기능이 없다.
      // 그래서 FileReader를 그대로 사용할 수 없고,
      // 이 객체에 다른 도구를 연결하여 사용할 것이다.
      //
      //FileReader로 읽기에는 기능이 부족해서 한 줄 단위로 잘라주는 Scanner를 FileReader 도구에 붙인다.
      dataScan = new Scanner(in); 

      int count = 0;

      
      // 해당되는 파일에서 데이터를 다읽을 때까지 반복문을 돌린다.
      while (true) { 
        try {
          // 스캐너를 통해 해당 파일에서 한 줄을 읽는다.
          String line = dataScan.nextLine(); // 넥스트라인은 노서치엘리먼트 익셉션을 던질때로 데이터 읽었냐 안읽었냐 판단

          // 한 줄 문자열을 콤마(,)를 기준으로 데이터를 쪼갠다
          String[] data = line.split(",");

          // 한줄에 들어있던 데이터를 추출하여 Lesson 객체에 담는다.
          // => 데이터 순서는 다음과 같다.
          // 번호,강의명,설명,시작일,종료일,총강의시간,일강의시간
          
          // 수업데이터를 전문적으로 저장하는 메모리를 만들어서 
          // 쪼개진 문자열을 해당 변수에 = 해당 인스턴스 메모리에 담는다
          // 숫자는 문자열로 바꿔서, 문자열은 그대로, 날짜는 날짜로 바꿔서 저장한다.
          Lesson lesson = new Lesson();
          lesson.setNo(Integer.parseInt(data[0]));
          lesson.setTitle(data[1]);
          lesson.setDescription(data[2]);
          lesson.setStartDate(Date.valueOf(data[3]));
          lesson.setEndDate(Date.valueOf(data[4]));
          lesson.setTotalHours(Integer.parseInt(data[5]));
          lesson.setDayHours(Integer.parseInt(data[6]));

          // 쪼갠 문자열을 담은 lesson메모리를 lessonList에 추가한다.
          // = Lesson 객체를 Command가 사용하는 목록에 저장한다.
          lessonList.add(lesson);
          count++;

        } catch (Exception e) {
          break; // 반복문을 돌다가 읽어 들일 것이 없으면 반복문을 break한다.
        }
      }

      System.out.printf("총 %d 개의 수업 데이터를 로딩했습니다.\n", count);


    } catch (FileNotFoundException e) {
      System.out.println("파일 읽기 중 오류 발생! - " + e.getMessage());
      // 파일에서 데이터를 읽다가 오류가 발생하더라도
      // 시스템을 멈추지 않고 계속 실행하게 한다.
      // 이것이 예외처리를 하는 이유이다.
    } finally {
      // 자원이 서로 연결된 경우에는 안쪽 = 다른 자원을 이용하는 객체부터 닫는다.
      try {
        dataScan.close();
      } catch (Exception e) {
        // Scanner 객체 닫다가 오류가 발생하더라도 무시.
      }

      try {
        in.close();
      } catch (Exception e) { // IOException은 널포인트익셉션 처리 못해서 Exception으로 바꿨다.
        // close() 실행 하다가 오류가 발생한 경우 무시.
        // 왜? 닫다가 발생한 오류는 특별히 처리할 게 없다.
      }
    }

  }

  private static void loadBoardData() {
    File file = new File("./board.csv");
    FileReader in = null;
    Scanner dataScan = null;

    try {
      in = new FileReader(file);
      dataScan = new Scanner(in);
      int count = 0;

      while (true) {
        try {
          String line = dataScan.nextLine();
          String[] data = line.split(",");
          Board board = new Board();

          board.setNo(Integer.parseInt(data[0]));
          board.setTitle(data[1]);
          board.setDate(Date.valueOf(data[2])); //
          board.setViewCount(Integer.parseInt(data[3]));
          board.setWriter(data[4]);

          boardList.add(board);
          count++;

        } catch (Exception e) {
          break;
        }
      }
      System.out.printf("총 %d 개의 게시글 데이터를 로딩했습니다.\n", count);

    } catch (FileNotFoundException e) {
      System.out.println("파일 읽기 중 오류 발생! - " + e.getMessage());
    } finally {
      try {
        dataScan.close();
      } catch (Exception e) {
        // Scanner 객체 닫다가 오류가 발생하더라도 무시.
      }
      try {
        in.close();
      } catch (Exception e) {
        // close() 실행하다가 오류가 발생한 경우 무시.
        // 왜? 닫다가 발생한 오류는 특별히 처리할 게 없다.
      }
    }

  }

  private static void loadMemberData() {
    // 데이터가 보관된 파일을 정보를 준비한다.
    File file = new File("./member.csv");

    FileReader in = null;
    Scanner dataScan = null;

    try {
      // 파일을 읽을 때 사용할 도구를 준비한다.
      in = new FileReader(file);

      // .csv 파일에서 한 줄 단위로 문자열을 읽는 기능이 필요한데,
      // FileReader에는 그런 기능이 없다.
      // 그래서 FileReader를 그대로 사용할 수 없고,
      // 이 객체에 다른 도구를 연결하여 사용할 것이다.
      //
      dataScan = new Scanner(in);
      int count = 0;

      while (true) {
        try {
          // 파일에서 한 줄을 읽는다.
          String line = dataScan.nextLine();

          // 한 줄을 콤마(,)로 나눈다.
          String[] data = line.split(",");

          // 한 줄에 들어 있던 데이터를 추출하여 Member 객체에 담는다.
          // => 데이터 순서는 다음과 같다.
          // 번호,이름,이메일,비번,포토,전화번호,등록일
          Member member = new Member();
          member.setNo(Integer.parseInt(data[0]));
          member.setName(data[1]);
          member.setEmail(data[2]);
          member.setPassword(data[3]);
          member.setPhoto(data[4]);
          member.setTel(data[5]);
          member.setRegisteredDate(Date.valueOf(data[6]));

          // Member 객체를 Command가 사용하는 목록에 저장한다.
          memberList.add(member);
          count++;

        } catch (Exception e) {
          break;
        }
      }
      System.out.printf("총 %d 개의 회원 데이터를 로딩했습니다.\n", count);

    } catch (FileNotFoundException e) {
      System.out.println("파일 읽기 중 오류 발생! - " + e.getMessage());
      // 파일에서 데이터를 읽다가 오류가 발생하더라도
      // 시스템을 멈추지 않고 계속 실행하게 한다.
      // 이것이 예외처리를 하는 이유이다!!!
    } finally {
      // 자원이 서로 연결된 경우에는 다른 자원을 이용하는 객체부터 닫는다.
      try {
        dataScan.close();
      } catch (Exception e) {
        // Scanner 객체 닫다가 오류가 발생하더라도 무시한다.
      }
      try {
        in.close();
      } catch (Exception e) {
        // close() 실행하다가 오류가 발생한 경우 무시한다.
        // 왜? 닫다가 발생한 오류는 특별히 처리할 게 없다.
      }
    }
  }


  private static void saveLessonData() {

    // 데이터가 보관된 파일 정보를 준비한다.
    File file = new File("./lesson.csv");

    FileWriter out = null;

    try {
      // 파일에 데이터를 저장할 때 사용할 도구를 준비한다.
      out = new FileWriter(file);
      int count = 0;

      for (Lesson lesson : lessonList) {
        // 수업 목록에서 수업 객체 1개를 (데이터를) 꺼내 CSV 형식의 문자열로 만든다.
        String line = String.format("%d,%s,%s,%s,%s,%d,%d\n", lesson.getNo(), lesson.getTitle(),
            lesson.getDescription(), lesson.getStartDate(), lesson.getEndDate(),
            lesson.getTotalHours(), lesson.getDayHours());


        out.write(line);
        count++;
      }
      System.out.printf("총 %d 개의 수업 데이터를 저장했습니다.\n", count);

    } catch (IOException e) {
      System.out.println("파일 쓰기 중 오류 발생! - " + e.getMessage());

    } finally {
      try {
        out.close();
      } catch (IOException e) {
        // FileWriter를 닫을 때 발생하는 예외는 무시.

      }
    }
  }

  private static void saveBoardData() {


    File file = new File("./board.csv");

    FileWriter out = null;

    try {
      // 파일에 데이터를 저장할 때 사용할 도구를 준비한다.
      out = new FileWriter(file);
      int count = 0;

      for (Board board : boardList) {
        // 게시글 목록에서 게시글 데이터를 꺼내 CSV 형식의 문자열로 만든다.
        String line = String.format("%d,%s,%s,%d,%s\n", board.getNo(), board.getTitle(),
            board.getDate(), board.getViewCount(), board.getWriter());

        out.write(line);
        count++;
      }
      System.out.printf("총 %d 개의 게시글 데이터를 저장했습니다.\n", count);

    } catch (IOException e) {
      System.out.println("파일 쓰기 중 오류 발생! - " + e.getMessage());

    } finally {
      try {
        out.close();
      } catch (IOException e) {
        // FileWriter를 닫을 때 발생하는 예외는 무시.
      }
    }

  }

  private static void saveMemberData() {
    // 데이터가 보관된 파일을 정보를 준비한다.
    File file = new File("./member.csv");

    FileWriter out = null;

    try {
      // 파일에 데이터를 저장할 때 사용할 도구를 준비한다.
      out = new FileWriter(file);
      int count = 0;

      for (Member member : memberList) {
        // 회원 목록에서 회원 데이터를 꺼내 CSV 형식의 문자열로 만든다.
        String line = String.format("%d,%s,%s,%s,%s,%s,%s\n", member.getNo(), member.getName(),
            member.getEmail(), member.getPassword(), member.getPhoto(), member.getTel(),
            member.getRegisteredDate());

        out.write(line);
        count++;
      }
      System.out.printf("총 %d 개의 회원 데이터를 저장했습니다.\n", count);

    } catch (IOException e) {
      System.out.println("파일 쓰기 중 오류 발생! - " + e.getMessage());

    } finally {
      try {
        out.close();
      } catch (IOException e) {
        // FileWriter를 닫을 때 발생하는 예외는 무시.
      }
    }

  }



}


