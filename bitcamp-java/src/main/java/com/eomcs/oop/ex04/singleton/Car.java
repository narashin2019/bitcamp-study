// Singleton 패턴 적용 전
// 객체를 1개만 만들도록 강제하는 설계 기법 = 싱글톤 패턴
// 현재는 여러개 만들수 있음.
package com.eomcs.oop.ex04.singleton;

public class Car {
    public Car() {
        System.out.println("Car()");
    }
}
