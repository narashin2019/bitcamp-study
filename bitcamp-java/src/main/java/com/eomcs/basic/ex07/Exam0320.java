package com.eomcs.basic.ex07;

//# 메서드 : call by reference
//
public class Exam0320 {

  static void swap(int[] arr) {
    System.out.printf("swap(): arr[0]=%d, arr[1]=%d\n", arr[0], arr[1]);
    int temp = arr[0];
    arr[0] = arr[1];
    arr[1] = temp;
    System.out.printf("swap(): arr[0]=%d, arr[1]=%d\n", arr[0], arr[1]);
  }

  public static void main(String[] args) {
    int[] arr = new int[] {100, 200};
    swap(arr); // 배열 인스턴스(메모리)를 넘기는 것이 아니다. 
    // 주소를 넘기는 것이다.
    // 그래서 "call by reference" 라 부른다.
    System.out.printf("main(): arr[0]=%d, arr[1]=%d\n", arr[0], arr[1]);
  }
}


//주소를 주면 메서드가 달라도 해당 주소에 있는 메모리에 접근 가능 수정도 가능하다.
// new로 생성하는 객체는 Heap에 저장된고 메소드 호출이 끝나도 사라지지 앟ㄴ는다.


//[Stack / Heap / Method Area]
//
//Stack - local변수
//Heap - new 로 생성되는 객체
//Method Area - 클래스 코드