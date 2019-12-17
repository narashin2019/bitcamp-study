package com.eomcs.basic.ex05;

//# 할당 연산자  : +=  -=  *=  /=  %=  &=  |=  ^=  <<=  >>=  >>>=

public class Exam07_1 {
    public static void main(String[] args) {
        int i = 2;
        
        //i = i + 20;
        i += 20; // += 연산자를 사용하면 위의 코드를 축약할 수 있다.
        System.out.println(i);

        i = 2;
        i *= 5; // 기존값2에다 5를 곱하고 그걸 다시 i로
        System.out.println(i);
        
        //헷갈리지마 
        // == : 비교연산자
        // != : 
    }
}
