package com.bitcamp.myproject;

import java.sql.Date;
import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);


    final int size = 10000;
    
    int[] no = new int[size] ; 
    String[] title = new String[size];  
    String[] contents = new String[size];
    Date[] date = new Date[size];
    int[] viewCount = new int[size];
    
    String response;
    int count = 0;
    
    
    for (int i = 0; 1 < 5; i++) {
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