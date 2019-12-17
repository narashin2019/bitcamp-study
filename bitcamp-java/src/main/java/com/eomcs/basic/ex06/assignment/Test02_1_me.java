package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class Test02_1_me {

  public static void main(String[] args) {

    System.out.println("밑변 길이? ");

    Scanner scanner = new Scanner(System.in);
    int user = scanner.nextInt();

    int i = 1;
    
    while (i <= user-1) {
      int j = 1;
      while (j <= user-1) {
        if (i >= j) {
          System.out.print("*");
        }
        j++;
      }
      System.out.println();
      i++;
    }

    int a = 1;
    
    while (a <= user) {
      int b = 1;
      while (b <= user) {
        if (a+b <= 6) {
          System.out.print("*");
        }
        b++;
      }
      System.out.println();
      a++;
    }

    
    
    scanner.close();


    //            for (int i=1; i<=5; i++) {
    //              for (int j=1; j<=5; j++) {
    //                if (i>=j) {
    //                  System.out.print("*");
    //                }
    //              }
    //              System.out.println();
    //            }




  }

}

/*
int i = 1;

while (i <= user) {
  int j = 1;
  while (j <= user) {
    if (i >= j) {
      System.out.print("*");
    }
    j++;
  }
  System.out.println();
  i++;
}

int a = 1;

while (a <= user) {
  int b = 1;
  while (b <= user) {
    if (a+b <= 5) {
      System.out.print("*");
    }
    b++;
  }
  System.out.println();
  a++;
}
*/