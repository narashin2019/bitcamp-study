package com.eomcs.oop.ex01;

//# 클래스 - 사용 전
//
public class Exam0110 {
  public static void main(String[] args) {
    // 낱개의 변수를 사용하여 한 사람의 성적 정보를 저장하라!
    // => 식탁에 밥, 국, 반찬1, 반찬2, 반찬3 을 각각 따로 가져오는 상황. 그릇 6개
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    name = "홍길동";
    kor = 100;
    eng = 90;
    math = 85;
    sum = kor + eng + math;
    aver = (float)sum / 3; // 명시적 형변환 해야 정확히 플롯으로 나눔/한쪽만 붙여도 암시적형변환으로 float으로 됨/
                           //변수의 타입은 한번 선언하면 바뀌지 않음 

    System.out.printf("이름: %s\n", name);
    System.out.printf("국어: %d\n", kor);
    System.out.printf("영어: %d\n", eng);
    System.out.printf("수학: %d\n", math);
    System.out.printf("합계: %d\n", sum);
    System.out.printf("평균: %.1f\n", aver);
  }
}

// 식당에서 100명이 온다면? 배식개념! 
//=>클래스 사용하여 각각의 메모리를 한단위로 다루는 새 메모리 구조를 설계 
//
// 클래스 문법은 2가지 사용법:
//1)사용자정의 데이터 타입만들기 
//2)관련된 메소드를 묶을 때 : java.lang.math 수학과 관련된 메소드 다 있음
// javaAPI자바도구들을 기술한 문서.