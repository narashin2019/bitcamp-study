package com.eomcs.basic.ex06.assignment;

//import java.util.Scanner;

public class Test02_2_idontunderstand {

  public static void main(String[] args) {

    int maxStars = 5;       // 최대 별 수
    int currentStars = 1;   // 그려야할 별 수
    boolean plusSW = true;  // 별 수가 증가해야할지 감소해야할지 알게 하는 논리변수
    while(currentStars > 0) {
      // 현재 별 수가 0 초과일 때 (1,2,3,4,5)
      
      for(int colStar = 1; colStar <= currentStars; colStar++) {
        System.out.print('*'); // 그려야할 별 수만큼 * 표시
      }
      
      for(int colSpc = 1; colSpc <= maxStars-currentStars; colSpc++) {
        System.out.print('.'); // 최대 별 수에서 그려야할 별 수를 뺀 나머지 만큼 공백 표시
      }

      System.out.println();
      

      if(currentStars >= maxStars) {
        // 최대 별 수에 도달하면 이제 별 수가 감소하도록 합니다.
        plusSW = false;
      }


      if(plusSW) {
        // 현재 별 수는 증가해야 합니다.
        currentStars++;
      } else {
        // 현재 별 수는 감소해야 합니다.
        currentStars--;
      }

    }
    
    
  }
}