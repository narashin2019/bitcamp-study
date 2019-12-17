package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class Test03 {

  public static void main(String[] args) {

    System.out.println("밑변 길이? ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();


    int i = 0;
    while (i <= num) {
      int j = 0;
      while (j <= num) {
        if (i <= num/2)// 위쪽 영역
        {
          if (i+j <= num/2-1)// 왼쪽 위 공백찍기
            System.out.print(" ");
          else if (j-i>=num/2+1) // 오른쪽 위 공백찍기
            System.out.print(" ");
          else
            System.out.print("*");// *찍기
        }
//        else if (i>num/2) //아래쪽 영역
//        {
//          if (i-j>=num/2+1) //왼쪽 밑 공백
//            System.out.print(" ");
//          else if (i+j>=num/2*3+1)//오른쪽 밑 공백
//            System.out.print(" ");
//          else
//            System.out.print("*"); // *찍기
//        }
        j++;
      }
      System.out.println();
      i++;
    }


    sc.close();

    
//    Scanner sc = new Scanner(System.in);
//    
//    System.out.println("밑변 길이? ");
//    
//    int num = sc.nextInt();
//    
//    for (int i=0;i<num;i++){
//      for (int j=0; j<num;j++)
//      {
//         if (i <= num/2)// 위쪽 영역
//         {
//            if (i+j <= num/2-1)// 왼쪽 위 공백찍기
//               System.out.print(" ");
//            else if (j-i>=num/2+1) // 오른쪽 위 공백찍기
//                System.out.print(" ");
//            else
//               System.out.print("*");// *찍기
//         }
//         else if (i>num/2) //아래쪽 영역
//         {
//            if (i-j>=num/2+1) //왼쪽 밑 공백
//                System.out.print(" ");
//            else if (i+j>=num/2*3+1)//오른쪽 밑 공백
//                System.out.print(" ");
//            else
//                System.out.print(" "); // *찍기
//         }
//      }
//      System.out.println();
//    }
//    
//    sc.close();
    
   }
  }