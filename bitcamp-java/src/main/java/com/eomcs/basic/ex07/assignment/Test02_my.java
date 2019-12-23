package com.eomcs.basic.ex07.assignment;

public class Test02_my {
  public static void main(String[] args) {
    int[] values = {34, 4, -3, 78, 12, 22, 45, 0, -22};

    // 배열에 들어 있는 값을 오름차순으로 정렬하라.
    int[] a = sort(values); 

    for (int value : values) {
      System.out.println(value); 
    } // values배열 안에 모든 요소를 출력하는 식
    // 출력결과:
    // -22, -3, 0, 4, 12, 22, 34, 45, 78
  }

  static int[] sort(int[] values) { // 리턴값 타입이 배열이니까 int[]로 써줌


    for (int i = 0; i < values.length-1; i++) {
      boolean changed = false;

      for (int j = 0; j < values.length-1-i; j++) {
        if (values[j] > values[j+1]) {
          int temp = values[j];
          values[j] = values[j+1];
          values[j+1] = temp;
          changed = true;
        }
      }

      if (!changed) 
        break;

    }
    return values;
  }
}

//Arrays.sort(values)
