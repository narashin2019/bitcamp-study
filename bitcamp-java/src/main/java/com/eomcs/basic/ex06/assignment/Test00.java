package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class Test00 {

  public static void main(String[] args) {

    System.out.println("밑변 길이? ");

    Scanner scanner = new Scanner(System.in);
    int user = scanner.nextInt();

    for (int i=1; i<=user; i++) {
      for (int j=1; j<=user; j++) {
        if (i>=j) {
          System.out.print("*");
        }
      }
      System.out.println();
    }


    scanner.close();


  }

}
