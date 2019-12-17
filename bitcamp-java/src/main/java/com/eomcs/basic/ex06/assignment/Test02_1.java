package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class Test02_1 {

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

    int a = 1;
    
    while (a <= user-1) {
      int b = 1;
      while (b <= user-1) {
        if (a+b<=6) {
          System.out.print("*");
        }
        b++;
      }
      System.out.println();
      a++;
    }

    
    
    scanner.close();


    //            for (int i=1; i<6; i++) {
    //              for (int j=1; j<6; j++) {
    //                if (i>=j) {
    //                  System.out.print("*");
    //                }
    //              }
    //              System.out.println();
    //            }




  }

}
