package com.eomcs.oop.ex02.study;

public class Test02 {

  public static void main(String[] args) {


    // 식1) 2 + 3 - 1 * 7 / 3 = ?
    // 식2) 3 * 2 + 7 / 4 - 5 = ?
    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();
    
    
    // Calculate의 result 변수는 static이라서 
    // 클래스에 한 개만 존재한다.
    // 따라서 ( 다음과 같이) 여러 개의 결과를 동시에 관리할 수 없다.
    // 오직 한 번에 한 개의 결과만 관리할 수 있다.
    // 그래서 한 개의 식을 끝낸 다음에 다른 식을 계산해야 한다.
    // 결과를 개별적으로 관리하고 싶다면 non-static 필드로 선언하라!
    // 즉 인스턴스 마다 따로 생성되게 하라!
    // 인스턴스 필드로 만들면 된다.
    
    //3. 마지막 단계 메서드를 호출할 떄 어떤 result변수에 그 계산결과를 저장할 것인지 
    // 파라미터로 인스턴스 주소를 넘겨야 한다.
    c1.plus(2); //Calculator.plus(c1, 2); // 식1
    c2.plus(3); //Calculator.plus(c2, 3); // 식2
    
    Calculator.plus(c1, 3); // 식1
    Calculator.multiple(c2, 2); // 식2
    
    Calculator.minus(c1, 1); // 식1
    Calculator.plus(c2, 7); // 식2
    
    Calculator.multiple(c1, 7);//식1
    Calculator.divide(c2, 4); // 식2
    
    Calculator.divide(c1, 3); //식1
    Calculator.multiple(c2, 5); // 식2


    System.out.printf("식1 결과: %d\n", c1.result); // 식1?
    System.out.printf("식2 결과: %d\n", c2.result); // 식2?

  }





}
