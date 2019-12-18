package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);


<<<<<<< HEAD
    final int SIZE = 100;
    
    int[] no = new int[SIZE];
    String[] title = new String[SIZE];
    String[] description = new String[SIZE]; 
    Date[] startDate = new Date[SIZE];
    Date[] endDate = new Date[SIZE];
    int[] totalHours = new int[SIZE];
    int[] dayHours = new int[SIZE];

=======
    final int LENGTH = 100000;

    int[] no = new int[LENGTH];
    String[] title = new String[LENGTH];
    String[] description = new String[LENGTH]; 
    Date[] startDate = new Date[LENGTH];
    Date[] endDate = new Date[LENGTH];
    int[] totalHours = new int[LENGTH];
    int[] dayHours = new int[LENGTH];
>>>>>>> 92a55817b134d6b20114af6628d166449a754fc5

    int count = 0;

    for (int i=0;1<SIZE;i++) {
      count++;

      System.out.print("번호? ");
      no[i] = keyboard.nextInt(); 
      keyboard.nextLine(); // nextInt()후에 남아 있는 줄바꿈 기호를 제거하는 용이다.

      System.out.print("수업명? ");
      title[i] = keyboard.nextLine();

      System.out.print("설명? ");
      description[i] = keyboard.nextLine();

      System.out.print("시작일? ");
      startDate[i] = Date.valueOf(keyboard.next()); // 암기. "yyyy-mm-dd"형태로 입력된 문자열을 날짜정보로 바꾼다.

      System.out.print("종료일? ");
      endDate[i] = Date.valueOf(keyboard.next());

      System.out.print("총수업시간? ");
      totalHours[i] = keyboard.nextInt();

      System.out.print("일수업시간? ");
      dayHours[i] = keyboard.nextInt();
      keyboard.nextLine(); // 일수업시간nextInt()후에 남아 있는 줄바꿈 기호를 제거하는 용.


      System.out.print("계속 입력하시겠습니까?(Y/n) ");
      String response = keyboard.nextLine(); //String response; + response = keyboard.nextLine(); 한문장으로 한 것 
      if(!response.equalsIgnoreCase("y")) { //암기 y가 아니라면 break;실행
        break;
      }
    }

    keyboard.close();

    System.out.println();

    for(int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s ~ %s, %d\n", 
          no[i], title[i], startDate[i], endDate[i], totalHours[i]);
    }

  }
}
