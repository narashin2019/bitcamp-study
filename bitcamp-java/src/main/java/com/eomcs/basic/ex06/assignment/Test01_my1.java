package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class Test01_my1 {

  public static void main(String[] args) {

    System.out.println("밑변 길이? ");

    Scanner keyScan = new Scanner(System.in);
    int user = keyScan.nextInt();

    int i = 1;
    
    while (i <= user) {
      int j = 1;
      while (j <= user) {
        if (i>=j) {
          System.out.print("*");
        }
        j++;
      }
      System.out.println();
      i++;
    }

    keyScan.close();


//    for (int i=1; i<=user; i++) {
//      for (int j=1; j<=user; j++) {
//        if (i>=j) {
//          System.out.print("*");
//        }
//      }
//      System.out.println();
//    }




  }

}
