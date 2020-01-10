// Wrapper 클래스 - auto-boxing/auto-unboxing 응용
package com.eomcs.corelib.ex01;

public class Exam0223 {

  static class Member {//중첩클래스도 스태틱이 되어야 한다 메인에서 쓰려면// 중첩 클래스는 그 안에서만 쓰겠다는 것. 안그럼 밖에서 선언하지~
    String name;
    String tel;

    public String toString() {
      return name + ", " + tel;
    }
  }


  public static void main(String[] args) {
    int i = 100;

    Member member = new Member();
    member.name ="홍길동";
    member.tel = "010-1111-2222";

    String str = new String("hello");

    // Wrapper 클래스를 이용하여 auto-boxing, auto-unboxing 기능을 제공함으로써
    // primitive data type 또는 클래스의 인스턴스 구분없이 값을 편리하게 저장할 수 있게 되었다.

    Object obj;
    obj = member;
    obj = str;
    obj = i;

    
    Integer obj2 = (Integer) obj; //가능! 인티저 객체를 인티저라고 알려주는 것 
    
    System.out.println(i);
    System.out.println(obj); 

  }




}






