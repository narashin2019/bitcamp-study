package com.eomcs.basic.ex03;

// 이스케이프 문자 (escape character)
// 
  public class Exam7 {
    public static void main(String[] args) {
   
    // 이스케이프 문자
    // - 문자를 제어하는 기능을 가진 문자
    // - 문법
    //   \ [ n | r | f | t | b | ' | " | \ ]
    //
    System.out.println("Hello,world!");
    System.out.println("Hello,\nworld!"); // 줄바꿈 문자
    System.out.println("Hello,\rabc"); // 커서(cursor)를 처음으로 돌리는 문자. 헬로우 치고 \r만나면 앞으로 돌아가서 그위에 abc 덮어 침. 결과 abclo,
    // 커서란? 문자를 출력할 위치를 가리키는 것.
    System.out.println("Hello,\b\b\bworld!"); // 커서를 뒤로 한 칸 이동 시키는 문자. Helworld!출력
    System.out.println("Hello,\tworld!"); // 탭 공간을 추가 시키는 문자. 탭은 기본 2칸 - 운영체제마다 다름
    System.out.println("Hello,\fworld!"); // formfeed 추가 문자. 한페이지가 끝나고 다음 첫번째 페이지로 넘기고싶을 때(출력) 출력창에는 이상한문자 나옴
    System.out.println("Hello,\"w\"orld!");  // ""안에서 "" 추가 시키는 문자
    System.out.println("Hello,'w'orld!");  // ""안에서 이 '문자는 그냥 적는다.
    System.out.println('\''); // ''안에서 '문자를 출력 시키는 문자
    System.out.println('"'); // ''안에서 "문자는 그냥 적는다.
    System.out.println("c:\\Users\\user\\git"); // \ 문자를 출력시키는 문자. c:\Users\user\git 출력 (원화표시로)

    }
  }


// 줄바꿈 코드
// Carrage Return(CR) : 0d
// Line Feed(LF) : 0a
// - window OS 에서는 줄바꿈을 표시하기 위해 CRLF 2바이트 코드를 삽입한다.
// - Unix OS 에서는 줄바꿈을 표시하기 위해 LF 1바이트 코드를 삽입한다.


//# 이스케이프 문자(escape character) = 문자 제어 코드
//- 화면에 출력하는 문자가 아니라 문자 출력을 제어하는 문자이다.
//- 제어 문자
//  \n - Line Feed(LF), 0x0a
//  \r - Carrage Return(CR), 0x0d
//  \f - Form Feed, 0x0c
//  \t - Tab, 0x09
//  \b - Backspace, 0x08
//  \' - Single Quote, 0x27
//  \" - Double Quote, 0x22
//  \\ - Backslash, 0x5c
//





