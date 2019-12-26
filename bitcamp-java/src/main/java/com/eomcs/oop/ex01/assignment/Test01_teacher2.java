package com.eomcs.oop.ex01.assignment;

import java.util.Scanner;

public class Test01_teacher2 {

  public static void main(String[] args) {

    class Score {
      String name;
      int kor;
      int eng;
      int math;
      //int sum; 얘네는 할 필요 없음
      //float avr;
    }

    Score[] arr = new Score[3];

    for (int i = 0; i < arr.length; i++) {
      Scanner keyscan = new Scanner(System.in);

      Score s = new Score(); // 이방식으로 해!!***************

      s.name = keyscan.next(); // next line아님!!!!
      s.kor = keyscan.nextInt();
      s.eng = keyscan.nextInt();
      s.math = keyscan.nextInt();

      arr[i] = s; //이방식*************

      keyscan.close();
    }
    


    System.out.println("-------------------------");

    for (int i = 0; i < arr.length; i++) {
      Score s = arr[i];
      int sum = s.kor + s.eng + s.math;
      float aver = sum / 3f;
          System.out.printf("%s. %d, %d, %d, %d, %.1f,\n", 
              s.name, s.kor, s.eng, s.math, sum, aver);
    }


  }
}
