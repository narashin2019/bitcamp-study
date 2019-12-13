package com.bitcamp.myproject;

import java.util.Scanner;
import java.sql.Date;

public class App2 {
  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
    
    final int size = 10000; 
    int count = 0;

    int
    
    
    System.out.print("번호? ");
    int no = keyboard.nextInt();
    keyboard.nextLine();
    
    System.out.print("이름? ");
    String name = keyboard.nextLine();
    
    System.out.print("이메일? ");
    String email = keyboard.nextLine();
    
    System.out.print("암호? ");
    String password = keyboard.nextLine();

    System.out.print("사진? ");
    String photo = keyboard.nextLine();

    System.out.print("전화? ");
    String tel = keyboard.nextLine();
    
    Date registeredDate = new Date(System.currentTimeMillis()); 
    keyboard.nextLine();
    
    keyboard.close();
    
    System.out.println();
    
    for (int i = 0; i < count; i++) {
    System.out.printf("%d, %s, %-30d, %-16d, %s\n", no[i], name[i], email[i], tel[i], registeredDate[i]);
    }

  
    
  }
}

