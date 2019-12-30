// 인스턴스 메서드와 클래스 메서드의 활용 - wrapper 클래스 
package com.eomcs.oop.ex04;

public class Exam0220 {
  public static void main(String[] args) throws Exception {
    // 다음과 같이 생성자를 통해 Integer 객체를 생성할 수 있지만,
    // 이 생성자는 사용하지 말라고 권고한 것이기 때문에
    // 가능한 개발 중에 사용하지 말라!
    //Integer i1 = new Integer(100); //Integer라는 클래스설계도 대로 인스턴스를 생성하는 문장. 취소선있음 = 비난받는 쓰지말아야하는
    //Integer i2 = new Integer(200);
    //Integer i3 = new Integer(300);

    // 대신 다음과 같이 클래스 메서드를 사용하여 Integer 인스턴스를 생성하라.
    Integer i1 = Integer.valueOf(100);
    Integer i2 = Integer.valueOf(200);    
    Integer i3 = Integer.valueOf(300);
    
    
    // 인스턴스 메서드 사용
    System.out.println(i2.compareTo(i1)); // 양수
    System.out.println(i2.compareTo(i3)); // 음수

    
    // 인스턴스 메서드
    int v1 = i2.intValue();
    System.out.println(v1);

    
    // 스태틱 메서드 = 클래스 메서드 사용 (특정 인스턴스에 종속되지 않는다) (클래스이름으로 호출)
    int v2 = Integer.parseInt("1280");
    String s1 = Integer.toBinaryString(77); //2진수 문자열 형태로 리턴
    String s2 = Integer.toOctalString(77);
    String s3 = Integer.toHexString(77);
    System.out.printf("77 = %s, %s, %s\n", s1, s2, s3);

    
    Integer x1 = Integer.valueOf("44"); // 문자열에 있는 수를 10진수로 간주한다.
    Integer x2 = Integer.valueOf("44", 16); // 16진수라고 지정한다.
    System.out.printf("%d, %d\n", x1, x2);

    float f = Float.parseFloat("3.14f");
    boolean b = Boolean.parseBoolean("true");
    System.out.printf("%f, %b\n", f, b);

  }
}





