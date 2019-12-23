package com.eomcs.basic.ex07;

//# 메서드 : Heap 메모리 영역
//
public class Exam0420 {

  static int[] getArray() {
    int[] arr = new int[] {100, 200, 300};
    return arr;
  }

  public static void main(String[] args) {
    int[] arr;
    arr = getArray();
    System.out.println(arr[1]); // 200
  }
}

// 1) main() 호출
//    => JVM Stack: args, arr 변수 담을 메모리 생성
// 2) getArray() 호출
//    => JVM Stack: arr 변수 생성
//    => Heap: new int[] 배열 생성
// 3) getArray() 호출 끝
//    => JVM Stack: getArray() 관련 메모리(arr 변수) 제거
//    => new int[] 배열 주소 리턴
// 4) main() 호출 끝
//    => JVM Stack: main() 관련 메모리 제거 
// 5) JVM 종료
//    => JVM이 사용한 모든 메모리(Method Area, JVM Stack, Heap 등)를 OS 반납.

//new라는 명령어를 사용해서 만든 메모리는 모두 heap에 존재한다.
//new로만든거 뺴고 전부 로컬변수