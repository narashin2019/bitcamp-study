package com.eomcs.oop.ex02.study;

public class Score { //static이 안붙었어! => new로 생성되는 메모리구나.
  // 변수선언을 통해 메모리 구조 설계 : 인스턴스 변수
  String name;
  int kor;
  int eng;
  int math;
  int sum;
  float aver;

  
  // 메서드를 통해 값을 계산하는 기능을 추가 (동사로 시작) : 연산자 정의
  // => 합계와 평균을 계산하는 기능을 추가한다. 
  // => 메서드를 다음과 같이 호출할 때,
  //      인스턴스주소.메서드명();
  //    인스턴스 주소를 자동으로 받는 메서드 문법이 있다.
  //    "인스턴스 메서드" 이다.
  // => 인스턴스 메서드는 static을 붙이지 않는다.
  // => 메서드를 호출할 때 넘겨준 인스턴스 주소는 내장 변수 this에 자동 보관된다. 
  public void calculate() { //스코어 파일에서 static뺀다 ()안도 뺀다. 내부적으로 Score this라는 변수가 자동생성됨. this변수로 받음
    // 인스턴스 메서드는 인스턴스 주소를 받는 내장 변수(built-in)가 있다. (우리가 선언x) 자동으로 인스턴스 주소를 this가 받음.
    // 그 변수의 이름은 this이다.
    // 메서드 앞에 넘겨준 인스턴스주소변수 s가 this에 들어간다
    
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  } // static이 안붙었네! 인스턴스 메서드네! this가 있겠네. 인스턴스의 값을 다루는 오퍼레이터네!
  
}

//인스턴스를 다루기 쉽도록 하는게 인스턴스 메서드. this에 보낼 값은 호풀시 앞에 줌. 