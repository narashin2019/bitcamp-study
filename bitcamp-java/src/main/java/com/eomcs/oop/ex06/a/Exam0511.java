// 다형성 - 다형적 변수와 instanceof 연산자
package com.eomcs.oop.ex06.a;

public class Exam0511 {

  // Sedan과 Truck, Bike의 모든 정보를 자세히 출력하라!
  // 단, 한 개의 메서드로 처리하라!

  
    public static void main(String[] args) {
      Vehicle v = new Sedan();

      // instanceof 연산자?
      // => 레퍼런스에 들어 있는 주소가 특정 클래스의 인스턴스인지 검사한다.
      // => 또는 그 하위 클래스의 인스턴스인지 검사한다. 
      //
      System.out.println(v instanceof Sedan);
      System.out.println(v instanceof Car);
      System.out.println(v instanceof Vehicle);
      System.out.println(v instanceof Object);
      
      System.out.println(v instanceof Truck);
      System.out.println(v instanceof Bike);
    }

  }

//public static void print(Vehicle v) { 
// 비히클을 요구한다는 것은 비히클의 자식인스턴스도 모두 줄 수 있다. 나 비히클이면 다 받을 수 있쪄!
