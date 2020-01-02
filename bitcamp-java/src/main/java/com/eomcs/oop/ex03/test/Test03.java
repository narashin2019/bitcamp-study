package com.eomcs.oop.ex03.test;

public class Test03 {

  public static void main(String[] args) {
    

    
    //CarHandler.start(null); // 파라미터로 주소를 안주면 널 포인트 익셉션 뜸,. 
    
    // 힙에 Car설계도에 따라 new라는 명령어는 static 안붙은 변수 선언만 처다보고 그대로 메모리 만듬. 
    // (메서드와 new는 상관x) new는 논스태틱 변수만 힙에 만듬.
    // c1변수는 stack에 생기고 힙에 만든 메모리의 주소가 c1에 들어감. c1은 레퍼런스! 각각 객체마다 레퍼런스가 필요함
    // 그래서 레퍼런스 배열이 필요.
    //Car c1 = new Car();
    //Car c2 = new Car();
    //Car c3 = null;
    
    //Car클래스에 있는 메서드 스타드에 접근하는데 c1이라는 주소를 줌.
    // 파라미터로 넘겨준 인스턴스(매ㅔ모리)를 찾아가서 on 대해 연산하는 연산자 start
    // a메서드에게 일을 시키려면 값을 넘겨야함. 
//    Car.start(c1);
//    Car.start(c2);
    
    //인스턴스 메서드 호출할때 파라미터를 앞에 줌. c1이 가리키는 인스턴스 변수의 on 변수 를 trie로 바꿔라.
    // c1이 Car 설계도이기 때문에 start도 Car클래스에서 찾음.*********
//    c1.start();
//    c2.start();
    //c3.start(); // 여기서 에러뜸. 정상적인 주소 없이 호출은 안된다! 
   
    // 잘못된 예
    //    String s = new String("okok")
    // s.start();
//    
//    
//    System.out.printf("c1.on = %b\n", c1.on); //true
//    System.out.printf("c2.on = %b\n", c2.on); // true
    
    Car c1 = new Car();
    
    c1.check();
    c1.check();
    
    
  }

}
