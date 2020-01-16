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
 
  
  static class ListIterator<E>  implements Iterator<E> {

  //List 객체에서 Iterator 규칙에 따라 값을 꺼내주는 클래스를 정의
      
      List<E> list;
      int cursor;

      //생성자
      public ListIterator(List<E> list) {
        this.list = list; // this생략불가
      }
      
      
      @Override
      public boolean hasNext() {
        return cursor < list.size();
        
      }

      @Override
      public E next() {
        return list.get(cursor++);
        
      }
      
      
  }


}

/*
 * 패키지 멤버 클래스

리스트이터레이터 : 오브스트랙트 리스트에서만 쓰임 굳이 일반 패키지 멤버 클래스를 할 필요가 없음.
해당 클래스 안에 선언해서 유지보수에 도움되도록 묶어라
네스티드 클래스.
스태틱 : 이 경우로 해본다. 
논스태틱

클래스안에서만 사용하는 클래스라면 바깥에 정의하지 않고 해당 클래스 안에 저장한다.
=네스티드 클래스

*/
