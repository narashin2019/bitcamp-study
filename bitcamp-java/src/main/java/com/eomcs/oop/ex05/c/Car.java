package com.eomcs.oop.ex05.c;

public class Car {
    public String model;
    public String maker;
    public int capacity; //수용인원
    
    //기본생성자
    public Car() {}
    
    //생성자
    public Car(String model, String maker, int capacity) {
        this.model = model;
        this.maker = maker;
        this.capacity = capacity;
    }
}


