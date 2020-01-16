package com.eomcs.util;

public class StackIterator<E>  implements Iterator<E> {

  //Stack 객체에서 Iterator 규칙에 따라 값을 꺼내주는 클래스를 정의

  Stack<E> stack;

  //생성자
  public StackIterator(Stack<E> stack) {
    this.stack = stack.clone(); // 꺼내는 순간 제거되기 때문에ㅐ 복제를 해놓고 리턴
  }
  

  @Override
  public boolean hasNext() {
    return !stack.empty();

  }

  @Override
  public E next() {
    return stack.pop();

  }


}

