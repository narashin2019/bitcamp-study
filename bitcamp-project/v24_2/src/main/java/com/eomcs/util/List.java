package com.eomcs.util;

public interface List<E> {


  void add (E e);

  void add(int index, E value);

  abstract E get(int index);

  E set(int index, E e);

  E remove(int index);

  Object[] toArray();

  E[] toArray(E[] arr);

  int size();

  // 내부에 보관된 값을 꺼내주는 메서드 규칙을 추가한다.
  // => 값을 저장하는 방식에 따라 구현 방법이 다르기 때문에
  //    서브 클래스가 반드시 구현해야만 하는 추상 메서드이다.
  Iterator<E> iterator();



}
