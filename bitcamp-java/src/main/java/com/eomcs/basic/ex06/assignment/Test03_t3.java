package com.eomcs.basic.ex06.assignment;
// 공백을 넣는 법 생각하자.
//space size변수 추가. 반복문 추가 > 다음단계에서 메소드로 바꿈
import java.util.Scanner;

public class Test03_t3 {

  public static void main(String[] args) {

    Scanner keyScan = new Scanner(System.in);

    System.out.print("밑변의 길이? ");
    int width = keyScan.nextInt();
    
    //이건 왜 넣은거지?
    if (width % 2 == 0)
      width--;
    
    // 1,3,5행에 공백2,1,0개 찍어줘야함.(정삼각형) 
    int spaceSize = width >> 1; //(=> width / 2)
    int line = 0; 
    while (line++ < width) {
      if (line % 2 == 0) { //짝수행은 뺸다
        continue;
      }
     
      int count = 0;
      while (count++ < spaceSize) {
        System.out.print(" ");
      }
      spaceSize--;
      
      int x = 0;             
      while (x++ < line) { 
      System.out.print("*"); 
      }
      System.out.println();
    }
    keyScan.close();
 }
}