package com.eomcs.oop.ex02.study;

public class Calculator { //클래스는 명사 또는 명사구로 함. 인터페이스 이름은 가끔 형용사로 짓지만 

  
  // 메서드가 작업한 결과를 보관하기 위해 필드 문법을 도입!
  //0초기화 안해도 필드는 자동초기화 0. 로컬변수는 초기화 해야함// 스태틱변수는 한개만 존재. 여러식 동시에 처리불가
  //static int result;
  //계산 결과를 개별적으로 관리하고 싶다면 인스턴스 필드로 선언해야 한다. > Test02에서 new로 생성해야한다.그리고 주소로 주고받음.
  int result;
  
  // 개별적으로 관리되는 인스턴스 변수 result를 사용하고 싶다면,
  // 파라미터로 인스턴스의 주소를 받아야 한다. 
  // 스태틱 메서드에서 인스턴스의 필드나 메서드를 사용할 수 없다.
  // 인스턴스 필드나 인스턴스 메서드를 사용하려면
  // 파라미터로 인스턴스 주소를 받아야 한다. reserved keyword: 자바에서 미리 찜해놓은 단어들.
  
  //3. 마지막단계: 인스턴스 메서드로 만든다. static빼고 ()안에 Calculator that을 지우고, this.result로 바꿈
  void plus(int value) { //void : 리턴값없다
    this.result += value; // result = result + value
  }

  void minus(int value) { 
    this.result -= value; //that에 저장된 주소가 가리키는 객체의 리졀트
  }

  void multiple(int value) {
    this.result *= value;
  }

  void divide(int value) {
    this.result /= value;
  }
  
}
