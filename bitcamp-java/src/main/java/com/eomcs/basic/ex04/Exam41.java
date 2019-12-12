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
    //c = 65536; // 컴파일 발생!

    
    char c1 = 65;
    char c2 = 0x41;
    char c3 = 0b0100_0001;
    char c4 = 'A';
    //char 변수는 문자에 부여된 문자코드(유니코드 ucs2)를 저장하는 것
    
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