package com.eomcs.oop.ex02.study;

public class GasStation {
  String name; // 개별관리는 인스턴스, 모든 개스스테이션이 동일 이름이라면 static
  int type; // 주유소 종류 1=오일, 2 = 개스

  int refuel(Car c) {
    if(c.type != this.type)
      return 0;
    
    int amount = 100 - c.energy;
    c.energy = 100;
    return amount;
  }
  
  static void clean(Car c) { // 메서드가 논스태틱 = 인스턴스 변수를 사용할 때(특정인스턴스에만 작업)만 뗀다. 따라서 얘는 그냥 둔다. - 의미: 주유소 종류의 상관없이 클린하기 떄문에 스태틱
    c.cleanLevel = 0;
  }
  
  
  
  //3. static변수는 클래스에 1개만 존재. 여러개 주유소 만들 수 없음
  // 이런 경우 인스턴스로 바꾼다.
  //공통 데이터가 아니라 개별적을 관리 되어야할 데이터는 인스턴스 필드로 만든다.
  
  
  
}
// 관련된 메서드를 모아두는 용도로 클래스 사용.
// 대부분 스태틱 안붙게함


// 1. 이전버전
//public class GasStation {
//
//  static int refuel(Car c) {
//    int amount = 100 - c.energy;
//    c.energy = 100;
//    return amount;
//  }
//  
//  static void clean(Car c) {
//    c.cleanLevel = 0;
//  }
//  
//  
// 2번
//public class GasStation {
//  
//  static int type;
//
//  static int refuel(Car c) {
//    if(c.type != type)
//      return 0;
//    
//    int amount = 100 - c.energy;
//    c.energy = 100;
//    return amount;
//  }
//  
//  static void clean(Car c) {
//    c.cleanLevel = 0;
//  }
//  