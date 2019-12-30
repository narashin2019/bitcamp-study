// Singleton 패턴 적용 후 **암기
// 객체를 1개만 만들도록 강제하는 설계 기법 = 싱글톤 패턴
package com.eomcs.oop.ex04.singleton;

public class Car2 {
    // 3) Car2 객체를 생성하면 다음 스태틱 변수에 보관해둔다.
    private static Car2 instance;
    
    // 1) 외부에서 생성자를 호출하지 못하도록 private으로 접근을 제한한다. 내부에서만 사용가능.
    private Car2() {
        System.out.println("Car2()");
    }
    
    // 2) 대신 객체를 생성해주는 메서드를 static으로 만든다.
    public static Car2 getInstance() {
      if (Car2.instance == null) {
        Car2.instance = new Car2();
      }
        return Car2.instance;
    }
}





