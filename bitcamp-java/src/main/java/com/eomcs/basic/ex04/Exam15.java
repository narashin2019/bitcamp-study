package com.eomcs.basic.ex04;

import org.graalvm.compiler.lir.stackslotalloc.StackSlotAllocatorUtil;

//# 변수 사용
//- 다른 도구(메서드; 함수라고도 부른다)에 값을 전달 할 수 있다.
//

public class Exam15 {
  public static void main(String[] args) {
    // 변수 사용

    int i;
    i = 100;

    System.out.println(i);
    // println()에 i변수를 전달하는 것이 아니라
    // i변수에 들어 있는 값을 전달하는 것이다.

  }
}

 //println() 메서드(도구)
    //- 콘솔(console)로 값을 출력할 때 사용하는 도구이다.
    //- 즉 JVM의 표준 출력 장치로 값을 출력한다.
    //- 사용법
    //    System.out.println(리터럴 또는 변수, 결과가 생성되는 명령문)
    //