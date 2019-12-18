package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class Test03_t4 {

  public static void main(String[] args) {

    //1. 현재와 가장가까운 test1번 소스를 가져온다.

    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변의 길이? ");
    
    //2. if 문으로 짝수 별 개수는 건너 뛴다. 짝수길이는 정삼각형 출력 불가능하다. (두칸씩 증가하는게 더 쉬움, break쓰려고 일부러하것.)
    
    //3. 1,2,3행에 공백2,1,0개 찍어줘야함.(정삼각형) 
    
    //4. 밑변의 길이? 6 짝수일때 앞에 공백생기는 문제
//     *
//    ***
//   *****
//  문제
   
    
    int width = keyScan.nextInt();

    if (width % 2 == 0)
      width--;

    int spaceSize = width >> 1; //(=> width / 2)
    int line = 0; 
    while (line++ < width) {
      if (line%2 == 0) {
        continue;
      }
     
      int count = 0;
      while (count++ < spaceSize) {
        System.out.print(" ");
      }
      spaceSize--;
      
      int x = 0;             
      while ( x++ < line) { 
      System.out.print("*"); 
      }
      System.out.println();
    }
    
    
    
    keyScan.close();
 }
}