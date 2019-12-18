package com.eomcs.basic.ex06;

//# 흐름 제어문 - if 문의 조건
//
public class Exam1_3 {
  public static void main(String[] args) {

    // if 문의 조건은 반드시 boolean 데이터여야 한다. true 또는 false여야함.
    if (true) System.out.println("1111");
    if (false) System.out.println("2222");
    if (10 < 8 + 5) System.out.println("3333");

    // 그 외의 모든 데이터 타입은 컴파일 오류이다.
    //if (1) System.out.println("4444"); // 컴파일 오류!
    //if (3.14f) System.out.println("4444"); // 컴파일 오류!
    //if (0b0110 & 0b0011) System.out.println("4444"); // 컴파일 오류! 비트연산자&는 결과값 수가 나온다

    // == 연산자 대신 =을 사용한 경우,(오타)
    int a = 100;
    if (a == 100) System.out.println("5555"); // OK!

    // 다음은 a 변수에 100을 넣는다.
    // 그런데 a가 boolean이 아니기 때문에 컴파일 오류가 발생한다.
    //if (a = 100) System.out.println("6666"); // 컴파일 오류! c는 가능
 
    boolean b;
    if (b = true) System.out.println("된다!");
  }
}