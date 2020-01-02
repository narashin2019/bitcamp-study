package com.eomcs.oop.ex05.g;

public class B extends A {
    int v2;
    
    B() {
        // 수퍼 클래스의 어떤 생성자를 호출할지 지정하지 않으면 컴파일러는 
        // 다음과 같이 수퍼 클래스의 기본 생성자를 호출하라는 명령을 붙인다.
        //super();
        // 만약 수퍼 클래스에 기본 생성자가 없으면 컴파일 오류가 발생한다!
        // Implicit super constructor A() is undefined. Must explicitly invoke another constructor
      
        // 수퍼클래스의 기본생성자가 없는 경우 해결 방법?
        // => 개발자가 직접 수퍼 클래스에 있는(존재하는) 생성자를 지정해서 호출하라! (맨 첫줄에!) 호출될 생성자를 지정할 수 있다.
        super(100);
        
        System.out.println("B() 생성자!");
    }
}






