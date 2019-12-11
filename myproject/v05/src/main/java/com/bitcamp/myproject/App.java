package com.bitcamp.myproject;

import java.util.Scanner;
//import java.sql.Date;

public class App {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("번호? ");
    String no = keyboard.nextLine();
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
    String ratedStar = keyboard.nextLine(); 
    
    System.out.print("코멘트? ");
    String comment = keyboard.nextLine();
    
    System.out.print("키워드? ");
    String keywords = keyboard.nextLine();
    
    System.out.print("시작일? ");
    String startDate = keyboard.nextLine();
    //Date startDate = Date.valueOf(keyboard.nextLine()); 
    
    System.out.print("종료일? ");
    String endDate = keyboard.nextLine();
    //Date endDate = Date.valueOf(keyboard.nextLine()); 
    
    System.out.print("어디까지봤니? ");
    String watchedEpisode = keyboard.nextLine();
    
    
    System.out.println();
    System.out.printf("번호: %s\n", no);
    System.out.printf("국가: %s\n", country);
    System.out.printf("장르: %s\n", genres);
    System.out.printf("제목한글: %s\n", titleKor);
    System.out.printf("제목영문: %s\n", titleEng);
    System.out.printf("별점: %s\n", ratedStar); // 입력 실수에 따라 별로 나타나게
    System.out.printf("코멘트: %s\n", comment);
    System.out.printf("키워드: #%s\n", keywords); //키워드 여러개 입력시 #붙어서 출력
    System.out.printf("기간: %s ~ %s\n", startDate, endDate); //엔드데이트 미입력시 end cancel ing 중에 선택하거나 나오게 하고 싶음
    System.out.printf("어디까지봤니: %s\n", watchedEpisode); // 00x00형식으로 하고 싶음

    keyboard.close();
  }
}



//번호: 1
//국가: 미국
//장르: 범죄
//제목한글: 브레이킹배드
//제목영문: Breaking Bad
//(삭제)제목별칭: 브배, 브베
//별점: ★★★★★
//코멘트: 죽기 전에 꼭 봐야할 개명작
//키워드: #범죄 #마약 #드라마 #명작 #미드 #명연기 #웰메이드 #죽전꼭봐
//상태: 완결
//2020현재시즌: 05x16
//어디까지봤니: 05x16
//


