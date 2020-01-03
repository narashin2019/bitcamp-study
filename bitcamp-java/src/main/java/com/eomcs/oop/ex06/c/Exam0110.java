// 오버라이딩(overriding) - 준비
package com.eomcs.oop.ex06.c;

public class Exam0110 {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.name = "홍길동";
        
        obj1.print(); //A.print();로 호출 불가. 인스턴스 메서드는 주소가 담긴 레퍼런스로만 호출가능.
    }
}
