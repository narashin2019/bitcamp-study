package com.eomcs.basic.ex07;

//# 메서드 : call by reference II
//

public class Exam0330 {

  static class MyObject {
    int a;
    int b;
  }

  // main()에서 만든 int a와 int b의 값을 바꾸고 싶다면,
  // primitive data type 값을 직접 넘기지 말고 
  // 객체에 담아 넘겨라!

  static void swap(MyObject ref) {
    System.out.printf("swap(): a=%d, b=%d\n", ref.a, ref.b);
    int temp = ref.a;
    ref.a = ref.b;
    ref.b = temp;
    System.out.printf("swap(): a=%d, b=%d\n", ref.a, ref.b);
  }

  public static void main(String[] args) {
    // MyObject 설계도에 따라 int a와 int b 메모리를 만든다.
    // 그리고 그 메모리(인스턴스=객체)의 주소를 ref 변수에 저장한다.
    MyObject ref = new MyObject(); // Myobject로 만든 메모리의 주소를 저장하는 변수 - ref =new MO 설계도에 따라 메모리를 만들라. heap에 = 인스턴스(객체)
    ref.a = 100;
    ref.b = 200;

    // a, b 변수가 들어 있는 인스턴스(객체=메모리)의 주소를 
    // swap()에 넘긴다. => 그래서 "call by reference"인 것이다.
    swap(ref);
    System.out.printf("main(): a=%d, b=%d\n", ref.a, ref.b);
  }
}


/*
Swap(int[] arr) 배열의 주소
swap(MyObject ref) 마미오프제트의주소

호출해서 값을 변경 할 수 있다.abstract
*/

/*
[Stack / Heap / Method Area]

Stack - local변수/ new로 생성하지 않는 변수 전부 / 메소드 호출이 끝나면 사라진다
Heap - new 로 생성되는 객체/ 메소드 호출이 끝나도 사라지지 않는다
Method Area - 클래스 코드

new로 생성되지 않으면 다 local변수고 stack에 저장

*/