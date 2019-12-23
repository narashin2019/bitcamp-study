package com.eomcs.basic.ex07.assignment;

public class Test03_my {
  public static void main(String[] args) {
    int[] values = {34, 4, -3, 78, 12, 22, 45, 0, -22};

    // 배열의 들어 있는 값의 순서를 꺼꾸로 바꿔라. 
    reverse(values); 
    
    for (int value : values) {
      System.out.println(value);
    }
    // 출력결과:
    // -22, 0, 45, 22, 12, 78, -3, 4, 34
  }
  
  static int[] reverse(int[] values) {
    
    int tmp;
     for (int j = 0; j < 9; j++) {
       for (int k = 8; j > 4; j--) {
         tmp = values[j];
         values[j] = values[k];
         values[k] = tmp; 
         
         if (values[k]==78) {
           break;
         }
       }
     }
    
    return values;
  }
  
  
}
