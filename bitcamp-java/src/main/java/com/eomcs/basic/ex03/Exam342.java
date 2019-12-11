package com.eomcs.basic.ex03;

// 부동소수점 리터럴(literal) - 부동소수점의 리터럴은 기본은 왜 8바이트 인가?
// 
  public class Exam342 {
    public static void main(String[] args) {
      
      System.out.println(54345.66f);
      System.out.println(11.23456f);

      //  54345.66      (7자리 ok)
      // +   11.23456   (7자리 ok)
      //-----------
      //  54356.89456   (10자리: 계산 결과가 유효자릿수를 넘는다)
      System.out.println(54345.66f + 11.23456f); //54356.895 출력


    // 실행 결과를 보면 기대했던 수가 출력되지 않는다.
    // 왜?
    // 각각의 수는 유효자릿수이지만,
    // 계산 결과는 유효자릿수를 넘어가기 때문에 값이 구겨진다.
    // => 이렇게 작은 부동소수점인 경우도 
    //    유효자릿수를 쉽게 넘어가기 때문에
    //    그래서 자바는 기본으로 8바이트 메모리를 사용한다. (접미사가 없으면 double)

    //
    // 자바로 프로그래밍을 할 때 부동소수점은 8바이트로 다뤄라!
 
   
      
    }
  }