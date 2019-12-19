package com.bitcamp.myproject;

import java.util.Scanner;
import java.sql.Date;

public class App {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    class ShowInfo {
      int no;
      String country;
      String genres;
      String titleKor;
      String titleEng;
      int ratedStar;
      String comments;
      String keywords;
      Date startDate;
      Date endDate;
      int watchedEpisode;
    }
    
    final int SIZE = 1000;

    // 인스턴스의 주소를 담을 배열을 생성한다.
    ShowInfo[] showInfos = new ShowInfo[SIZE];
    
    
    int count = 0;
    String response;

    for (int i = 0; i < count; i++ ) {
      count++;
      
      ShowInfo showInfo = new ShowInfo();

      System.out.print("번호? ");
      showInfo.no = keyboard.nextInt();
      keyboard.nextLine();

      System.out.print("국가? ");
      showInfo.country = keyboard.nextLine();

      System.out.print("장르? ");
      showInfo.genres = keyboard.nextLine();

      System.out.print("제목한글? ");
      showInfo.titleKor = keyboard.nextLine();

      System.out.print("제목영문? ");
      showInfo.titleEng = keyboard.nextLine();

      System.out.print("별점? ");
      showInfo.ratedStar = keyboard.nextInt();
      keyboard.nextLine();

      System.out.print("코멘트? ");
      showInfo.comments = keyboard.nextLine();

      System.out.print("키워드? ");
      showInfo.keywords = keyboard.nextLine();

      System.out.print("시작일? ");
      showInfo.startDate = Date.valueOf(keyboard.nextLine()); 

      System.out.print("종료일? ");
      showInfo.endDate = Date.valueOf(keyboard.next()); 
      keyboard.nextLine();

      System.out.print("어디까지봤니? ");
      showInfo.watchedEpisode = keyboard.nextInt();
      keyboard.nextLine();

      showInfos[i] = showInfo;

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
      ShowInfo showInfo = showInfos[i];
      System.out.printf("%d, %-10s, %s ~ %s, %d\n", showInfo.no, showInfo.titleKor,
          showInfo.startDate, showInfo.endDate, showInfo.watchedEpisode);
    }
    
  }
}



