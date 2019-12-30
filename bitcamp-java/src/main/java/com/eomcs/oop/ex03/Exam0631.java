// 인스턴스 초기화 블록과 필드 초기화, 생성자의 실행 순서
package com.eomcs.oop.ex03;

public class Exam0631 {

  static class A {

    // 생성자
    A() {
      // 자바 컴파일러는
      // 인스턴스 초기화 블록이나 필드 초기화 문장이 있다면 
      // 종류의 구분 없이 선언된 순서 그대로 모든 생성자의 처음부분에 복사한다.
      // 즉 다음과 같다. 
      //a = 200;
      //System.out.println("초기화블럭");
      //a = 100;

      System.out.println("A()");  
    }

    // 생성자
    A(int a) {
      //a = 200;
      //System.out.println("초기화블럭");
      //a = 100;

      System.out.println("A(int a)");  
      this.a = a; //여기서 this.a는 100이 맞나??
    }


    //인스턴스 초기화 블록 (initializer block)
    {
      a = 200;
      System.out.println("초기화블럭");
    }

    
    // 필드 초기화 문장(variable initializer)
    int a = 100;
  }
  
    public static void main(String[] args) {
      A obj1 = new A(); // 호출하는게 ();라면 디폴트 생성자 A(){ }임.
      System.out.println(obj1.a);
      System.out.println("-------------------------------");
      A obj2 = new A(1111); // 호출하는게 (1111)이;라면 생성자 A(int a){ }임.
      System.out.println(obj2.a);


    }
  }

