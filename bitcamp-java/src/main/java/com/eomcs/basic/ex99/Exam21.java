package com.eomcs.basic.ex99;

public class Exam21 {
  public static void main(String[] args) {
    
    // 키보드 정보를 가져온다.
    java.io.InputStream keyboard = System.in; 
      // 타입 + 키보드는 키보드를 저장할 변수(레퍼런스) = 시스템상자안에 in 표준입력장치
      //java.io.PrintStream console = System.out; 
      // 데이터타입 + 콘솔을 담을 변수 이름 콘솔 =표준 출력장치(콘솔)    
    

    // 키보드 객체에 정수, 부동소수점, 논리값, 문자열을 끊어서 읽어 주는 도우미 객체를 붙인다.
    // 키보드에서 값을 꺼내주는 도구를 연결한다.
    java.util.Scanner scanner = new java.util.Scanner(keyboard);
      // 객체 = 어떤 도구
      // keyboard변수 안에는  System.in 들어 있음
      // 스캐너로 키보드를 감싼다. new: 도구 또는 메모리를 생성하는 명령어
      // 스캐너 자체는 아무일 못한다. 데이터가 들어와야 일을 한다.
      // 스캐너에 키보드를 넘겨줘서 스캐너는 키보드로 작업을 한다. 
      // 키보드에서 들어온 데이터를 가공해서 쓴다 스캐너가.

    //키보드로부터 들어온 바이트 배열을 분석하여
    //줄바꿈 기호를 만나면 그 앞에 입력한 바이트 배열을 
    //문자열로 변환하여 리턴한다.
    //키보드로부터 줄바꿈 값이 들어오지 않으면 영원히 리턴하지 않는다.
    //스캐너.명령어 스캐너에게 내리는 명령어가 점 다음
    String s1 = scanner.nextLine();

    String s2 = scanner.nextLine();

    String s3 = scanner.nextLine();

    System.out.println("-------------------------------------");
    
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);



  }
}

// System.out
// - 표준 출력 장치.
// - 즉 콘솔(모니터, 명령창)을 가리킨다.
// System.in
// - 표준 입력 장치.
// - 즉 키보드를 가리킨다.

/*
        // 키보드 정보를 가져온다.
        java.io.InputStream keyboard = System.in;

        // 키보드에서 값을 꺼내주는 도구를 연결한다.
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);
        
        // print()는 문자열을 출력한 후 줄 바꿈을 하지 않는다.
        System.out.print("팀명? "); 
        
        // nextLine()
        // - Scanner 도구를 사용하여 키보드로부터 한 줄의 문자열을 
        //   가져올 때 사용하는 명령이다.
        // - 동작은? 
        //   사용자가 한 줄 입력할 때까지,
        //   즉 입력 데이터에 줄바꿈을 의미하는 0d0a 2바이트가 들어올 때까지
        //   대기한다.
        //   사용자가 엔터키를 누르면, 
        //   입력값으로 0d0a 2바이트 값이 들어오고,
        //   nextLine() 비로서 사용자가 입력한 값을 리턴한다.
        // - 그 리턴 값을 println() 명령을 사용하여 콘솔로 출력한다.
        System.out.println(keyScan.nextLine());

        keyScan.close();

*/