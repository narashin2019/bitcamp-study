// 제네릭(Generic) 문법 정리 - 레퍼런스와 인스턴스 생성  
package com.eomcs.generic.ex01;

import java.util.ArrayList;
import java.util.HashSet;

public class Exam0211 {
  public static void main(String[] args) {

    // 만약 <타입명>을 생략한다면,
    ArrayList list1; // ==> ArrayList<?> list1; /경고 뜸 하지 말라는거야
    list1 = new ArrayList();
    list1 = new ArrayList<>();
    list1 = new ArrayList<Object>();
    list1 = new ArrayList<String>();
    list1 = new ArrayList<Member>();
    
    
    // ArrayList가 다루는 타입에 상관없이 ArrayList 레퍼런스를 선언하고 싶다면
    // list1처럼 선언하지 말고 다음과 같이 명확하게 <?> 물음표를 붙여라!
    ArrayList<?> list2;
    list2 = new ArrayList(); // 이렇게 사용하지 말고 , 명확히 제네릭의 타입을 지정하라. 경고 뜬다.
    list2 = new ArrayList<>();
    list2 = new ArrayList<Object>();
    list2 = new ArrayList<String>();
    list2 = new ArrayList<Member>();
    
    
  }
}

//경고 안뜨게 한다고 생각하고 코딩 해야함 






