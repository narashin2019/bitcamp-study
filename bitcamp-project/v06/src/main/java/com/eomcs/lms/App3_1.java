package com.eomcs.lms;
//배열에 조건문(반복문) + 입력을 카운트하기 count 변수 사용+ 메서드 만들기 
import java.sql.Date;
import java.util.Scanner;

public class App3_1 {

  static final int LENGTH = 10000;
  static Board301[] boards = new Board301[LENGTH];
  static int count = 0;

  public static void main(String[] args) {
    inputBoards();
    
    //System.out.println();
    
    printBoards();
  }

  static void inputBoards() {
    Scanner keyboard = new Scanner(System.in);
    String response;

    for (int i = 0; 1 < LENGTH; i++) {
      Board301 b = new Board301();
      
      System.out.print("번호? ");
      b.no = keyboard.nextInt(); //b식판에 no 넣어라
      keyboard.nextLine(); 

      System.out.print("제목? ");
      b.title = keyboard.nextLine();

      System.out.print("내용? ");
      b.contents = keyboard.nextLine();

      b.date = new Date(System.currentTimeMillis());

      b.viewCount = 0;

      boards[i] = b;  // boards=배식차 식판을 담는 식판을 배식차 지정된 위치에 꼽는다

      count++; // => count = count + 1;

      System.out.println();

      System.out.print("계속 입력하시겠습니까?(Y/n) ");
      response = keyboard.next();
      System.out.println();
      if (!response.equalsIgnoreCase("y")) {
        break;
      }
    }
    
    keyboard.close();
  }

  static void printBoards() {
    for (int i = 0; i < count; i++) {
      Board301 b = boards[i];
      System.out.printf("%d, %s, %s, %s, %d\n", 
          b.no, b.title, b.contents, b.date, b.viewCount);
    }
  }

}
