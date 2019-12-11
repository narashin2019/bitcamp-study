package com.eomcs.basic.ex04;
//# 블록 안에서 변수 선언 위치  
//
public class Exam13 {
  public static void main(String[] args) {
    // 변수 선언 위치? 쓰기 전에 준비해라!
   
    int i; 
    i = 100; 


    int j;
    j = 200;

   //선언 위치와 상관없이 main호출시 변수 메모리 미리 만들어짐 따라서 위치는 상관 없음.


   int i; 
   int j;

   i = 100; 
   j = 200;



//사용할 변수를 블록({}) 시작 부분에 미리 선언해 놓아도 된다.
//변수가 필요할 때 블록({}) 중간 부분에 언제든 선언할 수 있다.
  }
}
