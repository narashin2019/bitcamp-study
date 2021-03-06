package com.eomcs.util;

import java.util.Arrays;

public class ArrayList<E> {
  //ArrayList에서 다룰 <클래스이름>을 받는변수. E = 변수명 일반적인 변수명아님
  //E만약 E자리에 다른 클래스 이름이 온다면 E를 쓰던 자리는 다 바꾸어야 한다.

  static final int DEFAULI_CAPACITY = 3; 

  Object[] list; 
  int size = 0; // 뉴 했을떄 만들어지는 메모리의 설계도


  public ArrayList() {
    this.list = new Object[DEFAULI_CAPACITY]; 
  }

  public ArrayList(int capacity) {
    if(capacity < DEFAULI_CAPACITY || capacity > 10000)
      this.list = new Object[DEFAULI_CAPACITY];
    else
      this.list = new Object[capacity];
  }

  @SuppressWarnings("unchecked")
  public E[] toArray(E[] arr) {// 제네릭은  E[] arr = new = E[100]; 이거 안됨  배열을 뉴로 못만듬
   
    if (arr.length < this.size) {
      return (E[]) Arrays.copyOf(this.list, this.size, arr.getClass());
    }
    
    System.arraycopy(this.list, 0, arr, 0, this.size);
    
    //this.list를 0번방부터 arr에 0번방부터 this.size만큼 복사한다
    
    // 위는 클래스메서드 = 스태틱메서드. 주어진 파라미터 가지고 일을하는 메서드는 스태틱메서드. 특정 인스턴스변수 쓰지않음.
    // 위의 arraycopy()는 다음 코드와 같다.
    // for (int i = 0; i <arr.length; i++) {
    //   arr[i] = (E) this.list[i];
    // }

    return arr;
  }


  public void add(E obj) {
    if(this.size == this.list.length) {
      int oldCapacity = this.list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1); 
      this.list = Arrays.copyOf(this.list, newCapacity);
    }
    this.list[this.size++] = obj;
  }


  @SuppressWarnings("unchecked")
  public E get(int idx) {
    if (idx >= 0 && idx < this.size) {
      return (E)this.list[idx]; //타입캐스팅
    } else {
      return null;
    }
  }

  public int size() {
    return this.size; //this는 생략가능. this변수에 들어있는 size
  }


}


// copyOf () 메서드야
// arrayType에 지정된 배열을 size만큼 만들어라.
// 그리고 List배열에 저장죈 주소를 새로 만든 배열에 복사하라.
// 마지막으로 새로만든 배열의 주소를 리턴한다,



