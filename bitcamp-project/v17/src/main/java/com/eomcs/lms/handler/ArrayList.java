package com.eomcs.lms.handler;

import java.util.Arrays;
//보드리스트는 데이터만 갖고 있고 아무것도 안하고 있음
//데이터 값을 다루는 연산자가 필요 (add list detail 메서드)
//>얘도 핸들러에서 빼옴
import com.eomcs.lms.domain.Board;

public class ArrayList {

  static final int DEFAULI_CAPACITY = 3; 
  
  Object[] list; 
  int size = 0;


  public ArrayList() {
    this.list = new Object[DEFAULI_CAPACITY]; 
  }
  
  public ArrayList(int capacity) {
    if(capacity < DEFAULI_CAPACITY || capacity > 10000)
      this.list = new Object[DEFAULI_CAPACITY];
    else
      this.list = new Object[capacity];
  }

  public Object[] toArray() {
    return Arrays.copyOf(this.list, this.size); 
  }



  public void add(Object obj) { // 동물을 넘겨줄게요~ (실은 개넘김_)
    if(this.size == this.list.length) {
      int oldCapacity = this.list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1); 
      this.list = Arrays.copyOf(this.list, newCapacity);
    }
    this.list[this.size++] = obj;
  }


  public Object get(int idx) { //인덱스로 바꿈
    if (idx >= 0 && idx < this.size) {
      return this.list[idx];
    } else {
    return null;
    }
  }

}






