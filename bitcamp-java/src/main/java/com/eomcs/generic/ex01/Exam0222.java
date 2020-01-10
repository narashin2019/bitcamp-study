// 제네릭(Generic) 문법 정리 - 제네릭 파라미터  
package com.eomcs.generic.ex01;

import java.util.ArrayList;
import java.util.HashSet;

public class Exam0222 {
  
  static class A {} // 안적으면 오브젝트를 상속받음 
  static class B1 extends A {}
  static class B2 extends A {}
  static class C extends B1 {}
  
  /*
   *    Object
   *      |
   *      A
   *     / \
   *    B1 B2
   *    |
   *    C
   *
   */
  
  public static void main(String[] args) {
    // m1(ArrayList<?>)
    // => 모든 타입에 대해 ArrayList 객체를 파라미터로 넘길 수 있다.
    //
    m1(new ArrayList()); // 
    m1(new ArrayList<Object>());
    
    m1(new ArrayList<A>()); 
    m1(new ArrayList<B1>());
    m1(new ArrayList<B2>());
    m1(new ArrayList<C>()); 
    
  }
  
  
  static void m1(ArrayList<?> list) { //<?>바구니 아무거나 상관없어 지정되지 않은거 가능 오브젝트밑 오브젝트 자식들 담는 바구니, A와 A자식들 담는 바구니 ... 다됨 
  }
  
  
}








