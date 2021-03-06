package com.eomcs.basic.ex07;

//# 메서드 : 스택 오버플로우 예외
//
public class Exam0461 {

  static int sum(int value) {
    if (value == 1)
      return 1;

    return value + sum(value - 1);
  }

  public static void main(String[] args) {
    
    // 스택 오버플로우(stack overflow)?
    // => JVM 스택 메모리가 꽉 차서 더이상 메서드 실행을 위해 로컬변수를 
    //    만들 수 없 상태이다.
    //
    // 예)
    // 그런데 다음과 같이 큰 수를 계산할 때는 
    // 재귀호출의 수가 높아져서 쉽게 스택 메모리가 부족해지는 문제가 발생한다.
    // 따라서 호출 단계가 깊지 않은 작은 수를 다룰 경우에는 
    // 재귀호출을 써도 되지만,
    // 호출 단계가 많은 큰 수를 다룰 때는 재귀호출 대신 반복문을 사용하라!
    System.out.println(sum(20000)); // StackOverflowError
    
    // 메소드 호출이 너무 깊어지는 경우는 재귀호출 대신 다른 바업ㅂ을 사용하라.
//    long sum = 0;
//    for (int i = 1; i <=100000; i++) {
//      sum += i;
//    }
//    System.out.println(sum);
    
  }
}
// JVM Stack 메모리의 사용
// 0) 시작
// 1) main()
// 2) main() => sum(5) 
//           => 5 + sum(4) 
//                  => 4 + sum(3)
//                         => 3 + sum(2)
//                                => 2 + sum(1)
//                                       => 1
// 3) main()
// 4) 종료!
//
// 재귀호출(recursive call)
// - 수학식을 코드를 표현하기가 편하다.
// - 코드가 간결하다.
// - 그러나 반복문을 사용하는 경우보다 메모리를 많이 사용한다.
// - 멈춰야 할 조건을 빠뜨리면 스택 메모리가 극한으로 증가하여
//   메모리가 부족한 사태에 빠진다.
//   이런 사태를 "stackoverflow"라 부른다.
// - 그래서 큰 수(즉 많이 호출되는 경우)에 대해서 
//   재귀호출을 할 때 스택오버플로우가 자주 발생한다.
// 

//시작할때는 메모리저장방식으로 접근 나중에는 인간의 사고처럼 추상화 관점으로 접근