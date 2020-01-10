// 제네릭(Generic) 문법 정리 - 제네릭 객체의 메서드 사용
package com.eomcs.generic.ex01;

import java.util.ArrayList;
import java.util.HashSet;

public class Exam0230 {
  public static void main(String[] args) {
    // 문법

 
    ArrayList<Object> list1;
    list1 = new ArrayList<Object>();

    // ArrayList가 Object 타입의 데이터를 다루기로 지정되었으면,
    // ArrayList의 메서드 파라미터나 리턴 타입은 Object로 설정된다.
    
    // add(Object)
    list1.add(new Object());
    list1.add(new String());
    list1.add(new Integer(100));
    list1.add(new Member("홍길동", 20));
    
    // ==> Object get(int) 리턴타입오브젝트니까 형변환 해야함 인스턴스의 메서드를 쓸때는 값타입 형변환 해줘야함??? ㄱ객체 인스턴스 주소를 받을 때는 아니라고?? 뭔말이지 
    Object obj = list1.get(0);
    String str = (String) list1.get(1); // 형변환 생락 불가 // 1번 스트링인데 Integer라고 뻥치면 안됨. classcastException = 뻥치지마
    
  }
}







