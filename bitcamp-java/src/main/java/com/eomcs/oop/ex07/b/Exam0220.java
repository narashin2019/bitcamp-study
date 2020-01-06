// 캡슐화(encapsulation) - 응용
package com.eomcs.oop.ex07.b;

import java.util.Calendar;
import com.eomcs.oop.ex07.b.sub.C;

public class Exam0220 extends C {
    
    public static void main(String[] args) {
        //Car c1 = new Car(); // 컴파일 오류!
        // 생성자가 private이기 때문에 다른 클래스에서 호출할 수 없다.
        // 따라서 인스턴스를 생성할 수 없다.
        // 
        // 그럼 왜 생성자를 private으로 만들었는가?
        // => 개발자가 직접 인스턴스를 생성하면 너무 복잡하니,
        //    다른 메서드를 통해 인스턴스를 생성하라는 의미다!
        Car c2 = Car.create("티코");
        System.out.printf("%s,%s,%d,%d\n", 
                c2.model, c2.maker, c2.cc, c2.valve);
        
        
        //Calendar obj = new Calendar(); 
        // 생성자가 protect private로 만들어져 있는 것은? 
        // 이 클래스는 내부적으로 객체생성하는 과정이 복잡하여 우리가 대신 메서드를 통해 설정했습니다.
        // 뉴로 못만듭니다.
        // 뉴로 못만들고 메서드로 만드는 것들의 숨겨진뜻: 
        // 뉴 캘린더로 해서는 생성과정이 내부적으로 복잡하여 
        // 메소드를 통해 강제셋팅을 하도록 유도하기 위해 만듬
        Calendar cal = Calendar.getInstance(); //이렇게 해라 
        //
    }
}







