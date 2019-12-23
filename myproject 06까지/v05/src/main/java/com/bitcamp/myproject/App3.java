package com.bitcamp.myproject;

import java.util.Scanner;
import java.sql.Date;

public class App3 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.print("번호? ");
    int no = keyboard.nextInt();
    keyboard.nextLine();
    
    System.out.print("제목? ");
    String title = keyboard.nextLine();

    System.out.print("내용? ");
    String contents = keyboard.nextLine();
    
    System.out.print("작성일? ");
    Date createdDate = new Date(System.currentTimeMillis());
    keyboard.nextLine();
    
    System.out.print("조회수? ");
    int viewCount = 0;
    keyboard.nextLine();

    keyboard.close();
    
    
    System.out.println();
    System.out.printf("번호: %d\n", no);
    System.out.printf("제목: %s\n", title);
    System.out.printf("내용: %s\n", contents);
    System.out.printf("작성일: %s\n", createdDate);
    System.out.printf("조회수: %d\n", viewCount);
  }
}

