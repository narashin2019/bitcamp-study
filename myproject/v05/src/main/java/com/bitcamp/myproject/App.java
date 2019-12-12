package com.bitcamp.myproject;

import java.util.Scanner;
import java.sql.Date;

public class App {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("번호? ");
    int no = keyboard.nextInt();
    keyboard.nextLine();
    //int no = Integer.parseInt(keyboard.nextLine());
    
    System.out.print("국가? ");
    String country = keyboard.nextLine();
    
    System.out.print("장르? ");
    String genres = keyboard.nextLine();
    
    System.out.print("제목한글? ");
    String titleKor = keyboard.nextLine();
    
    System.out.print("제목영문? ");
    String titleEng = keyboard.nextLine();
    
    System.out.print("별점? ");
    int ratedStar = keyboard.nextInt();
    keyboard.nextLine();
    
    System.out.print("코멘트? ");
    String comment = keyboard.nextLine();
    
    System.out.print("키워드? ");
    String keywords = keyboard.nextLine();
    
    System.out.print("시작일? ");
    Date startDate = Date.valueOf(keyboard.nextLine()); 
    //"yyyy-MM-dd"형태로 입력된 문자열을 날짜 정보로 바꾼다. 
    //Date라는 도구의 valueof기능(사용자의 입력값)
    //위 형태와 다르면 프로그램이 멈춰버림 > 예외처리문법으로 해결!
    
    System.out.print("종료일? ");
    Date endDate = Date.valueOf(keyboard.next()); 
    keyboard.nextLine();
    
    System.out.print("어디까지봤니? ");
    String watchedEpisode = keyboard.nextLine();
    
    keyboard.close();
    
    System.out.println();
    System.out.printf("번호: %d\n", no);
    System.out.printf("국가: %s\n", country);
    System.out.printf("장르: %s\n", genres);
    System.out.printf("제목한글: %s\n", titleKor);
    System.out.printf("제목영문: %s\n", titleEng);
    System.out.printf("별점: %d\n", ratedStar);
    System.out.printf("코멘트: %s\n", comment);
    System.out.printf("키워드: #%s\n", keywords);
    System.out.printf("기간: %s ~ %s\n", startDate, endDate); 
    System.out.printf("어디까지봤니: %s\n", watchedEpisode); 

    
  }
}



