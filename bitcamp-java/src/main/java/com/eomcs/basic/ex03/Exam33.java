package com.eomcs.basic.ex03;

//# 부동소수점 리터럴(literal) - 최소값 최대값
// 
  public class Exam33 {
    public static void main(String[] args) {
      
      // 8바이트 부동소수점 최대/최소 값
      System.out.println(Double.MAX_VALUE); // 1.7976931348623157E308
      System.out.println(Double.MIN_VALUE); // 4.9E-324

      // 4바이트 부동소수점 최대/최소 값
      System.out.println(Float.MAX_VALUE); // 3.4028235E38
      System.out.println(Float.MIN_VALUE); // 1.4E-45

      // 개발자가 부동소수점의 정확한 범위를 계산하기가 쉽지않다.
      // 그래서 2진수 변환 규칙을 참고하여
      // '유효자리수'를 사용하여 값의 범위를 따진다.
      // 부동소수점을 2진수로 바꾸는 것 = "정규화(nomalized)"

      System.out.println(3.1415926535f); // 값이 구겨진다.
      System.out.println(3.141592653f); // 값이 구겨진다.
      System.out.println(3.14159265f); // 값이 구겨진다.
      System.out.println(3.1415926f); // 값이 구겨진다. 마지막자리가이상한수
      System.out.println(3.141592f); // OK! 
      System.out.println(3141.592f); // OK!
      System.out.println(31415.92f); // OK!
      System.out.println(314159.2f); // OK! 
      System.out.println(3141592.26f); // 값이 구겨진다.
      // 위 예제를 통해 일정 규칙을 찾을 수 있다. 
      // => 4바이트 메모리에 저장할 수 있는 부동소수점은 소수점의 위치에 상관없이
      //    숫자의 개수가 7이면 거의 정상적으로 저장하고 꺼낼 수 있다.
      //    이렇게 정상적으로 넣고 꺼낼 수 있는 부동소수점의 숫자 개수를 
      //    "유효자리수" 라고 부른다.
      //
      // => 주의!
      //    7자리라 하더라도 값이 구겨질 수 있다.
      //    즉 정상적으로 저장되지 않을 수 있다.
      //    그래서 부동소수점은 메모리에서 꺼낸 값을
      //    내부의 규칙에 따라 JVM이 보정해 준다.
      // => 100% 정확하게 저장되고 꺼내지 못하는 이유는?
      //    부동소수점을 2진수로 바꿀 때 IEEE 754 규칙에 따라
      //    변경하는데, 이 규칙에서 일부 부동소수점은 
      //    2진수로 정확히 변경되지 못하는 문제가 있다.
      // => 부동소수점 2진수로 바꿀때 IEEE 754로 바꾸는데 20~30년이나 되었으나,
      //    정확히 변경되지 못하는 문제가 있음에도 다른 방법이 없어서 쓰고 있다.
      //    100%완벽하게 변경하는 방법 못찾음.
      //    근데 해결 안했는데도 미사일 쏘고 화성에 탐사선 보냄. 오차율이 많지 않아. 실생활에 문제없는 문제.
      //
      // 부동소수점의 오차. https://scarlett.tistory.com/entry/자바-부동소수점-계산-정확한-계산이-필요할-때
      System.out.println((1.1f + 0.2f) == 1.3f); //false가 나옴.



    }
  }