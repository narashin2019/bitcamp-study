// 대기열 크기 조정
package com.eomcs.net.ex02;

import java.net.ServerSocket;
import java.util.Scanner;

public class Server0220 {
  public static void main(String[] args) throws Exception {
    // 중간에 실행을 잠깐 멈출 때 사용하기 위함.
    Scanner keyboard = new Scanner(System.in);

    System.out.println("서버 실행");

    // => new ServerSocket(포트번호, 대기열크기);
    //
    ServerSocket ss = new ServerSocket(8888, 2);
    System.out.println("서버 소켓 생성 완료!");
    System.out.println("클라이언트 연결을 기다리는 중...");

    // 잠깐 멈추기
    // => 클라이언트가 접속하게 하라!
    // => 최대 몇 개까지 접속 가능한가?
    keyboard.nextLine();

    ss.close();
    System.out.println("서버 종료!");

    keyboard.close();
  }
}

// 두번째 파라미터로 대기열 크기 지정할 수 있다.
// 내부 타임아웃 시간까지 대기열에 들어오길 기다리고 못들오면 타임아웃
