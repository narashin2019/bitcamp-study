package com.eomcs.basic.ex06;

import java.util.ArrayList;

//# 흐름 제어문 - for 반복문과 컬렉션
//
public class Exam4_4 {
  public static void main(String[] args) {
    // 배열은 같은 타입의 값만 보관할 수 있지만
    // 컬렉션은 다른 타입의 값도 보관할 수 있다.
    // 
    // 배열은 크기가 고정되지만,
    // 컬렉션은 크기가 가변적이다.
    ArrayList list = new ArrayList();
    list.add("홍길동");
    list.add(3.14f);
    list.add(true);
    list.add(365);

    for (int i = 0; i < list.size(); i++) //list라는 리모컨으로 size누른다.
      System.out.println(list.get(i)); //list라는 리모컨에게 get시킨다.

    System.out.println("----------------------");

    // for 문에 컬렉션도 적용할 수 있다.
    // for (변수 선언 : 컬렉션객체) 문장; 
    // Object value 여러 타입일 때 변수 선언방법! 어떤 타입의 데이터든 다 담을 수 있다.
    for (Object value : list) 
      System.out.println(value);
  }
}

// 도구 중에 Arraylist라고 있다. 배열처럼 값을 보관 꺼내고 찾아도 주고 다양한 일 함. 컬렉션기능을 수행하는 도구다. 
// collection API(어플리케이션 프로그램 사용하는 도구)
// 
// 배열보다 나은점 : 
// 길이가 가변적, 여러 타입 변수를 저장할 수 있다. 그래서 실무에서 더 자주 씀.