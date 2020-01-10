// 제네릭(Generic) 문법 정리 - 제네릭 객체의 메서드 사용 //
package com.eomcs.generic.ex01;

import java.util.ArrayList;
import java.util.HashSet;
import com.eomcs.generic.ex01.Exam0224.A;
import com.eomcs.generic.ex01.Exam0224.B1;

public class Exam0231 {
  
  
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
 
    ArrayList<B1> list1 = new ArrayList<>();

    list1.
    // ArrayList가 항목 타입을 B1으로 지정했기 때문에 
    // ArrayList의 메서드 파라미터나 리턴 타입은 B1로 설정된다.
    
    // => add(B1)
    list1.add(new Object()); // 컴파일 오류!
    list1.add(new String()); // 컴파일 오류!
    list1.add(new Integer(100)); // 컴파일 오류!
    list1.add(new Member("홍길동", 20)); // 컴파일 오류!
    list1.add(new A()); // 컴파일 오류!
    
    
    
    
  }
}







