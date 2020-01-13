package com.eomcs.oop.ex02.study;

public class Car {

  // 매소드 에리어 클래스 로딩될 때 1개 만들어짐. //
  public static final int OIL = 1;
  public static final int GAS = 2;
  
  //static가 붙으면 클래스 실행시 메소드 에리어에 자동으로 생김 메모리없이 바로쓸수 있음 
  //클래스 로딩될때 단 1번. Car.name = 신; 이렇게 접근
  String name; 
  int type;
  String color;
  int speed;
  int energy;
  int power;
  int cleanLevel;
  //자동차를 여러개 저장하고 싶다면?
  //static을 뗀다
  // 인스턴스 필드. (인스턴스 생성시 만들어지는 변수)


  //  //스피드업이라는 메서드를 호출하면 주어진 자동차의 스피드를 10만큼 증가시킨다.
  //  static void speedUp(Car c) { //어떤 카인지 카의 주소 받아야함. (Car c) 
  //    if (c.speed >= 100)
  //      return; // 현재상태에서 함수를 끝낸다. 밑에줄 실행 x
  //      c.speed += 10;
  //    
  //  }


  //인스턴스 메서드로 바꿈. static 뺌. 메서드를 호출할 때 넘겨준 인스턴스 주소가 Car.this 히든변수에 들어감
  void speedUp() { 
    if (this.speed >= 100)
      return; // 현재상태에서 함수를 끝낸다. 밑에줄 실행 x
    this.speed += 10;

  }



  //  static void comparePower(Car c1, Car c2) {
  //    if (c1.power > c2.power)
  //      return -1;
  //    else if (c1.power = c2.power)
  //      return 0;
  //    else
  //      return 1;
  //    
  //  }
  // 스태틱메서드는 다루고자 하는 것을 파라미터로 넘겨야함


  //인스턴스 메서드. 주소로 호출해야하며 내장변수 this에 저장
  int comparePower(Car c) { // this로 받은 자동차의 파워와 파라미터인 c로 받은 자동차의 파워를 비교
    if (this.power > c.power) // this는 생략가능 하다.
      return -1;
    else if (this.power == c.power)
      return 0;
    else
      return 1;

  }


}


//클래스문법
//-사용자 정의 데이터타입 + 여기서 메소드는 사용자 정의 데이터를 다루는 연산자로서의 역할을 한다. 이 두갤 같이 두는 것.

