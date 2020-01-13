package com.eomcs.oop.ex01.assignment;

import java.util.Scanner;

public class Test01_me1 {


  public static void main(String[] args) {
    Scanner keyscan = new Scanner(System.in);

    class Score {
      String name;
      int kor;
      int eng;
      int math;
      int sum;
      float avr;
    }

    final int SIZE = 100;
    Score[] scores = new Score[SIZE];
    int count = 0;


    for (int i = 0; i < SIZE; i++) {
      
      count++;

      Score score = new Score();

      System.out.print("입력: ");
      score.name = keyscan.next();
      score.kor = keyscan.nextInt();
      score.eng = keyscan.nextInt();
      score.math = keyscan.nextInt();
      keyscan.nextLine();

      score.sum = score.kor + score.eng+ score.math;
      score.avr = score.sum / 3f;
      
      scores[i] = score;

      System.out.println();
      System.out.print("계속 입력하시겠습니까?(Y/n) ");
      System.out.println();
      String response = keyscan.next();

      if(!response.equalsIgnoreCase("y")) {
        break;
      }
    }

    
    

    System.out.println();

    for (int i = 0; i < count; i++) {
      Score s = scores[i];
      System.out.printf("%s, %d, %d, %d, %d, %.1f,\n", s.name, s.kor, s.eng, s.math, s.sum, s.avr);
    }


    keyscan.close();
  }
}
