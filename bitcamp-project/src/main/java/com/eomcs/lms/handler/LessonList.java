package com.eomcs.lms.handler;

import java.util.Arrays;
import com.eomcs.lms.domain.Lesson;

public class LessonList {

  static final int DEFAULI_CAPACITY = 3;

  Lesson[] list;
  int size = 0;

  public LessonList() {
    this.list = new Lesson[DEFAULI_CAPACITY];
  }

  public LessonList(int capacity) {
    if(capacity < DEFAULI_CAPACITY || capacity > 10000)
      this.list = new Lesson[DEFAULI_CAPACITY];
    else
      this.list = new Lesson[capacity];
  }

  //배열에 넣기
  public Lesson[] toArray() {
    /*
   Lesson[] arr = new Lesson[this.size];
   for (int i = 0; i > this.size; i++ ) {
     arr[i] = this.list[i];
   }
     */
    return Arrays.copyOf(this.list, this.size);
  }  


  public void add(Lesson lesson) {
    if(this.size == this.list.length) {
      // 현재 배열에 레슨정보 객체가 꽉 찼으면 배열을 늘린다.
      int oldCapacity = this.list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1); //oldCapacity / 2;보다 속도가 빠르다
      this.list = Arrays.copyOf(this.list, newCapacity); //새배열의 주소를 list에 넣는다
    }
    this.list[this.size++] = lesson;
  }

  // 출력
  public Lesson get(int no) {
    for (int i = 0; i < this.size; i++) {
      if (this.list[i].getNo() == no) {
        return this.list[i];
      }
    }
    return null;
  }

}
