package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class Test01 {

  public static void main(String[] args) {

    System.out.println("밑변 길이? ");

    Scanner scanner = new Scanner(System.in);
    int user = scanner.nextInt();

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

    scanner.close();


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
