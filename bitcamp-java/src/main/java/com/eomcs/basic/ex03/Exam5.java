package com.eomcs.basic.ex03;

// 논리 리터럴(literal)
// 
  public class Exam5 {
    public static void main(String[] args) {
   
      // 참 : ture
      // 거짓 : false
      // 자바는 대소문자 구분하여 처리함. 
      System.out.println(true);
      System.out.println(false);
      // System.out.println(TRUE); // 컴파일 오류! error: cannot find symbol

      // 데이터타입에 트루 펄스가 있다는 것. boolean. 씨는 없다.

      // 보통 비교 연산의 결과로 논리 값이 리턴된다.
      System.out.println(4 < 5);  //t
      System.out.println(4 > 5);  //f

      // 논리 연산의 결과도 논리 값이다.
      System.out.println(true && true);   //t
      System.out.println(true && false);  //f
      System.out.println(true || true);   //t
      System.out.println(true || false);  //t

      // 문자 코드와 ''연산
      // '문자' 단독으로 사용될 때는 문자로 취급하지만
      // 다른 값과 연산을 수행하면 해당 문자코드는 그냥 정수로 간주한다.
      System.out.println('가' == 44032);  //t
      System.out.println('가' == 44033);  //f


    }
  }

// boolean 논리 값을 다룰 때 메모리 크기?
// JVM은 논리 값을 저장할 때 4바이트 메모리(int)를 사용한다.
// true(1), false(0)만 저장한다.
// 논리 배열인 경우 1바이트 정수 배열의 메모리를 사용한다.


// https://docs.oracle.com/javase/specs/ The Java Language Specification 11 html 참고 4.2.1
// 자바랭귀지 스펙에 불린의 크기 안나옴. 불린 1바이트라고 써져 있는건 근거 없는 것.
// char: 2바이트 리터럴, 2바이트 유니코드로 저장
// https://docs.oracle.com/javase/specs/jvms/se11/html/jvms-2.html#jvms-2.3 