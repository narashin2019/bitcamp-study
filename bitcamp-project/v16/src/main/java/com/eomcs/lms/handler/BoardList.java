package com.eomcs.lms.handler;

import java.util.Arrays;
//보드리스트는 데이터만 갖고 있고 아무것도 안하고 있음
//데이터 값을 다루는 연산자가 필요 (add list detail 메서드)
//>얘도 핸들러에서 빼옴
import com.eomcs.lms.domain.Board;

public class BoardList {


  static final int DEFAULI_CAPACITY = 3; //1개 더 add하려고 하면 ArrayIndexOutOfBoundsException: 뜸

  Board[] list;
  int size = 0;

  //(기본생성자 자동생성됨)

  //생성자
  public BoardList() {
    this.list = new Board[DEFAULI_CAPACITY];
  }
  
  //생성자
  public BoardList(int capacity) {
    if(capacity < DEFAULI_CAPACITY || capacity > 10000)
      this.list = new Board[DEFAULI_CAPACITY];
    else
      this.list = new Board[capacity];
  }

  //메서드 (연산자) 보드리스트꺼내는 기능
  public Board[] toArray() {
    /*
    Board[] arr = new Board[this.size];
    for (int i = 0; i < this.size; i++) {
      arr[i] = this.list[i];
    }
    */
    return Arrays.copyOf(this.list, this.size); 
    //새 배열을 만들고 기존 배열에서 사용자가 입력한 사이즈 3개만큼 복사한다. // 클래스스태틱메소드다. 인스턴스없이 ㅏ로 실행하는 경우. 배열을 다루는 클래스다. Arrays 클래스 안에는 배열을 다루는 메서드가 잔뜩 있고 그중에 하나 쓴거다.
  }



  //메서드 (연산자) 배열에 담는 일add도 보드리스트가 한다.
  public void add(Board board) {
    if(this.size == this.list.length) {
      // 현재 배열에 게시글 객체가 꽉 찼으면 배열을 늘린다.
      int oldCapacity = this.list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1); //oldCapacity / 2;보다 속도가 빠르다
      /*
      Board[] arr = new Board[newCapacity];
      for (int i = 0; i < this.list.length; i++) {
        arr[i] = this.list[i];
      }
      this.list = arr; // 새배열의 주소를 담는다. list에
      */
      this.list = Arrays.copyOf(this.list, newCapacity); 
      //새배열의 주소를 list에 넣는다
      System.out.printf("새 배열을 %d개 생성하였음", newCapacity);
    }
    this.list[this.size++] = board;
  }


  // 메서드 (연산자) 디테일
  public Board get(int no) {
    for (int i = 0; i < this.size; i++) {
      if (this.list[i].getNo() == no) {
        return this.list[i];
      }
    }
    return null;
  }

}






