package com.eomcs.oop.ex05.test;

public class Sedan extends Car{
  
  public boolean sunroof;
  public boolean auto;
  
  public Sedan() {}
  
  public Sedan(String model, String maker, int capacity,
      boolean sunroof, boolean auto) {
    
      super(model, maker, capacity); // super=상위, 부모 클래스
      
      this.sunroof = sunroof;
      this.auto = auto;
  
  }
  
  
}

//부모클래스에 capacity를 사이즈로 바꿔도 영향 안받는다고????????????????/
// 부모클래스를 손대지 않고 자식클래스에 사용하는 것.
// 기존클래스 Car = 부모클래스 상위super클래스 / Sedan=자식클래스 하위클래스sub클래스 //