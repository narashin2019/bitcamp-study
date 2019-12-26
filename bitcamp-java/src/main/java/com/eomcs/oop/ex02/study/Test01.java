package com.eomcs.oop.ex02.study;

public class Test01 {

  public static void main(String[] args) {
    
    
    Score s = new Score();
    s.name = "홍길동";
    s.kor = 100;
    s.eng = 90;
    s.math = 80;
    
    Score s2 = new Score();
    s2.name = "홍길동";
    s2.kor = 100;
    s2.eng = 90;
    s2.math = 80;
    
    
    //Score.calculate(s); //int i =100; ++(i); 이런 느낌
    //  int i = 100; i++; 이런식으로 쓰고 싶어. s를 앞에서 준다. /스코어 파일에서 static뺀다 ()안도 뺀다.
    s.calculate(); 
    //Score.calculate(); // 안됨!! 꼭 인스턴스 주소s를 앞에 줘야 함.
    // 파라미터로 다른 인스턴스 주소를 줄 필요가 없다!!
    
    s2.calculate(); 
    
    System.out.println(s.sum);
    System.out.println(s.aver);
    
    

    
    
  }
}


