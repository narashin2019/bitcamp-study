package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

<<<<<<< HEAD
    final int SIZE = 100; // 대부분 상수는 대문자로 이름 표시함. 최대 100명의 회원정보 저장할 수 있는 저장공간 생성.

    int[] no = new int[SIZE];
    String[] name = new String[SIZE];
    String[] email = new String[SIZE];
    String[] password = new String[SIZE];
    String[] photo = new String[SIZE];
    String[] tel = new String[SIZE];
    Date[] registeredDate = new Date[SIZE]; //암기

=======
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
>>>>>>> 92a55817b134d6b20114af6628d166449a754fc5

    int count = 0; // 입력받은 개수 카운트하기 위한 변수. 밑에 출력에 사용
    for (int i = 0; i < SIZE; i++) {
      count++;
      
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
      registeredDate[i] = new Date(System.currentTimeMillis()); // 암기


      System.out.print("계속 입력하시겠습니까?(Y/n) ");
      String response;
      response = keyboard.nextLine();
      if(!response.equalsIgnoreCase("y")) {
        break;
      }
    }
    keyboard.close();

    System.out.println();

    for (int i=0; i<count; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n", 
          no[i], name[i], email[i], tel[i], registeredDate[i]);
    }

  }
}
