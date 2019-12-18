package com.eomcs.basic.ex06.assignment;

// 사용자로부터 너비 높이를 입력받아 사각형을 그려라.

public class Test05_t1 {

  public static void main(String[] args) {
    
    
    //int width, height = Console.inputInt(); 주석풀면 밑줄 쳐짐. 앗 비난받는 놈이구나. Console.까지 쳐서 뭐있는지 보고 아 이거말고 다른거 써야겠구나 함.
    int width = Console.inputInt("너비? ");
    int height = Console.inputInt("높이? ");
    
    Graphic.drawRectangle(width, height, '*');
    
    
  }//main
}//class


//실행하니 밑변길이 물어보고 앉았음
//Console.inputInt(); 변경해야함 > Console에 기존코드 그대로 두고 새로운 코드 추가.