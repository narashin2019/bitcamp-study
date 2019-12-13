package com.bitcamp.myproject;

import java.util.Scanner;
import java.sql.Date;

public class App {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    final int size = 1000;
    String response;
    int count = 0;

    int[] no = new int[size];
    String[] country = new String[size];
    String[] genres = new String[size];
    String[] titleKor = new String[size];
    String[] titleEng = new String[size];
    int[] ratedStar = new int[size];
    String[] comments = new String[size];
    String[] keywords = new String[size];
    Date[] startDate = new Date[size];
    Date[] endDate = new Date[size];
    int[] watchedEpisode = new int[size];


    for (int i = 0; i < size; i++ ) {
      System.out.print("번호? ");
      no[i] = keyboard.nextInt();
      keyboard.nextLine();

      System.out.print("국가? ");
      country[i] = keyboard.nextLine();

      System.out.print("장르? ");
      genres[i] = keyboard.nextLine();

      System.out.print("제목한글? ");
      titleKor[i] = keyboard.nextLine();

      System.out.print("제목영문? ");
      titleEng[i] = keyboard.nextLine();

      System.out.print("별점? ");
      ratedStar[i] = keyboard.nextInt();
      keyboard.nextLine();

      System.out.print("코멘트? ");
      comments[i] = keyboard.nextLine();

      System.out.print("키워드? ");
      keywords[i] = keyboard.nextLine();

      System.out.print("시작일? ");
      startDate[i] = Date.valueOf(keyboard.nextLine()); 

      System.out.print("종료일? ");
      endDate[i] = Date.valueOf(keyboard.next()); 
      keyboard.nextLine();

      System.out.print("어디까지봤니? ");
      watchedEpisode[i] = keyboard.nextInt();
      keyboard.nextLine();

      count++;

      System.out.println();
      System.out.println("계속 입력하시겠습니까?(Y/n)");
      response = keyboard.next();

      if(!response.equalsIgnoreCase("y")) {
        break;
      }
    }

    keyboard.close();
    
    System.out.println();
    
    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %-10s, %s ~ %s, %d\n", no[i], titleKor[i], startDate[i], endDate[i], 
          watchedEpisode[i]);
    }
    
  }
}



