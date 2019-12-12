package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in); // 스캐너를 만들어서 그 스캐너를 담아 놓는 변수 = 키보드
    
    
    System.out.print("번호? ");
    int no = keyboard.nextInt(); // 정수값을 다룰때는 걍 int해 뭘 2바이트를아끼냐
    keyboard.nextLine(); // 줄바꿈 기호 제거용
    
    System.out.print("내용? ");
    String contents = keyboard.nextLine();    
  
    System.out.print("작성일? ");
    // 현재일시
    // currentTimeMillis()
    // => 1970년 1월 1일 0시 0분 0호 부터 현재까지 경과된 시간을 밀리초로 리턴한다.
    // new Date(밀리초)
    // => 넘겨받은 밀리초를 가지고 년, 월, 일, 시, 분, 초를 계산한다
    // today : 이문장을 실행을 한 타임밀스
    Date today = new Date(System.currentTimeMillis());
    // java.sql.Date today = new java.sql.Date(System.currentTimeMills()); 는 안된다. 
    // => import java.sql.Date; 임포트문으로 써
    keyboard.nextLine();
    
    System.out.print("조회수? ");
    int count = 0;
    keyboard.nextLine();
    
    
    keyboard.close();
    
    
    System.out.println();
    System.out.printf("번호: %d\n", no);
    System.out.printf("내용: %s\n", contents);
    System.out.printf("작성일: %s\n", today);
    System.out.printf("조회수: %d\n", count);
    
    
  }

}
