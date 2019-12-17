package com.eomcs.basic.ex04;

public class Exam41 {
  public static void main(String[] args) {
    // 문자 변수
    
    short s;
    char c;

    s = -32768;
    s = 32767;

    c = 0;
    c = 65535;
    // char(2byte) 크기의 메모리 범위를 초과하면 문법 오류이다. 
    //c = -1; // 컴파일 오류 발생!
    //c = 65536; // 컴파일 오류 발생!

    
    char c1 = 65;
    char c2 = 0x41;
    char c3 = 0b0100_0001;
    char c4 = 'A';
    //char 변수는 문자에 부여된 문자코드(유니코드 ucs2)를 저장하는 것
    // println()을 통해 문자를 출력할 수 있다.
    //- 변수의 종류가 char 이면 출력할 때 코드 값 대신 문자를 출력한다.
    //- 해당 코드의 문자를 폰트 파일에서 찾아 출력한다.
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);

    int i1 = 'A'; //당연히 가능
    System.out.println(i1); //65출력

    i1 = i1 + 10;
    System.out.println(i1); //75출력
    System.out.println((char)i1); //K출력. 형변환

    for (int i = 65; i < 'A' + 26; i++ ) {
      System.out.print((char)i);
    }



  }
}

// 자바는 'UCS(Universal Character Set; ISO 10646)'라는 국제 표준 문자 인코딩 규격에 따라 문자를 다룬다.
// UCS-2 라고도 부르며, 각 글자를 0 ~ 65535 까지의 16비트 코드 값으로 저장한다.

// 자바는 UCS-2 코드 값을 저장하기 위해 2바이트 크기의 메모리를 사용한다.
// 다음은 2바이트 크기의 UCS-2 코드 값을 저장할 변수를 선언한다.
//char c;

//c = 0;
//c = 65535;

// char(2byte) 크기의 메모리 범위를 초과하면 문법 오류이다. 
//c = -1; // 컴파일 오류 발생!
//c = 65536; // 컴파일 발생!


//문자 코드 값을 모른다면 따옴표를 사용하라!
// - 문법
//   '문자' : UCS-2에 정의된 코드 값을 리턴한다.
//
//char c = 'A';  // c 변수에 저장되는 것은 문자 'A'의 UCS-2 코드 값이다.
//System.out.println(c);

//문자의 UCS-2 코드 값을 확인하기
//- 정수 변수를 사용하면 문자의 코드 값을 받아서 그래도 출력할 수 있다.
//  println()은 int 변수의 값은 10진수로 출력한다.
//int i = 'A';
//System.out.println(i);


//자바는 문자를 저장할 때 UCS-2에 정의된 정수 값을 저장한다.
// 확인해 보자!

// 영어 대문자의 문자 코드 저장
//int a = 0x41;

// 코드 값을 1씩 증가하면서 문자를 출력해 보자!
//for (int i = 0; i < 26; i++) {
  // 정수를 그냥 출력하면 10진수를 출력한다.
  // 정수가 문자 코드임을 알려줘야만 println()은 해당 코드의 문자를 출력한다.
  // 문법
  //   (char) 정수
  //System.out.print((char)(a + i));