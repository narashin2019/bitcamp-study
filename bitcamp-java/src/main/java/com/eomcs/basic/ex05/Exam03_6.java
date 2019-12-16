package com.eomcs.basic.ex05;

//# 논리 연산자 : 조건문과 비트 연산 

public class Exam03_6 {
    public static void main(String[] args) {
        // &&, ||, ! 의 피연산자(operand)는 반드시 boolean 이어야 한다.
        // 그리고 계산 결과는 boolean이다.
        boolean r;
        //r = 10 && 20; // 컴파일 오류!
        //r = 10 || 20; // 컴파일 오류!

        // &, |, ^, ~(not) 의 피연산자는 정수이어야 한다. (부동소수점은 안된다.)
        // 그리고 계산 결과도 정수이다.
        //r = 10 & 20; // 컴파일 오류! 비트 연산의 결과는 정수이다. 정수를 불린r에 넣을 수 없어서 오류
        int r2 = 10 & 20; // OK!
        System.out.println(r2);
        //float r3 = 10.2f & 20.3f; // 컴파일 오류!
    }
}

