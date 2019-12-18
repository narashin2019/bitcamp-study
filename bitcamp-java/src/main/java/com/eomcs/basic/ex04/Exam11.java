package com.eomcs.basic.ex04;
//# 변수(variables) 선언
//- 변수? 값을 저장할 메모리의 이름
//- 변수 선언? 값을 저장할 메모리를 준비시키는 명령

public class Exam11 {
  public static void main(String[] args) {
    int i; // 4바이트 메모리를 준비시키는 명령
           // 준비된 메모리를 i라고 지칭한다.
    
    






  }
}
    //변수 선언 문법
    //-  데이터타입 변수
    //
    int i;
    
    //문법
    //- int : 값을 저장할 메모리의 종류. '데이터 타입(data type; 자료형)'이라 부른다.
    //- i : 메모리를 가리키는 이름. '변수(variables)'라 부른다.
    //
    //의미
    //- 정수 값을 담을 메모리를 준비하고 그 메모리의 이름을 i 라고 하자!

/*
*데이터를 저장하는 기술을 배웁시다.
*데이터 저장 
-RAM 저장 -> 변수 사용 
-HDD 저장 -> 파일 사용

*운영체제가 프로그램(ex. JVM)마다 프로그램이 실행되는 동안 RAM 어디 얼만큼 쓸지 할당해줌.
 쓰다가 모자라면 out of 메모리 뜨는것 
 java 옵션 지정 가능 : 램에서 최대얼마나 쓸지

*JVM은 운영체제에게 할당받은 총 메모리를 구역으로 나눠서 저장한다.

OS
↓

[Method Area ]                             
.class 기계어 명령 로딩(loading) 

[Heap]
객체(인스턴스)

[Stack]
로컬(local) 변수
쓰레드Thread가 main을 찾아서 호출. 쓰레드가 사용하는 메모리 Stack 쓰레드 개수만큼 있음.


*로컬변수는 스택에 저장 
new로 선언되는 것은 인스턴스변수. 객체는 heap에 저장
static 선언 메소드 area에 저장.



*오늘은 스택에 값을 저장하는 방법을 배움.

값을 저장하려면 메모리가 있어야 하고 그게 램이다
운영체제한테서 자기가 쓸 메모리구역을 할당 허락 받아서 쓴다
각각프로그램은 그 메모리는 구역을 나눠 관리한다

JVM이 확보한 메모리 중에서 여러분이 쓰라고 준비하는 메모리가 변수다.

**변수? 데이터를 저장하기 위해 확보한, 준비한, 생성한 메모리

**변수 선언
-변수를 준비하는 방법
-데이터 저장할 메모리를 준비시키는 명령
-문법: 
메모리종류 메모리별명;
메모리종류 : Data Type 이런 유형의 데이터를 저장할거다
메모리별명 : 변수명 variable

[data type] [variable];
int          i        ;

**Data Type 
-정수 b(1바이트) s(2) i(4) l(8)
-부동소수점 float(4) d(8)
-논리 boolean(JVM내부적으로4바이트씀)
-문자 char(2)

=>이 8개를 primative data type 자바 원시(기본) 타입 이라고 부름.


*ex. 
byte b; 
b = 10;
=> JVM머신아 정수를 저장할 1바이트 메모리를 준비하고 이름을 b라고 하자. 밑에서 b하면 그 메모리 말하는 거야. 그리고 그리고 거기에 10넣어.

byte -128~ 127
short
int +- 21억
long
float 유효자리수 7자리 
double 유효자리수 15자리
boolean 트루 or false
char 0~65535


*/