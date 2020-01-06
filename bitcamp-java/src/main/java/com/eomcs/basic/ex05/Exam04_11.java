package com.eomcs.basic.ex05;

//# 비트 이동 연산자 : 비트 이동의 유효범위 

public class Exam04_11 {
    public static void main(String[] args) {
      
        System.out.println(3 << 1);
        //      |00000000 00000000 00000000 00000011 = 3
        //     0|00000000 00000000 00000000 0000011x = 비트이동
        //     0|00000000 00000000 00000000 00000110 = 6
        

        System.out.println(3 << 33); //6
        System.out.println(3 << 65); //6
        System.out.println(3 << 97); //6
        
        // 3 에 대해 33비트를 이동하나, 65비트를 이동하나, 97비트를 이동하나
        // 같은 값이 나오는 이유?
        // => int 타입의 값에 대해 비트 이동을 할 때는 0~31까지만 유효하다.
        //    만약 31을 넘는 경우 32로 나눈 나머지 값을 비트 이동으로 간주한다.
        // => long 타입의 경우 비트 이동은 0~63까지 유효하다.
        //    만약 63을 넘는 경우 64로 나눈 나머지 값을 비트이동으로 간주한다.
        //
        // 비트 이동 유효 범위를 벗어난다면?
        // => int 데이터인 경우 비트 이동 값은 하위 5비트만 유효하다.
        // => long 데이터인 경우 비트 이동 값은 하위 6비트만 유효하다.
        //
        // => 공식:
        //    n << s
        //    - n이 int 타입이라면 다음 계산을 통해 s의 최종 값을 결정한다. 
        //         s & 0b11111 = 최종 비트 이동 값
        //      따라서 s의 값은 무조건 0 ~ 31 이다.
        //      결국 s의 값은 S % 32의 결과와 같다.
        //
        //    - n이 long 타입이라면 다음 계산을 통해 s의 최종 값을 결정한다.
        //         s & 0b111111 = 최종 비트 이동 값
        //      따라서 s의 값은 무조건 0 ~ 63 이다. 
        //      결국 s의 값은 s % 64의 결과와 같다. 
        
        // => 예1)
        //   3 << 33
        //   n => 00000000 00000000 00000000 00000011 = 3
        //   s => 00000000 00000000 00000000 00100001 = 33
        //   비트이동 => s & 0b11111
        //   00000000 00000000 00000000 00100001 = 33
        // & 00000000 00000000 00000000 00011111 = 마스크 효과 11111 값만 취함. 
        // -------------------------------------------
        //   00000000 00000000 00000000 00000001 = 1
        //   최종 비트 이동 값을 계산하면 다음과 같다.
        //   3 << 33 ==> 3 << 1
        
        // => 예2)
        //   3 << 65
        //   n => 00000000 00000000 00000000 00000011 = 3
        //   s => 00000000 00000000 00000000 01000001 = 65
        //   비트이동 => s & 0b111111
        //   00000000 00000000 00000000 01000001 = 65
        // & 00000000 00000000 00000000 00111111 = 마스크 효과 0은 못뚫고 1은 투과 
        // -------------------------------------------
        //   00000000 00000000 00000000 00000001 = 1
        //  최종 비트 이동 값을 계산하면 다음과 같다.
        //  3 <<65 ==> 3 << 1
        
        //비트 이동 계산의 근거: java language specification
        // If the promoted type of the left-hand operand is int, 
        // then only the five lowest-order bits 
        // of the right-hand operand are used as the shift distance. 
        // It is as if the right-hand operand were subjected
        // to a bitwise logical AND operator & (§15.22.1)
        // with the mask value 0x1f (0b11111). 
        // The shift distance actually used is therefore always 
        // in the range 0 to 31, inclusive.
        
        // If the promoted type of the left-hand operand is long, 
        // then only the six lowest-order bits 
        // of the right-hand operand are used as the shift distance. 
        // It is as if the right-hand operand were subjected 
        // to a bitwise logical AND operator & (§15.22.1) 
        // with the mask value 0x3f (0b111111). 
        // The shift distance actually used is therefore always 
        // in the range 0 to 63, inclusive.
        // https://docs.oracle.com/javase/specs/jls/se13/html/jls-15.html#jls-15.19
    
    
    }
}
