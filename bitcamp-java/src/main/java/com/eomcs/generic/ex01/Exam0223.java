// 제네릭(Generic) 문법 정리 - 제네릭 파라미터  
package com.eomcs.generic.ex01;

import java.util.ArrayList;
import java.util.HashSet;

public class Exam0223 {
  
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
    // m1(ArrayList<A>)
    // => A 타입에 대해서만 ArrayList 객체를 파라미터로 넘길 수 있다.
    // => A의 하위 타입은 불가능
    //
    m1(new ArrayList()); // 컴파일 오류는 아니지만, (A 타입에 대해서 제한한 것이기 때문에) 타입을 지정하지 않는 것은 바람직하지 않다.
    // 왜?
    // => 타입을 지정하지 않으면 ArrayList에 A가 아닌 다른 타입의 객체가 들어갈 수 있다. 
    // => 그러면 실행 중에 get()을 호출할 때 형변환 문제가 발생할 것이다.
    //
    //m1(new ArrayList<Object>()); // 컴파일 오류!
    
    m1(new ArrayList<A>()); // 상위도 안됨. 
    //m1(new ArrayList<B1>()); // 컴파일 오류! //여긴 A못담아 비원과 비원자식들만 담을 수 있다 A가 되니까 B1이 되는거 아냐? 아냐! A타입 못담아. 그래서 A타입 못담는건 못와
    //m1(new ArrayList<B2>()); // 컴파일 오류!
    //m1(new ArrayList<C>());  // 컴파일 오류!
    
  }
  
  
  static void m1(ArrayList<A> list) { //<A>: (문맥상 80%의 의미는)에이와 에이 자식들 담는 바구니 가능  <= 에이타입객체를 담는 바구니. 사람도, 동물타입
  }
  
  
}








