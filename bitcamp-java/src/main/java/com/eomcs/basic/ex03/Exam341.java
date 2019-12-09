package com.eomcs.basic.ex03;

// 부동소수점 리터럴(literal) - 부동소수점을 메모리에 저장하기
// 
  public class Exam341 {
    public static void main(String[] args) {
      
      float f = 12.375f;
      // 컴파일러가 바이트코드로 바꿀 때
      // 12.375 또한 정규화하여 변환된다.
      // 12.375의 2진수는 0x41460000 이다.
      // .class 파일을 읽어서 이 값을 찾아보라 ! (sumlime text로 읽기)
      
    }
  }

/*
package com.eomcs.basic.ex03;

//# 부동소수점의 리터럴 - 2진수로 변경된 것을 확인하기
//- 자바가 부동소수점을 다룰 때 IEEE 754 규칙에 따라 2진수로 변환하는 것을 확인해 보자.

public class Exam35 {
  public static void main(String[] args) {
    System.out.println(12.375f);
  }
}

//## 실습
//1) 컴파일하기
//- $ javac -d bin/main -encoding UTF-8 src/main/java/com/ohoracs/basic/ex03/Exam35.java
//
//2) 클래스 파일로 부동소수점 값 확인하기
//- Exam35.class 파일을 hexdump 플러그인으로 출력한다.
//- 12.375의 2진수 값인 0100_0001_0100_0110_0000_0000_0000_0000을 찾아본다.
//  보통 에디터에서는 2진수를 16진수로 바꿔 보여주기 때문에 16진수 값 0x41460000을 찾아보라!
//
*/