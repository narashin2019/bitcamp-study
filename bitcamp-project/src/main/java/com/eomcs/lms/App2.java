package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    final int size = 10000;
    String response;
    int count = 0;

    int[] no = new int[size];
    String[] name = new String[size];
    String[] email = new String[size];
    String[] password = new String[size];
    String[] photo = new String[size];
    String[] tel = new String[size];
    Date[] registeredDate = new Date[size];

    for (int i = 0; i < size; i++) {

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
