// 기존의 클래스를 손대지 않고 새 기능만 추가한다.
// 어떻게? 상속 문법을 이용한다.
package com.eomcs.oop.ex05.d;

// 상속
// => 기존 클래스의 코드를 손대지 않고 기능을 확장하게 도와주는 문법이다.
// => 재사용할 기존 클래스를 지정한다.
// => 새 클래스에는 추가할 기능을 덧붙인다.
public class Sedan extends Car {// 좌측 클래스는 우측 클래스를 확장한다.
    
    // 인스턴스 변수 추가 
    boolean sunroof;
    boolean auto;
    
    // 생성자 추가
    public Sedan(String model, String maker, int capacity, 
            boolean sunroof, boolean auto) {
        this.model = model; //인스턴스를 생성한 다음 그 인스턴스를 주소를 가리키는 this.
        this.maker = maker;
        this.capacity = capacity;
        this.sunroof = sunroof;
        this.auto = auto;
    }
    
}

//수퍼클래스의 필드 타입이나, 필드명이 바뀌면 서브클래스에서도 바꿔줘야함. 
// 수퍼클래스의 capacity 이름을 size로 바꿨다면 여기서는 "this.size" 요로케 바꿔야함.