//# 과제1 : 입력 받은 두 정수 사이의 합계를 구하라.
//실행 예)
//입력? 2 5
//2에서 5까지의 합은 14입니다.
//

package com.eomcs.basic.ex05.assignment;

import java.util.Scanner; // 밑에나오는 스캐너는 java.util패키지에 있는 스캐너다 선언.

public class Test1_3_teacher2 {
  public static void main(String[] args) {

    // 1. 사용자에게 입력 값을 2개 받는다.
    System.out.println("입력?");
    Scanner keyscan = new Scanner(System.in); 
    int start = keyscan.nextInt();
    int end = keyscan.nextInt();
    System.out.printf("%d, %d\n", start, end); // 입력받은 숫자 출력
    keyscan.close();

    // 2. 합계를 담을 변수를 만든다.
    int sum = 0;

    // 3. 변수 start부터 +1 증감한 숫자를 변수 end까지 더한다.
    int no = start;
    while(no <= end) {
      sum = sum + no; 
      no = no + 1;
    }

    // 4. 결과 값을 출력한다.
    System.out.printf("%d에서 %d까지의 합은 %d입니다.%n", start, end, sum);


    // 5. 결과 피드백을 바탕으로 코드 수정
    // => 잘 나온다!


    // 6. 개선할 것 없는 지 보면서 변수이름도 바꾸고 반복문도 간결하게 바꾸고 리팩토링
    // 

  }
}
