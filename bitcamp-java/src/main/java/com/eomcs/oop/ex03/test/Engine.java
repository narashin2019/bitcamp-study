package com.eomcs.oop.ex03.test;

public class Engine {
  int sylinder;
  int valve;
  int cc;
  int oilState;
  
  // 생성자를 통해 값을 설정 
  // 기본생성자를 안만든 이유는 무조건 필수값 3개를 받아야 하기 때문 
  // 인스턴스가 제대로 사용할 수 있도록 인스턴스 변수의 값을 유효한 값으로 강요 하는 것이 생성자. 
  // 인스턴스가 존재하기 떄문에 생성자가 호출 수 있고 this에 인스턴스 주소 들어있음.
  public Engine (int sylinder, int valve, int cc) {
    this.sylinder = sylinder;
    this.valve = valve;
    this.cc = cc;
    this.oilState = 0;
  }
  
  // 인스턴스 메서드가 호출된다는 것은 this에 엔진 설계도대로 만든 메모리의 주소(엔진 인스턴스의 주소)가 있다는 것. 인스턴스 메모리의 주소.
  void cleanOil() { // 클린오일은 엔진 데이터가 있어야 호출가능. 여기서 this는 엔진 인스턴스의 주소
    this.oilState = 10;
  }
  
  
  
}
