package com.eomcs.oop.ex01.assignment;

import java.util.Scanner;

public class Test01_me {

  
  public static void main(String[] args) {
    
    class Stu {
      String name;
      int kor;
      int eng;
      int math;
      int sum;
      float avr;
    }
    
    Stu[] arr = new Stu[3];
    
    for (int i = 0; i < arr.length; i++) {
      arr[i] = new Stu();
    }
    
    Scanner keyscan = new Scanner(System.in);

    for (int i = 0; i < arr.length; i++) {
    
    System.out.print("입력: ");
    arr[i].name = keyscan.next();
    arr[i].kor = keyscan.nextInt();
    arr[i].eng = keyscan.nextInt();
    arr[i].math = keyscan.nextInt();
    keyscan.nextLine();
    arr[i].sum = arr[i].kor + arr[i].eng+ arr[i].math;
    arr[i].avr = arr[i].sum / 3f;
        
    }

    keyscan.close();
    
    for (int i = 0; i < arr.length; i++) {
    System.out.printf("%s, %d, %d, %d, %d, %.1f,\n", arr[i].name, arr[i].kor, arr[i].eng, arr[i].math, arr[i].sum, arr[i].avr);
    }
    
    
  }
}
