// 과제 1 : 가위,바위,보 게임 애플리케이션을 작성하라.
// - 실행1
// 가위,바위,보? 보
// 컴퓨터: 가위  (랜덤 값이 출력된다. 힌트: Math.random())
// => 졌습니다.
//
// - 실행2
// 가위,바위,보? 바위
// 컴퓨터: 가위
// => 이겼습니다.
//
package com.eomcs.basic.ex04.assignment2;

import java.util.Scanner;

public class Test02 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    
    
    
    
    
    System.out.print("컴퓨터: ");
    for (int i = 1; i < 3; i++) {
      int random = (int) (Math.random() * 10);
      System.out.println("" + random);
       
  }

//
//    
//    scanner.close();
//  
//    
//    System.out.println("=> 졌습니다.");
//    
//    
//    System.out.print("=> ");
//
//    
//    switch(s) {
//      case "+" :
//        System.out.print(i1+" + "+i2+" = "+(i1 + i2));
//        break;
//
//      case "-" :
//        System.out.println(i1+" - "+i2+" = "+(i1 - i2));
//        break;
//
//      case "*" :
//        System.out.println(i1+" * "+i2+" = "+(i1 * i2));
//        break;
//
//      case "/" :
//        System.out.println(i1+" / "+i2+" = "+(i1 / i2));
//        break;
//        
//      default :
//        System.out.println("0");
//    }

  }

}