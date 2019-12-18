package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class Console {

  @Deprecated // 비난받는 메소드다 표시하는 애노테이션
  static int inputInt() {  
    return inputInt("밑변 길이? ");
  }

  static int inputInt(String message) {  
    Scanner keyScan = new Scanner(System.in);
    System.out.print(message); 
    int width = keyScan.nextInt(); 
    //keyScan.close();
    return width;
    }


  }

//애노테이션(annotation) @Deprecated
//- 컴파일러나 JVM에게 지시하는 명령
//- 실행 중에 추출해서 사용하는 특별한 데이터

  //일단 한번 쓰이기 시작한 코드는 함부로 못바꿔 전체 다 바꿔야 해서.
  // 원래 실행하던 기존코드를 버리면 안된다 = 전체 다 바꿔야 해서, 차마 지우지 못함
  // 그래서 기존코드 그냥 두고 살짝 변경하고 그 밑에 새로운애(더 범용적으로 사용할 수 있는 코드) 둬.
  // 앞으로는 새로운 애 쓰라는 표시 해줘야함 @Deprecated = 애노테이션
  // 
  //static int inputInt() {  
  //  Scanner keyScan = new Scanner(System.in);
  //  System.out.print("밑변 길이? "); 
  //  int width = keyScan.nextInt(); 
  //  keyScan.close();
  //  return width;
  //}
  //
//  static int inputInt(String message) {  
//    Scanner keyScan = new Scanner(System.in);
//    System.out.print(message); 
//    int width = keyScan.nextInt(); 
//    keyScan.close();
//    return width;
//  }

//


//
//
////keyScan.close(); 예제5번 떄문에 닫아줌