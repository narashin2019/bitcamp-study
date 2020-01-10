// StringBuffer - 문자열 비교
package com.eomcs.corelib.ex01;

public class Exam0121 {
  public static void main(String[] args) {

    // StringBuffer를 사용할 때 주의사항!
    // StringBuffer의 내용물을 비교할 때 equals() 사용해봐야 소용없다.
    // == 연산자와 같은 결과를 출력한다.


    StringBuffer b1 = new StringBuffer("Hello");
    StringBuffer b2 = new StringBuffer("Hello");
    
    System.out.println(b1 == b2);
    // => b1 b2 인스턴스가 다르니까 당연히 결과는 false이다
    
    System.out.println(b1.equals(b2));
    // => StringBuffer는 Object에서 상속 받은 equals()를 오버라이딩 하지 않았다. (오브젝트의 이퀄스는 주소를 비교)
    // => 따라서 원래 Object의 equals()를 사용한다. 그러니 결과는 false이다.
    //
    
    
    // 해결책?
    // => StringBuffer에서 String을 꺼내(b1.toString()) 비교하라!
      System.out.println(b1.toString().equals(b2.toString()));
  }
}




// 스트링 버퍼에 컴페어도 있음
