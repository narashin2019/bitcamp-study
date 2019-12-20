package com.eomcs.basic.ex07.test;

public class Test01 {

  public static void main(String[] args) {


    // 입력 값 : X, 리턴 값: X
    m1(); // 메서드 부르는 문법.
    
    // 입력 값 : O, 리턴값: X
    m2("홍길동"); // 이 기능을 실행할 떄 필요한 값을 ()안에 넣어줌 아규먼트
    
    // 입력 값 : X, 리턴 값: O
    String s;
    s = m3(); //어떤 값을 리턴하는 메서드가 있다. 안받아도 된다. 리턴값 받으려면 메모리가 필요하다. 문자열을 리턴하니까 문자열 답는 변수를 준비한다. 
    System.out.println(s);
    
    // 입력 값 : O, 리턴 값  : O
    String s2 = m4("홍길동");
    System.out.println(s2);
  }
  
  static void m1() { // 실행해봐야 아무런 값이 안남는다. 리턴하지 않는다/ mi 메서드의 이름/ () 이 블럭을 수행할 때 필요한 값이 있으면 외부로부터 받겠다. 값을 받을 필요가 없으면 () 빈괄호로 / {기능을 수행하는 명령어들} / 이 기능을 수행할때는 어떤 값도 받지 않고 어떤 값을 리턴하지도 않는다.
    System.out.println("Hello!");
  }
  
  static void m2(String name/*파라미터*/) { // 이 기능을 실행할떄 필요한 넘겨받는 받의 타입과 이름을 ()안에 넣어줌. 
    // 함수 안에 선언된 변수를 "로컬(local) 변수"라 부른다.
    // 로컬 변수 중에서 함수(메서드)가 호출될 때 넘어 온 값을
    // 받는 변수를 "파라미터(parameter)"라 부른다.
    // 함수를 호출할 때 넘겨주는 값을 "아규먼트(argument)"라 부른다.
    // 섞어서 부르기도함.. 실무에선 
    
    //System.out.println("Hello");// 값을 받았는데 왜 안써...
    System.out.println("Hello, " + name); // 이렇게 써야지 값을 사용함
  }

  static String m3() { // 리턴하는 값의 데이터 타입을 void 뺴고 적어줌
    String message = "Hellooo";
    return message; // 값을 받지않고 리턴하는 값이 있는 메서드. 리턴값은 무조건 한 개
    
  }
  
  static String m4(String name) { // 값을 받아서 작업을 실행하고 또다른 값을 리턴한다. 
    String message = name +"님 안녕하세요!";
    return message;
  }
}
