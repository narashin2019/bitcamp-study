package com.eomcs.util;

public abstract class AbstractList<E> implements List<E>{ //리스트 규칙을 따르는 어브스트랙트 리스트 클래스
  
  
  protected int size;
  
  public int size() {
    return size; 
  }
  

  @Override
  public Iterator<E> iterator() {
    // List객체에서 값을 꺼내주는 일을 할 Iterator 구현체를 준비하여 리턴한다.
    return new ListIterator<E>(this); //여기서 this는 링크드 리스트 오어 어레이 리스트
  }
 

}
