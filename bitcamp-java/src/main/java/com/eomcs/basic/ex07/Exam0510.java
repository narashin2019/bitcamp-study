package com.eomcs.basic.ex07;

//# 메서드 : main() 메서드
//
public class Exam0510 {

  // JVM이 클래스를 실행할 때 main() 메서드를 호출한다.
  // 메인 메서드는 반드시 다음과 같은 메서드 시그너처(함수 프로토타입)를 가져야 한다.
  // public static void main(String[] 변수명)
  // 
   public static void main(String[] 변수명은상관없다) {
    System.out.println("Hello!");
  }
}

// public static void main(String[] 변수명은상관없다)에서 
// public빼면 실행 안된다. 이전 출력이 콘솔에 계속 뜸 
// 하나라도 빼면 안된다.
// main이 틀려서 실행할 수 없는 소스파일은 run as에서 안뜬다.


