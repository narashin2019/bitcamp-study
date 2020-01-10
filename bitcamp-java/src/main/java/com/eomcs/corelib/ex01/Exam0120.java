// String - 문자열 비교
package com.eomcs.corelib.ex01;

public class Exam0120 {
  public static void main(String[] args) {
    String s1 = new String("Hello");
    String s2 = new String("Hello");
    String s3 = "Hello";

    // equals()?
    // => Object에 정의되어 있는 메서드
    // => 인스턴스가 같은지 비교한다.
    //
    System.out.println(s1.equals(s2)); //true
    System.out.println(s1.equals(s3)); //true

    //s1 s2 s3가 서로 다른 인스턴스를 가리키는데 왜 결과가 true인가?
    // => String 클래스에서 equals()를 오버라이딩 했기 때문이다.
    // => 인스턴스를 비교하는 것이 아니라 인스턴스의 내용물을 비교하도록 변경하였다.
    // => s1 s2 s3의 내용물이 같기 때문에 equlas()의 리턴 값은 true이다.
    // 결론!
    // => String 인스턴스의 주소가 아닌 인스턴스의 데이터가 같은 지 비교할 때는
    // equals()라는 메서드를 사용하라! 
    // 오브젝트에서 상속받은 이퀄스라는 메서드. 두 개의 인스턴스 "데이터"가 같은지 비교
  }
}



// 자바 호환언어 컴파일하면 클래스 파일만드는것 그루비 스칼라 코틀린. 
// 자바의 저런 불편한 점을 해소하기 위해 그런 문법을 개발자가 쓰기 편하게 추가
// 결국 컴파일하면 클래스 파일 생성되는 것은 똑같

