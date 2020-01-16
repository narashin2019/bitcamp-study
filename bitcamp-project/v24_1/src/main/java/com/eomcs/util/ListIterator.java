package com.eomcs.util;

public class ListIterator<E>  implements Iterator<E> {

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

