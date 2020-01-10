// 제네릭(Generic) - 사용 전 // 삭제하라고 하신다,, 읽어보고 지워야징
package com.eomcs.generic.ex01; 
//제네릭이 적용된 남이 만든 클래스를 사용해보자!

import java.util.ArrayList;
import java.util.HashSet;

public class Exam0삭제 {
  public static void main(String[] args) {
    // ArrayList에 어떤 종류(타입,클래스)의 객체를 저장할 지 지정하지 않으면
    // 기본으로 Object 타입의 객체를 다루는 것으로 간주한다.
    // 즉 Object 타입이라면 어떤 클래스든지 저장하고 꺼낼 수 있다.
    ArrayList list = new ArrayList();
    list.add(new Member("홍길동", 20));
    list.add(new String("Hello"));
    list.add(new Integer(100));
    list.add(new HashSet());

    // 값 꺼내기
    // 객체의 값을 꺼낼 때는 보통 해당 클래스로 형변환 한 다음에 사용해야 한다.
    // 왜? get() 메서드의 리턴 타입이 Object이기 때문이다.
    //
    Member member = (Member) list.get(0); //1로 바꾸면 스트링이라서 실행오류 뜸! 스트링객체를 왜 멤버객체라 우기느냐!
    System.out.println(member.name);
    System.out.println(member.age);
    // => 이렇게 값을 꺼낼 때 마다 그 객체의 원래 클래스로 형변환해야 하는 것은 매우 번거롭다.
  }
}








