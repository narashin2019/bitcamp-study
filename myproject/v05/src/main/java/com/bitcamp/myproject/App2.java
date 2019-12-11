package com.bitcamp.myproject;

import java.util.Scanner;

public class App2 {
  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("번호? ");
    String no = keyboard.nextLine();
    
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
    
    System.out.print("가입일? ");
    String registeredDate = keyboard.nextLine();
    //import java.sql.Date;
    //Date registeredDate = new Date(System.currentTimeMillis()); 
    
    
    
    System.out.println();
    System.out.printf("번호: %s\n", no);
    System.out.printf("이름: %s\n", name);
    System.out.printf("이메일: %s\n", email);
    System.out.printf("암호: %s\n", password);
    System.out.printf("사진: %s\n", photo);
    System.out.printf("전화: %s\n", tel);
    System.out.printf("가입일: %s\n", registeredDate);
    

    keyboard.close();
    
  }
}



//   System.out.printf("번호: %d\n", 1);
//   System.out.printf("이름: %s\n", "홍길동");
//   System.out.printf("이메일: %s\n", "hong@test.com");
//   System.out.printf("암호: %s\n", "1111");
//   System.out.printf("사진: %s\n", "hong.png");
//   System.out.printf("전화: %s\n", "1111-1111");
//   System.out.printf("가입일: %s\n", "2019-01-01");
