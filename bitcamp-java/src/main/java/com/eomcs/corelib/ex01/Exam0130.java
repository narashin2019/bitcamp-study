// String - mutable vs immutable 객체 //변경할 수 있는 변경할 수 없는
package com.eomcs.corelib.ex01;

public class Exam0130 {
  public static void main(String[] args) {
    // String 객체는 immutable 객체이다.
    // 즉 한 번 객체에 값을 담으면 변경할 수 없다.

    String s1 = new String("Hello");

    // String 클래스의 메서드는 우너본 인스턴스의 데이터를 변경하지 않는다. 
    // 다만 새로 String 객체를 만들 뿐이다.
    
    // s1주소 주면서 문자열 인스턴스 줄테니 바꿔죠라는 리플레이스 함수. 바꾼거 주소는 s2에 저장
    // 스트링은 이뮤터블!!!
    String s2 = s1.replace('l', 'x');
    System.out.printf("%s : %s\n", s1, s2); // 원본은 바뀌지 않는다.

    // 문자열을 붙이는 메서드 컨캑트네이션! 새로 스트링을 만들고 문자열을 붙이고 새 주소를 s3에 리턴.
    String s3 = s1.concat(", world!");
    System.out.printf("%s : %s\n", s1, s3); // 원본은 바뀌지 않는다.

  }
}





