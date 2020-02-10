// 타입아웃 시간 설정하기
package com.eomcs.net.ex02;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

public class Client0310 {
  public static void main(String[] args) throws Exception {
    // 실행을 잠시 중단시키기 위해 사용
    Scanner keyScan = new Scanner(System.in);
    System.out.println("클라이언트 실행!");

    // 1) 소켓을 생성한다.
    Socket socket = new Socket(); // 타임아웃파라미터 없음 //파라미터 없으면 소켓만만듬
    System.out.println("소켓 생성됨.");

    // 2) 연결할 서버의 주소를 준비한다.
    SocketAddress socketAddress = new InetSocketAddress("localhost", 8888);
    // SocketAddress: 추상클래스 // 서브클래스 InetSocketAddress 의 객체를 만든다.
    // 메서드호출하는데 파라미터 타입이 추상클래스, 인터페이스다?
    // > 서브클래스의 객체를 만들고 추상클래스, 인터페이스 파라미터로 주면 됨.

    // 3) 서버와의 연결을 시도한다.
    // => 타임아웃으로 지정된 시간 안에 서버와 연결되지 않으면 즉시 예외가 발생한다.
    //
    System.out.println("서버와 연결 중...");
    socket.connect(socketAddress, 5000); // timeout : milliseconds
    // 5초기다렸는데도 서버 대기열에 못들어가면 타임아웃
    System.out.println("서버와 연결되었음!");

    keyScan.nextLine(); // 사용자가 엔터를 칠 때까지 다음 코드로 이동하지 않는다.

    socket.close();
    System.out.println("서버와의 연결을 끊었음.");

    keyScan.close();
  }
}

// 타임아웃조정은 이 코드로 해야함. 밀리세컨드 주의
