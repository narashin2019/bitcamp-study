package com.eomcs.oop.ex02.study;

public class Test03 {

  public static void main(String[] args) {
    //인스턴스 필드는 new로 메모리 생성. 여러 개 만들수 있음. 그 주소를 담을 변수 필요 c1, c2 c3는 레퍼런스.
    Car c1 = new Car();
    Car c2 =new Car();
    
    //인스턴스 접근법. c1이 가리키는 식판에 네임 그릇에 붕붕을 넣는다.
    c1.name = "봉봉"; 
    c1.type = 1;
    c1.color = "빨강";
    c1.speed = 0;
    c1.energy = 100;
    c1.power = 200;
        
        
    c2.name = "호호";
    c2.type = 2;
    c2.color = "검정";
    c2.speed = 0;
    c2.energy = 100;
    c2.power = 300;
    //cf) int i = new int 할필요 없음,
    
//    Car.speedUp(c1); // static이 붙은 speedUp이 스태틱붙어서 클래스명으로 접근. Car.speedup(c1)
//    Car.speedUp(c1);
//    Car.speedUp(c2);
    
    c1.speedUp(); // 인스턴스 메서드는 이렇게 쓴다. 앞에 인스턴스 레퍼런스 넣음
    c1.speedUp();
    c2.speedUp();
    
//    Car c3 = null; //(주소가 없는 상태)
//    c3.speedUp(); //java.lang.NullPointerException 주소도 없이 호출하냐!
    
    System.out.printf("c1의 속도: %d\n", c1.speed);
    System.out.printf("c2의 속도: %d\n", c2.speed);
    
    
    //System.out.printf("c1 vs c2 의 힘: %d\n", Car.comparePower(c1, c2)); // 스태틱일때 
    System.out.printf("c1 vs c2 의 힘: %d\n", c1.comparePower(c2)); // 인스턴스 일때
  
  
  }
}


//클래스에 사용자정의 데이터타입을 인스턴스 필드로 설계해 메모리 구조 만들고 + 그 데이터를 다루는 연산자는 인스턴스 메서드로 설계한다.++
