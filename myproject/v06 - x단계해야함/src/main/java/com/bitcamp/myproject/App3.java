package com.bitcamp.myproject;

import java.sql.Date;
import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);


    final int LENGTH = 10000;
    
    int[] no = new int[LENGTH] ; 
    String[] title = new String[LENGTH];  
    String[] contents = new String[LENGTH];
    Date[] date = new Date[LENGTH];
    int[] viewCount = new int[LENGTH];
    
    String response;
    int count = 0;
    
    
    for (int i = 0; i < LENGTH; i++) {
      System.out.print("번호? ");
      no[i] = keyboard.nextInt();
      keyboard.nextLine(); 

      System.out.print("제목? ");
      title[i] = keyboard.nextLine();
      
      System.out.print("내용? ");
      contents[i] = keyboard.nextLine();

      date[i] = new Date(System.currentTimeMillis());

      viewCount[i] = 0;

      count++; // => count = count + 1;
          
      System.out.println();
      System.out.print("계속 입력하시겠습니까?(Y/n) ");
      System.out.println();
      response = keyboard.next();
      System.out.println();
      if (!response.equalsIgnoreCase("y")) {
        break;
      }
    }

    keyboard.close();

    System.out.println();

    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %-11s, %s, %d\n", no[i], title[i], date[i], viewCount[i]);
    }

  }
}