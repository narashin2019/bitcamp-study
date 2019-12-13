package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);


    final int size = 100000;

    int[] no = new int[size];
    String[] title = new String[size];
    String[] description = new String[size]; 
    Date[] startDate = new Date[size];
    Date[] endDate = new Date[size];
    int[] totalHours = new int[size];
    int[] dayHours = new int[size];

    String response;
    
    int count = 0;
    
    for (int i=0;1<size;i++) {
      System.out.print("번호? ");
      no[i] = keyboard.nextInt(); 
      keyboard.nextLine(); // nextInt()후에 남아 있는 줄바꿈 기호를 제거하는 용이다.

      System.out.print("수업명? ");
      title[i] = keyboard.nextLine();

      System.out.print("설명? ");
      description[i] = keyboard.nextLine();

      System.out.print("시작일? ");
      startDate[i] = Date.valueOf(keyboard.next());

      System.out.print("종료일? ");
      endDate[i] = Date.valueOf(keyboard.next());

      System.out.print("총수업시간? ");
      totalHours[i] = keyboard.nextInt();

      System.out.print("일수업시간? ");
      dayHours[i] = keyboard.nextInt();

      count++;

      System.out.println();
      System.out.print("계속 입력하시겠습니까?(Y/n) ");
      System.out.println();
      response = keyboard.next();
      
      if(!response.equalsIgnoreCase("y")) {
        break;
      }
    }


    keyboard.close();


    System.out.println();
    
    for(int i=0;i<count;i++) {
    System.out.printf("%d, %s, %s, %s, %s, %d, %d\n", no[i], title[i], description[i], startDate[i],
        endDate[i], totalHours[i], dayHours[i]);
    }
    
  }
}
