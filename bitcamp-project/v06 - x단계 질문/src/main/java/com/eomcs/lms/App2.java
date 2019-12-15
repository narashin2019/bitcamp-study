package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    final int LENGTH = 10000;
    String response;
    int count = 0;

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
      keyboard.nextLine(); // 줄바꿈 기호 제거용

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

      //System.out.print("가입일? ");
      registeredDate[i] = new Date(System.currentTimeMillis());  
      
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

    for (int i=0; i<count; i++) {
      System.out.printf("%d, %s, %s, %s, %s, %s %s\n", no[i], name[i], email[i], password[i], photo[i],
          tel[i], registeredDate[i]);
    }

  }
}
