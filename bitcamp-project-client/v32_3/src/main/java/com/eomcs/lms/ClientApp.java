// LMS 클라이언트
package com.eomcs.lms;

import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import com.eomcs.lms.handler.Command;
import com.eomcs.util.Prompt;

public class ClientApp {


  Scanner keyboard = new Scanner(System.in);
  Prompt prompt = new Prompt(keyboard);


  public void service() {


    Deque<String> commandStack = new ArrayDeque<>();
    Queue<String> commandQueue = new LinkedList<>();

    HashMap<String, Command> commandMap = new HashMap<>();

    String command;

    while (true) {
      command = prompt.inputString("\n명령> ");

      if (command.length() == 0)
        continue;

      if (command.equals("quit")) {
        System.out.println("안녕!");
        break;
      } else if (command.equals("history")) {
        printCommandHistory(commandStack.iterator());
        continue;
      } else if (command.equals("history2")) {
        printCommandHistory(commandQueue.iterator());
        continue;
      }

      commandStack.push(command);

      commandQueue.offer(command);

      Command commandHandler = commandMap.get(command);

      if (commandHandler != null) {
        try {
          commandHandler.execute();
        } catch (Exception e) {
          e.printStackTrace();
          System.out.printf("명령어 실행 중 오류 발생: %s\n", e.getMessage());
        }
      } else {
        System.out.println("실행할 수 없는 명령입니다.");
      }
    }

    keyboard.close();

  } // service()


  private void printCommandHistory(Iterator<String> iterator) { // 스택과 큐 바로 쓰지 않고 이터레이터를 거쳐서 씀.
    int count = 0;
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
      count++;

      if ((count % 5) == 0) {
        String str = prompt.inputString(":");
        if (str.equalsIgnoreCase("q")) {
          break;
        }
      }
    }
  } // printCommandHistory()


  public static void main(String[] args) throws Exception {

    System.out.println("클라이언트 수업 관리 시스템입니다.");

    ClientApp app = new ClientApp();
    app.service();

/*
    String serverAddr = null;
    int port = 0;

    // 키보드 스캐너 바깥에서 준비
    Scanner keyScan = new Scanner(System.in);

    try {

      // 사용자로부터 접속할 서버의 주소와 포트 번호를 입력 받는다.
      System.out.println("서버? ");
      serverAddr = keyScan.nextLine();

      System.out.println("포트? ");
      port = Integer.parseInt(keyScan.nextLine());

    } catch (Exception e) {
      System.out.println("서버 주소 또는 포트 번호가 유효하지 않습니다.");
      keyScan.close();
      return;
    }



    try (

        // 서버와 연결
        Socket socket = new Socket(serverAddr, port); // 1프로그램마다 고유번호 = 포트번호 = 9999


        // 소켓을 통해 데이터를 읽고 쓰는 도구를 준비한다.

        // OutputStream out = socket.getOutputStream();
        // PrintStream out2 = new PrintStream(out); // 데코레이터 - 항상 다른 부품과 연결해야 한다.
        // => 밑에 한줄로
        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream())) { // 맨끝문장은 ;뺴도됨

      System.out.println("서버와 연결되었음");


      System.out.println("서버에 보낼 메시지: ");
      String sendMsg = keyScan.nextLine();

      // 서버에 메시지를 전송한다.
      // => 서버가 메시지를 받을 때 까지 리턴하지 않는다.
      // => blocking 방식으로 동작한다.
      out.println(sendMsg);
      System.out.println("서버에 메시지를 전송하였음");


      // 서버가 응답한 메시지를 수신한다
      // => 서버로 부터 한 줄의 메시지를 받을 때까지 리턴하지 않는다.
      // => blocking 방식으로 동작한다.
      String message = in.nextLine();
      System.out.println("서버로부터 메시지를 수신하였음");


      // 서버가 받은 메시지를 출력한다.
      System.out.println("서버 ==> " + message);
      System.out.println("서버와 연결을 끊었음"); // 정상적으로 메시지 출력됐을때만 나오는 문구

    } catch (Exception e) {
      System.out.println("예외발생");
      e.printStackTrace();

    }


    keyScan.close()
    */

  }
}


// Connection refused 서ㅏ버와 연결자체가 안된 에러 메시지

// 클로즈 대신 try (오토클로저블구현체만) {클로즈할것들} catch () {예외발생코드}
