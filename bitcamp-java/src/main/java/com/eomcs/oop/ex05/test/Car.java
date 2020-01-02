package com.eomcs.oop.ex05.test;

public class Car {
    public String model;
    public String maker;
    public int capacity; //수용인원
    
    
    //기본 생성자
    public Car() {}
    
    //기존 생성자 - 함부로 기존코드 바꾸면 안돼. 쓰는 사람이 있어 분명히. 기존코드를 쓰는 프로그램이 동작 안할 수 있다!
    public Car(String model, String maker, int capacity) {
        this.model = model;
        this.maker = maker;
        this.capacity = capacity;
    }
    
    
    
    
    
}


