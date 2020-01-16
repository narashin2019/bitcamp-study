package com.eomcs.util;

public class QueueIterator<E>  implements Iterator<E> {

  //Queue객체에서 Iterator 규칙에 따라 값을 꺼내주는 클래스를 정의

  Queue<E> queue;

  //생성자
  public QueueIterator(Queue<E> queue) {
    this.queue = queue.clone(); // 꺼내는 순간 제거되기 때문에ㅐ 복제를 해놓고 리턴
  }
  

  @Override
  public boolean hasNext() {
    return queue.size() > 0;

  }

  @Override
  public E next() {
    return queue.poll();

  }


}

