// 제네릭(Generic) 문법 정리 - 레퍼런스와 인스턴스 생성  
package com.eomcs.generic.ex01;

import java.util.ArrayList;
import java.util.HashSet;

public class Exam0212 {
  public static void main(String[] args) {
    // 문법

    ArrayList<Object> list1; // 변수 선언 할 때 타입을 오브젝트로 정해놔서 밑에서 뉴로 생성시 스트링, 멤버 등등 은 안됨 .
    
    // 제네릭 타입을 Object로 지정하면 저장할때 오브젝트 와 오브젝트 하위가 다 저장되는데 ()타입이
    // 그렇게 지정된 ArrayList 객체만 list1에 저장할 수 있다.
    
    list1 = new ArrayList(); // 이렇게 사용하지 말고 , 명확히 제네릭의 타입을 지정하라. 경고 뜬다.
    list1 = new ArrayList<>();
    list1 = new ArrayList<Object>();
    //list1 = new ArrayList<String>(); // 컴파일 오류!! // 스트링과 스트링 자식들만 가르키는 놈은 안돼
    //list1 = new ArrayList<Member>(); // 컴파일 오류!!

    // 나는 오브젝트 뿐만 아니라 어떤 값도 다 가르킬 수 있는 오브젝트와 오브젝트 하위 객체를 담을 수 있는 어레이리스트다.
    // 스트링과 스트링 자식만 가리키는 놈? 나한테 택도 없지 안돼.
    
    
  }
}







