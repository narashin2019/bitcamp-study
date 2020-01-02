package com.eomcs.oop.ex03.test;

public class Car {
  //여러개 만들 거니까 static 붙이지 않는다. 
  // new를 해야만 메모리가 존재하지 지금상태로는 설계도일 뿐임. 
  boolean on;
  int speed;
  String model;
  String maker;
  Engine engine; // 엔진설계도로 만든 객체의 주소를 engine에 넣음 레퍼런스 카 클래스는 엔진 객체 포함
  int distance;
  
  
  // 생성자에서 엔진객체를 생성함. 인스턴스가 제대로 쓰일 수 있도록 인스턴스의 변수값을 유효한 값으로 적절히 초기화 시키는게 생성자가 하는일
  // 그래서 여기서 엔진객체를 생성함. 체크메서드에서 엔진객체 사용하기 때문에 여기서 생성하고초기화 함.
  // 생성자 작성 시 값을 초기화 해야하는게 무엇인지 생각하면서 쓰는 것.
  Car() {
    this.engine = new Engine (4, 16, 1980);
  }
  
  
//  //넘겨준 c1, c2에 대해서 변경
//  static void start(Car c) {
//    c.on = true;
//  }
//  static void stop(Car c) {
//    c.on = false;
//  }

  //스태틱을 논스태틱 =인스턴스 메서드로 변경하면 이 메서드는 인스텀스 메소드로서 파라미터로 주소를 받는게 아니라.
  // 인스턴스 오출 시 앞쪽에 인스턴스 주소가 들어가서 호출.c1.start(); 
  // => 그럼 여기서는 내장 히든변수 this로 c1에 들어있는 주소를 받음!
  // 정상적인 인스턴스 주소 없이는 실행 불가한 인스턴스 메서드 (예 c3=null 일떄)
  //인스턴스 메서드가 정상적으로 호출됐다는 것은 this에 Car설계도 대로 만든 인스턴스 메모리 주소가 들어가 있다는 것.
  void start() {
    this.on = true; //this = 이 메서드를 호출할 때 넘겨준 인스턴스 주소가 담김!!
  }
  
  void stop() {
    this.on = true;
  }
  
  void check() { // 체크라는 메서드는 카에 있음. this는 카 데이터를 다루는 인스턴스(객체)의 주소임! 
    if (this.engine.oilState == 0) { // 엔진의 오일스테이트 값을 조회
      this.engine.cleanOil(); // 엔진의 클린오일이라는 연산자메서드를 사용.
      System.out.println("자동차의 엔진 오일을 교환했습니다.");
    }
    System.out.println("자동차를 정비했습니다.");
  }
//    void cleanOil() {
//      this.engine.oilState = 10; // 잘못 자리잡은 것. 엔진의 오일스테이트의 데이터를 다루는 연산자. => 카에 두면 안되고 엔진에 뭐댜함 
//    }
    
  
  
}



//클래스는 관련이쓴 메소드를 묶어두는 역할. 명령 역할을 실행할 코드들이 있음
// 각각의 메소드는 이름과 관련된 기능을 수행. 이름을 잘 지어야해. 


//우선 설계도 메서드. 클래스 선언하고 변수 선언한것은 여러개 저장하겠다는 의도가 있으므로 static 안붙임
//메서드는 딱 2종류
//static 붙음: 클래스 이름으로 접근가능. 그러나 on 이라는 변수 여러 개 만들수가 없음. 여러 대의 자동차 정보를 저장할 수 없음. Car.on은 1개
//각각의 자동차에 대해 스위치 켜져있는지 아닌지 표시하려면 on 변수가 여러개 존재해야ㅕ함. 따라서 static으로 하면 안되
// 변수에 스태틱이 안부는 건 여러개 만들려고!!
//안븥음: 현업에서 대부분 메서드가 static 붙지 않음. 

//어떤 대상체의 속성 - attribute
// 어떤 대상체의 필드를 선언한다, 책의 어트리뷰트를 저장하기 위해 필드(변수)를 선언한다. 인스턴스 변수
// 여러 책의 정도 붙이려면 static 붙임ㄴ 안된다.
//class Book {
//  String press;
//  String title;
//  int price;
//}
//static 없어야 뉴 명령으로 여러개 생성가능


//class Book {
//String press;
//String title;
//int price;
//}
//
//class Coffee {
//  String origin;
//  String price;
//  Date loasting;
//}
//
//class Product {
//  String title;
//  String maker;
//  int price;
//}
//
//class Student {
//  String name;
//  int gender;
//  int grade;
//  String type;
//}
//
//
//class Seat {
//  String location;
//  int romm;
//  String position;
//}
//

//  //자동차가 시작됐다는 것을 메모리 on의 값으로 표시하는 것. 자동차 메모리 주소 피료함. (Car c) 파라미터로 받음.
//static이 붙었다 -> 클래스 이름으로 호출가능 클래스 메서드
// 파라미터가 있다는 것은 그걸 줘야 정상적으로 실행 가능 .
//static void start(Car c) {
//  c.on = true;
//}
//
//static void stop(Car c) {
//  c.on = false;
//}
// 자동차 데이터를 다루는 메서드는 자동차 변수 있는 곳에 두는 게 낫다. > 빼서 Car로 보냄. 카핸들러 제거


// 이제 Car 클래스는 두 가지 용도!
// 메모리 구성하는 설계도와 + 자동차의 메모리 데이터를 다루는 연산자(작업을 수행하는 메서드를 정의하는 부분) 로 구성됨. 
// new할때는 메모리필드로 생성하고