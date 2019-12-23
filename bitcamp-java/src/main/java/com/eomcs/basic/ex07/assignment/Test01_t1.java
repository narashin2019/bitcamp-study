package com.eomcs.basic.ex07.assignment;

public class Test01_t1 {
  public static void main(String[] args) {
    // 배열의 값 중에서 최대 값을 출력하라.
    int[] values = {34, 4, -3, 78, 12, 22, 45, 0, -22}; //new int[]생략
   
    
    int value = max(values); // values = 배열의 주소 갖고 있음, max라는 이름을 가진 코드 블럭(메서드)을 실행하라. 갈때 주소를 넘김
    // 메소드 호출 values = 아규먼트
    
    System.out.println(value);
    // 출력결과:
    // 78
  }

  static int max(int[] values) { // max라는 최대값 계산하는 코드블럭 메서드, ()=이 로컬변수를 파라미터라 부름
    // 파라미터(int[] values)로 배열을 받고(배열 주소를 받고), 그 값 중에서 최대 값을 찾아 리턴한다.
    //int[] values = {34, 4, -3, 78, 12, 22, 45, 0, -22};
    
    
    int maxValue = values[0]; 
    for (int i = 1 ; i < values.length; i++) {
      if ( values[i] > maxValue) {
        maxValue = values[i];
      }
    }
    return maxValue; // 밸류 값을 리턴한다
 }
}
