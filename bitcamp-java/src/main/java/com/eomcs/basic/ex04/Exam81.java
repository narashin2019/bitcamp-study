package com.eomcs.basic.ex04;

//변수와 블록

public class Exam81 {

  public static void main(String[] args) {

    int a;

    // 메서드 안에 블록을 이용하여 변수의 사용 범위를 통제할 수 있다.
    {
      // 블록 안에서는 블록 밖의 변수를 사용할 수 있다.
      a= 100;

      // 블록 안에 선언된 변수는 블록을 실행할 떄 준비된다.
      int b;
      b = 200;
      // 단 블록을 나가면 자동으로 제거된다.
    }

    //b = 300; // 컴파일 오류

    {
      // 블록 밖의 변수와 같은 이름을 가진 변수를 선언할 수 없다.
      //int a; // 컴파일 오류

      // 다른 블록의 변수와 이름이 같은 변수를 선언할 수 있다.
      // 왜? 블록을 나갈 때 제거되기 때문이다.
      int b; //OK
    }

    if (true) {
      // int a= 200; 오류
      int b = 200; //OK
    }
    //b = 300; // 컴파일 오류

  }

}


//cf. 자바 스크립트는 블록으로 변수 통제 x


/*
--------------------------------------

package com.eomcs.basic.ex04;

//# 변수의 종류 - 같은 블록에서는 중복 선언 불가
public class Exam0810 {

int a; // 인스턴스 변수

static int b; // 클래스 변수

// 클래스 블록 안에 선언된 변수는 종류에 상관없이 중복 선언 불가!
//int a; // 컴파일 오류!
//static int a; // 컴파일 오류!
//int b; // 컴파일 오류!
//static int b;  // 컴파일 오류!

public static void main(String[] args/*로컬변수=파라미터*/) {
  // 그러나 메서스 블록에서는 클래스에 선언된 변수의 이름과 
  // 같은 변수를 선언할 수 있다.
  // 왜? 영역이 다르니까!
  int a;
  int b;

  // 마찬가지로 이 블록 안에서는 같은 이름의 변수를 만들 수 없다.
  //String a; // 컴파일 오류! 데이터 타입에 상관없이 이름 중복 불가!
}

public static void m2() {
  // 여기에 선언된 변수는 main() 블록에 선언된 변수와 다른 변수이다.
  int a;
  int b;
}


}
--------------------------------------

package com.eomcs.basic.ex04;

//# 로컬 변수와 블록
//
public class Exam0820 {
public static void main(String[] args) {
  
  int a = 100;

  {
    //int a = 200; // 컴파일 오류!
    // 메서드 안에서는 변수 이름 중복 불가!
    // 안쪽 블록에서는 바깥 블록의 변수를 사용할 수 있다.
    a = 200;

    int b = 300;
    // 이 블록의 실행을 끝내는 순간 
    // 이 블록에서 선언된 모든 변수는 제거된다.
    // 그래서 b 변수는 제거된다.
  }
  System.out.println(a);

  // 바깥 블록에서는 안쪽 블록의 변수를 사용할 수 없다.
  // 왜?
  // 안쪽 블록의 실행이 끝나면, 안쪽 블록에서 선언된 모든 변수들이
  // 자동으로 제거된다.
  //System.out.println(b); // 컴파일 오류!

  {
    // 이전 블록에서 선언된 변수는 그 블록이 종료되는 순간 
    // 제거되기 때문에, 
    // 다음과 같이 같은 이름의 변수를 선언할 수 있다.
    int b = 400;
  }
}
}


---------------------------------------------
public class Exam83 {
  int a; // 인스턴스 변수
  static int b; // 클래스 변수

  // 클래스 블록 안에 선언된 변수는 종류에 상관없이 중복 선언 불가!
  /*
  int a; // 컴파일 오류!
  static int a; // 컴파일 오류!
  int b; // 컴파일 오류!
  static int b;  // 컴파일 오류!
  */

  public static void main(String[] args/*로컬변수=파라미터*/) {
      // 그러나 메서스 블록에서는 클래스에 선언된 변수의 이름과 
      // 같은 변수를 선언할 수 있다.
      // 왜? 영역이 다르니까!
      int a;
      int b;

      // 마찬가지로 이 블록 안에서는 같은 이름의 변수를 만들 수 없다.
      String a; // 컴파일 오류! 데이터 타입에 상관없이 이름 중복 불가!
  }

  public static void m2() {
      // 여기에 선언된 변수는 main() 블록에 선언된 변수와 다른 변수이다.
      int a;
      int b;
  }
}
-------------------------------------------


public class Exam84 {
    public static void main(String[] args) {
        int a = 100;

        {
            //int a = 200; // 컴파일 오류!
                         // 메서드 안에서는 변수 이름 중복 불가!
            // 안쪽 블록에서는 바깥 블록의 변수를 사용할 수 있다.
            a = 200;

            int b = 300;
            // 이 블록의 실행을 끝내는 순간 
            // 이 블록에서 선언된 모든 변수는 제거된다.
            // 그래서 b 변수는 제거된다.
        }
        System.out.println(a);

        // 바깥 블록에서는 안쪽 블록의 변수를 사용할 수 없다.
        // 왜?
        // 안쪽 블록의 실행이 끝나면, 안쪽 블록에서 선언된 모든 변수들이
        // 자동으로 제거된다.
        //System.out.println(b); // 컴파일 오류!

        {
            // 이전 블록에서 선언된 변수는 그 블록이 종료되는 순간 
            // 제거되기 때문에, 
            // 다음과 같이 같은 이름의 변수를 선언할 수 있다.
            int b = 400;
        }
    }
}


*/