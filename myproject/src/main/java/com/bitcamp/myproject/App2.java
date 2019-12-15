package com.bitcamp.myproject;

import java.util.Scanner;
import java.sql.Date;

public class App2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    final int LENGTH = 10000; 
    int count = 0;
    String response;

    int[] no = new int[LENGTH];
    String[] name = new String[LENGTH];
    String[] email = new String[LENGTH]; 
    String[] password = new String[LENGTH]; 
    String[] photo = new String[LENGTH]; 
    String[] tel = new String[LENGTH]; 
    Date[] registeredDate = new Date[LENGTH];


    for (int i = 0; i < LENGTH; i++) {
      System.out.print("번호? ");
      no[i] = keyboard.nextInt();
      keyboard.nextLine();

      System.out.print("이름? ");
      name[i] = keyboard.nextLine();

      System.out.print("이메일? ");
      email[i] = keyboard.nextLine();

      System.out.print("암호? ");
      password[i] = keyboard.nextLine();

      System.out.print("사진? ");
      photo[i] = keyboard.nextLine();

      System.out.print("전화? ");
      tel[i] = keyboard.nextLine();

      registeredDate[i] = new Date(System.currentTimeMillis()); 
      keyboard.nextLine();

      count++;
     
      System.out.println("계속 입력하시겠습니까?(Y/n)");
      System.out.println();
      response = keyboard.next();
      
      
        if (!response.equalsIgnoreCase("y")) {
          break;
        }
    }


    keyboard.close();

    System.out.println();

    for (int i=0; i<count; i++) {
      System.out.printf("%d, %s, %-30s, %-16s %s\n", no[i], name[i], email[i], tel[i], registeredDate[i]);
    }


  }
}

