package com.bitcamp.myproject;

import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.print("번호? ");
    String no = keyboard.nextLine();
    
    System.out.print("제목? ");
    String title = keyboard.nextLine();

    System.out.print("내용? ");
    String contents = keyboard.nextLine();
    
    System.out.print("작성일? ");
    String createdDate = keyboard.nextLine();
    //import java.sql.Date;
    //Date createdDate = new Date(System.currentTimeMillis());
    
    System.out.print("조회수? ");
    String viewCount = keyboard.nextLine();

    
    System.out.println();
    System.out.printf("번호: %s\n", no);
    System.out.printf("제목: %s\n", title);
    System.out.printf("내용: %s\n", contents);
    System.out.printf("작성일: %s\n", createdDate);
    System.out.printf("조회수: %s\n", viewCount);


    keyboard.close();


  }
}


//    System.out.printf("번호: %d\n", 1);
//    System.out.printf("내용: %s\n", "게시글입니다.");
//    System.out.printf("작성일: %s\n", "2019-01-01");
//    System.out.printf("조회수: %d\n", 0);
