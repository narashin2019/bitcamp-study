package com.eomcs.basic.ex06.assignment;

// 사용자로부터 나이를 입력받아 성년.미성년 여부를 출력하라!

public class Test04_t1 {

  public static void main(String[] args) {
    
    
    //int age = Console.inputInt(); 주석풀면 밑줄 쳐짐. 앗 비난받는 놈이구나. Console.까지 쳐서 뭐있는지 보고 아 이거말고 다른거 써야겠구나 함.
    int age = Console.inputInt("나이? ");
    
    
    if (age >= 18) {
      System.out.println("성년입니다.");
    } else {
      System.out.println("미성년입니다.");
    }
    
    
  }//main
}//class


//실행하니 ""밑변길이 물어보고 앉았음""
//Console.inputInt(); 변경해야함 > Console에 기존코드 그대로 두고 새로운 코드 추가.