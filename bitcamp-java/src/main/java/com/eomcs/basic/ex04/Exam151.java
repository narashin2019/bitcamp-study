package com.eomcs.basic.ex04;

//# 변수 사용 II
//- 다른 변수에 값을 저장할 때 사용할 수 있다.

public class Exam151 {
  public static void main(String[] args) {
    // 변수 사용

    int i;
    i = 100;

    System.out.println(i);

    int j;
    j = i; // i 변수에 들어있는 값을 j변수에 넣어라

    // 할당연산자 '='
    // - 변수에 값을 넣은 일을 한다.
    // - 문법: 
    //   l-value = r-value
    //   l-value : 변수가 와야 한다. 값이 올 수 없다.
    //   r-value : 값, 변수(값이 들어있는), 표현식(expression)이 올 수 있다.
    i = 100;
    //200 = 300 ; 오류
    //200 = i; 오류
    
    j =  300; //값
    j = i; // 변수
    j = i * 3; // 표현식
    j = Math.abs(-200); // 표현식 (절대값으로 만들어 리턴하라는 메소드 표현식)
                        // int java.lang.Math.abs(int a) (int 값이 리턴되며 java.lang에 속하는 함수고 java.lang은 생략가능하며~)
    j = (i > 100) ? 1 : -1; // 표현식
    //j = System.out.println(100); // 표현식이 아니다. 그냥 문장이다. 컴파일오류 incompatible types: void cannot be converted to int
                                 // void java.io.PrintStream.println(int x) (void = 리턴 값이 없다)
    //문장(statement)
    // - 자바 언어로 작성한 명령어
    //
    //표현식(expression)
    // - 문장 중에 "값을 리턴하는" 문장






  }
}


/*
int age1 = 20;
    
//r-value 자리에 변수를 놓을 수 있다.
int age2 = age1;

//의미
//- age1에 저장된 값을 age2에 복사하라!

//age1과 age2는 같은 메모리가 아니다.
//증명
//- age1의 값을 변경한다.
age1 = 30;

System.out.println(age1);
System.out.println(age2);
*/