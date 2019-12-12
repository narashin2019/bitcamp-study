package com.eomcs.basic.ex99;

public class Exam231 {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    // nextInt() 다음에 NextLine()을 호출할 때 공백 문자가 읽히는 문제 해결
    System.out.print("입력>");
    int i1 = scanner.nextInt();
    int i2 = scanner.nextInt();
    
    // 공백만 그냥 읽는다.
    // next()
    //=> 한 개의 token(단어, 양쪽에 공백이 있다)을 읽는다.
    //=> 다음 공백을 만날 때 까지 읽는다.
    //=> 앞 공백은 제거한다.
    //=> 물론 nextInt()와 달리 값을 읽은 후 뒤의 공백은 제거한다. 
    String s1 = scanner.next();

    String s2 = scanner.next();
    
    int i3 = scanner.next();

    String s3 = scanner.next();

    System.out.println("-------------------------------------");
    
    System.out.println(i1);
    System.out.println(i2);
    System.out.println(i3);
    System.out.println(s1);
    System.out.println(s2);
    


  }
}

// 데이터 읽고 난 다음에 커서 개념을 까먹지 말자.
// nextLIne(); 엔터키 누를때까지 