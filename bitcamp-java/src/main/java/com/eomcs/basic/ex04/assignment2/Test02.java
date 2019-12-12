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

    Scanner sc = new Scanner(System.in);

    System.out.println("가위 바위 보? ");
    String s = sc.next();
    sc.close();

    int user = 0;

    switch (s) {
      case "가위" :
        user = 1;
        break;
      case "바위" :
        user = 2;
        break;
      case "보" :
        user = 3;
        break;
      default :
        user = 6;
        System.out.println("..");
    }


    int com = (int)(Math.random() * 3) + 1;

    switch (com) {
      case 1:
        System.out.println("컴퓨터: 가위");
        break;
      case 2 :
        System.out.println("컴퓨터: 바위");
        break;
      case 3 :
        System.out.println("컴퓨터: 보");
        break;
    }

    if (user-com==-2 || user-com==1) {
      System.out.println("이겼습니다.");
    } else if (user-com==-1 || user-com==2) {
      System.out.println("졌습니다.");
    } else if (user-com==0) {
      System.out.println("비겼습니다.");
    } else {
      System.out.println("컴퓨터: 가위, 바위, 보를 내라고 멍충아. 무조건 내가 이겼습니다!");
    }


  }
}  


