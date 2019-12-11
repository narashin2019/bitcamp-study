package com.eomcs.lms;

import java.util.Scanner;
//컴파일러에게 지금부터 아래에 스캐너라는 말이 나오면 java.util.Scanner라는 뜻이다라는 의미

public class App {

  public static void main(String[] args) {

    //System.in.read: 시스템이라는 상자에 키보드가 입력한 것을 받아오는 기능이 있어 바이트로 받아옴. 바지에팬티밖은게 왜없냐는말은 말도안됨. 재활용성이 떨어짐. 옷도 기능별로 쪼개놓음.조립가능
    //Scanner로함, java.util=패키지위치 도구 쓸때마다 위치 알려줘야함
    //java.util.Scanner keycoard = new java.util.Scanner(System.in); + 임포트 문을 씀
    //=> Scanner keyboard = new Scanner(System.in);
    // 키보드에서 사용자가 입력한 값을 읽어 문자열이나 정수, 부동소수점 등르로 리턴하는 역할
    Scanner keyboard = new Scanner(System.in);
    
    
    System.out.print("번호? ");
    //문자열을 담을 메모리, 메모리이름은 넘버 = 사용자가 한줄을 입력할때까지 기다림 엔터치는 순간 그 앞 내룔을 이 자리에 놓고 우항이 리턴할 결과를 좌항에 넣는다. 할당연산자 = 
    String no = keyboard.nextLine();
    
    
    //온풍기.기능명(20, "힝", true, .....); 온풍기=객체야 이 기능(메소드)을 호출해=메소드 콜. 메소드=펑션 
    //매개 = interface
    //매개 수단에는 반드시 규칙이 있어야 한다. 보내는 쪽과 받는 쪽이 일치해야함.
    //컴퓨터와 모니터의 대화 규칙 = DSUB(디지털을 아날로그로), DVI(디지털비주얼인터페이스 속도 빨라 화질 더 선명해, 영상만 받아, 스피커는 본체에 연결), HDMI(DVI에 음성신호까지 포함, 모니터에 스피커연결가능, 얘도 디지털)
    //에어컨 인터페이스 두개: 버튼, 리모콘
    //자바 객체지향프로그래밍언어. 실제 생활에서 기계를 사용하는 것과 유사. 거시기=오브젝트. 한 객체에 여러가지 기능이 있고 그 기능을 쓰는 것. 실생활과 똑같아서 프로그래밍시 마음이 편하다.
    
    //System.out.println(); = 시스템이라는 상자안에 아웃이라는 기능이 있는데 호출+한줄을출력하라(출력할내용1개값)
      
    
    System.out.print("수업명? ");
    String title = keyboard.nextLine();
    
    System.out.print("설명? ");
    String desctiption = keyboard.nextLine();
            
    System.out.print("시작일? ");
    String startDate = keyboard.nextLine(); // 변수이름이 여러단어 조합되어 있을때 2번째 단어부터는 첫글자 대문자
    
    System.out.print("종료일? ");
    String endDate = keyboard.nextLine();
    
    System.out.print("총수업시간? ");
    String totalHours = keyboard.nextLine();
    
    System.out.print("일수업시간? ");
    String dayHours = keyboard.nextLine();
    
    
    System.out.println();
    
    System.out.printf("번호: %s\n", no);  // = System.out.println("번호: " + no);
    System.out.printf("수업명: %s\n", title);
    System.out.printf("설명: %s\n", desctiption);
    System.out.printf("기간: %s ~ %s\n", startDate, endDate); //
    System.out.printf("총수업시간: %s 시간\n", totalHours);
    System.out.printf("일수업시간: %s 시간\n", dayHours);

    //키보드 = 프로그램 종료하기 전에 다른 프로그램을 위해 돌려줘야 함. 어차피 프로그램 종료되면 자동으로 돌려주나 프로그래머는 돌려줍시다. 
    keyboard.close();
    
  }
}

// \n : 이스케이프 문자
// 시스템아웃: 표준출력장치 콘솔 (모니터x)
// 변수 값을 저장하는 메모리
// 할당연산자 = 우항의 내용을 좌측 변수에 저장 방향이 우->좌

// printf:형식을 갖춘 문자 출력
// print println은 그냥 출력