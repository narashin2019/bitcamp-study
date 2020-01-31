package com.eomcs.design_pattern.observer.after.h;

import java.util.ArrayList;
import java.util.List;

public class Car {


  // 관찰자의 객체 주소를 보관한다.
  List<CarObserver> observers = new ArrayList<>();


  // 자동차의 상태 변경을 보고받을 관찰자(Observer)를 등록한다.
  public void addCarObserver(CarObserver observer) {
    observers.add(observer);
  }

  // 자동차의 상태 변경을 보고받는 관찰가를 제거한다.
  public void removeCarObserver(CarObserver observer) {
    observers.remove(observer);
  }



  private void notifyObserversOnStarted() { // 메소드 이름만으로 코드가 무엇인지 알아볼 수 있어서 주석이 필요 없음. 주석이 있으면 리팩토링
                                            // 대상 // 내부 유지보수용이라 private
    for (CarObserver observer : observers) {
      observer.carStarted();
    }
  }


  private void notifyObserversOnStopped() {
    for (CarObserver observer : observers) {
      observer.carStopped();
    }
  }


  public void start() {
    System.out.println("시동을 건다.");

    notifyObserversOnStarted();
  }



  public void run() {
    System.out.println("달린다.");
  }


  public void stop() {
    System.out.println("시동을 끈다.");

    notifyObserversOnStopped();
  }

}


