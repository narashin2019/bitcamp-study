// String - "Hello" vs new String("Hello")
package com.eomcs.corelib.ex01;

public class Exam0110 {
  public static void main(String[] args) {
    // Heap 메모리 영역에 String 인스턴스를 생성하는 방법
    String s1 = new String("Hello");
    String s2 = new String("Hello");
    //s1 주소를 담는 변수 / heap 내부에 바이트배열로 만들어지고 주소가 s1에 저장
    // => 내용물의 동일 여부를 검사하지 않고 무조건 인스턴스를 생성한다.
    // => 가비지가 되면 가비지 컬렉터에 의해 제거된다.
      System.out.println(s1 == s2); //false 당연히 주소 다름


    // string constant pool 메모리 영역에 String 인스턴스를 생성하는 방법
      // 인스턴스는 힙에 생성 주소가 컨스턴스풀 상수풀에 저장
      //리터럴로 인스턴스 생성할떄는  상수풀에서 같은 데이터를 가진 인스턴스가 존재한다면 기존에 만들어진 객체 주소를 그대로 리턴
    String x1 = "Hello"; // String 인스턴스의 주소를 리턴한다.
    String x2 = "Hello"; // 기존의 String 인스턴스 주소를 리턴한다.
    // 문자열 리터럴은 내부적으로 new String()을 실행한다.
    // 다만 인스턴스를 Heap이 아닌 String 상수풀에 생성한다.
    // => 내용물이 같으면 기존 인스턴스의 주소를 리턴한다.
    //    즉 메모리 절약을 위해 중복 데이터를 갖는 인스턴스를 생성하지 않는다.
    // => JVM이 끝날 때까지 메모리에 유지된다.
      System.out.println(x1 == x2); //true 주소가 같다!
  }
}





