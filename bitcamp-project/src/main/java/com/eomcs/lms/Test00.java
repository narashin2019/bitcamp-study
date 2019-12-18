package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

//고급
// 1) 배열의 개수를 변수에 저장하여 크기 변경을 쉽게 하기
// 2) 배열의 개수를 저장하고 있는 변수를 함부로 변경하지 못하도록 한다.
//    final
// 3) 코드를 관리하기 쉽도록 작은 기능 단위로 분리한다.
//    메서드
// 4) 메서드 사이에 공유하는 변수는 클래스 변수로 선언한다.
//    스태틱변수
// 5) 복합 데이터를 저장할 메모리를 설계한다.
//    클래스 
//    -프로그램에서 다룰 데이터를 위해서 사용자 정의 데이터 타입을 만드는 것
//    -관련된 기능들을 유지보수하기 쉽도록 묶는 용도 (지금 이 파일!)

public class App3 {
  //메인메소드와 프린트보드메소드가 공유하는 변수
  static final int size = 5735; //  상수 변경할 수 없는 값
 
  static Board[] boards = new Board[size]; // 보드 설계도에 따라 new 생성하라 5735식판꼽을 수 있는 배식차!!!!!!!!!
     
  static int count = 0;

  public static void main(String[] args) {
    // 게시물을 여러개 입력받고 여러개 게시물을 출력한다 메인메소드만 봐도 알 수 있음
    inputBoards();

    System.out.println();

    printBoards();
  }

  
  
  static void inputBoards() {
    Scanner keyboard = new Scanner(System.in); //키보드는 이 안에서만 사용됨
    String response;

    for (int i = 0; 1 < size; i++) {
      Board b = new Board(); //Board 설계도에 따라 메모리를 준비해서 리턴한다. 진짜 식판준비하는 것
      
      System.out.print("번호? ");
      b.no = keyboard.nextInt(); // b식판에 no넣어라
      keyboard.nextLine(); 

      System.out.print("내용? ");
      b.title = keyboard.nextLine();

      b.date = new Date(System.currentTimeMillis());

      b.viewCount = 0;

      boards[i] = b; // boards=배식차 식판을 담는 식판을 배식차 지정된 위치에 꼽는다
      
      count++; // => count = count + 1;

      System.out.println();

      System.out.print("계속 입력하시겠습니까?(Y/n) ");
      System.out.println();
      response = keyboard.nextLine();
      if (!response.equalsIgnoreCase("y")) {
        break;
      }
    }
    keyboard.close();
  }

  static void printBoards( ) {
    for (int i = 0; i < count; i++) {
      Board b = boards[i];
      System.out.printf("%d, %s, %s, %d\n", b.no, b.title, b.date, b.viewCount);
    }

  }
}