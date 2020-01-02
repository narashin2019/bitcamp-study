package com.eomcs.oop.ex05.test;

public class A {
  int v1;
  
  A() {
    //this.v1=100;
    this(100); 
    //=> 기본생성자에서   this.v1 = v1; 이 생성자를 호출 
    // 생성자에서 다른 생성자 호출하는 문법. this();
    //반드시 첫째줄에 와야함. 같은 생성자끼리만 가능.
    System.out.println("A()");
  }
  
  A(int v1) {
    this.v1 = v1;
    System.out.println("A(int)");
  }
  
  
  
  
  

}
