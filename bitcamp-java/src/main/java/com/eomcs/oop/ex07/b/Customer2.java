package com.eomcs.oop.ex07.b;

public class Customer2 {
    // 외부에서 인스턴스 변수에 직접 접근하지 못하도록 막는다!
    private String name;
    private int age;
    private int weight;
    private int height;
}

//  private 여기에 선언된 메소드만 접근 가능