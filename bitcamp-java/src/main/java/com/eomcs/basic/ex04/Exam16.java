package com.eomcs.basic.ex04;

//# 변수 사용
//- 다른 도구(메서드; 함수라고도 부른다)에 값을 전달 할 수 있다.
//

public class Exam16 {
  public static void main(String[] args) {
    // 변수의 종류
    // => primitive data type (자바 원시 데이터 타입)
    byte b; // 1바이트 크기를 갖는 메모리
    short s; // 2
    int i;   // 4바이트 크기의 메모리 
    long l;  // 8바이트 크기의 메모리

    float f;   // 4바이트 크기의 메모리
    double d;  // 8바이트 크기의 메모리

    boolean bool;  // JVM에서 int로 취급. 자바 언어 명세서에는 메모리의 크기가 정의되어 있지 않다. 다만 JVM 명세서에는 int 로 다룬다고 나와있다.
    
    char c;  // 2바이트 크기의 메모리

    // => reference(레퍼런스) : 다른 메모리의 주소를 저장하는 변수
    // ex.                         
    // 아파트 a;
    // 공장 b;
    // 사무실 c; 사무실의 주소를 저장한다.

    String str; // 자바 언어 명세서에는 메모리의 크기가 정의되어 있지 않다. 메모리 주소를 저장할 만큼 큰 크기
    java.sql.Date date;  // 자바 언어 명세서에는 메모리의 크기가 정의되어 있지 않다. 메모리 주소를 저장할 만큼 큰 크기
    Thread t; // 쓰레드 정보
    java.net.Socket socket; //네크워크 연결 정보를 저장하고 있는 메모리의 주소



  }
}

 