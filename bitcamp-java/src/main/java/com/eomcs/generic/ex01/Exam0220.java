// 제네릭(Generic) 문법 정리 - 제네릭 파라미터  
package com.eomcs.generic.ex01;

import java.util.ArrayList;
import java.util.HashSet;

public class Exam0220 {
  
  
  static class A {} // 안 적으면 오브젝트를 상속 받음 
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
    // m1(ArrayList)
    // => 제네릭의 타입을 지정하지 않으면 Object 타입과 같기 때문에 (<Object> 라는 말 아님)
    //    다음과 같이 다양한 종류의 ArrayList를 파라미터로 넘길 수 있다.
    m1(new ArrayList());
    m1(new ArrayList<A>());
    m1(new ArrayList<B1>());
    m1(new ArrayList<B2>());
    m1(new ArrayList<C>());
    
    
    
    
    
  }
  
  
  static void m1(ArrayList list) {
  }
  
  
}








// 클래스는 객체를 만들기 전에 객체를 만들수 있게 하는 설계도
// 클래스로 만들면 그게 객체인데 객체를 영어로 한 object = instance 
// 타입 Object는 말그대로 <Object> 타입을 말한다 = 오브젝트랑 오브젝트의 자식들만 담는 바구니고 오브젝트랑 오브젝트 상위만 뉴로 생성된다.