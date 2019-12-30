package com.eomcs.oop.ex03.test;

//다른 패키지의 소스파일 쓰고 싶을때는 패키지 주소를 임포트 문으로 써놓고 밑에서 사용한다.

// 패키지 멤버 클래스: 
// 공개 클래스는 관리 하기 쉽도록 별도 파일로 분리해야함.
// 하나의 자바 소스 파일에 공개된 패키지 멤버 여러 개 둘 수 없다.
// 패키지 멤버라도 공개하지 않는 다면 여러 소스파일 둘 수 있음. class A {}

class Score { //퍼블릭이 되려면 반드시 개별 소스파일로 작성하여 클래스이름과 소스파일 명이 같도록 해야한다.
  static int count; // 클래스 변수는 만들어지면 종료될 때까지 유지(Method Area에)

  //사용자 정의타입 + 연산사(=메서드, 오퍼레이터)
  String name;
  int kor;
  int eng;
  int math;
  int sum;
  float aver;
  
  // 생성자 : 메서드이름이 클래스이름과 같고(대문자도 같음) 파라미터가 없 는게 디폴트 생성자. 생성자는 void 안됨.*** 따로 호출할 수 없고 ();이렇게 생성..? 
  // 생성자 존재이유: 인스턴스가 제대로 사용될 수 있도록 초기화 시킬 때. 인스턴스 만들면서 초기화 쉽게 하려고.
  // 모니터 출고시 디폴트값 명암 채도 유효한 값으로 세팅되어 있음. 생성자는 인스턴스 생성 후 강제 무조건 호출
  // 생성자 안 만들면 컴파일러가 public Score() {} 를 자동으로 만듬.
  // 자바의 모든 클래스는 1개 이상의 생성자는 존재한다. 
  // 둘 다 필요할 수도 아닐수도 1개만 필요할 수도 있음. 
  Score(String name, int kor, int eng, int math) {
    System.out.println("Score()-2");
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    this.compute();
    Score.increase();
  }
  

  // 스태틱(클래스) 메서드 
  // 인스턴스 주소를 파라미터로 준다.
  //  static void compute(Score s) { 
  //    s.sum = s.kor + s.eng + s.math;
  //    s.aver = s.sum / 3f;
  //  }
  // 메서드 내부에서 인스턴스 변수를 사용하지 않을 때는 스태틱으로 만든다.
  static void increase() {
    Score.count++;
  }

  // 더 편한 인스턴스 메서드
  // 파라미터로 주소 받을 필요 없음.
  // 내부 빌트인 변수 this를 통해 사용자 정의 데이터타입을 사용할 수 있다.
  // 메서드 내부에서 인스턴스 변수를 사용할 때는 static뺀다
  void compute() { 
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  } 
}


public class Test01 {

  // 네스티드 클래스  

  public static void main(String[] args) { //메인이 있어야 실행가능
    // 스태틱변수를 클래스가 로딩될 때 만들어진다. 1개만 존재한다. 다른 학생 정보 입력할 수 없다.
    // 여러 개 개별적으로 관리되어야할 데이터라면 인스턴스 변수로 만들어야 한다.
    // new로 생성되면 heap에 생성된다. 인스턴스 
    // s1, s2는 스택영역 = 로컬 변수 , 메서드 안에 선언되고 메서드 호출이 끝나면 사라지는 변수다. 

    Score s1 = new Score("홍길동", 100, 90, 80); //값이 없으면 값이 없는 기본 생성자 호출, 기본생성자 없애면 남아있는 생성자 형식 따라야함
    System.out.println("-------");
    
    Score s2 = new Score("임꺽정", 90, 80, 70); //값을 주면 값이 있는 생성자가 호출
    System.out.println("-------");
    //Score.name = ~; //스태틱 메서드 호출방법
    //s1.compute(); //s1인스턴스의 값을 다룰 연산자(메서드)computer // 인스턴스 메서드 호출 방법
    // 인스턴스 마다 카운트 변수를 따로 만들 필요가 없음. 카운트 변수는 하나여야함. 
    // 인스턴스 변수 중에서 개별적으로 관리할 데이터 제외하고 모든 학생이 공유하는 데이터는 스태틱으로 만들어줘야함. static int count;
    // 스태틱 변수(클래스 변수)는 반드시 클래스 이름으로 주소 적어줘라. Score.count = 1;



  }
}
