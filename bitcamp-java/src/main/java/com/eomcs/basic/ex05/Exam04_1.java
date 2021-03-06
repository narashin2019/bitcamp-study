package com.eomcs.basic.ex05;

//# 비트 이동 연산자 : >>, >>>, << 

public class Exam04_1 {
    public static void main(String[] args) {
        // << 비트 이동 연산자 사용법
        //
        // 오른 쪽 빈자리 : 0으로 채운다.
        // 왼쪽 경계를 넘어간 비트 : 짜른다.
      
        int i = 1;
        //       00000000 00000000 00000000 00000001 = 1 (32비트 10진수 1)
        
        System.out.println(i << 1);
        //     0|00000000 00000000 00000000 0000001x
        //      |00000000 00000000 00000000 00000010 = 2
        
        System.out.println(i << 2);
        //    00|00000000 00000000 00000000 000001xx
        //      |00000000 00000000 00000000 00000100 = 4
        
        System.out.println(i << 3);
        //   000|00000000 00000000 00000000 00001xxx
        //      |00000000 00000000 00000000 00001000 = 8
        
        System.out.println(i << 4);
        //  0000|00000000 00000000 00000000 0001xxxx
        //      |00000000 00000000 00000000 00010000 = 16
        

        i = 0b0000_1011; // 11 (8비트)
        System.out.println(i << 1); // 00010110 => 22 / 2**1곱함
        System.out.println(i << 2); // 00101100 => 44 / 2**2곱함
        System.out.println(i << 3); // 01011000 => 88 / 2**3곱함
    }
}

// 왼쪽 이동
// - 1비트 이동은 곱하기 2 한 것과 같은 효과를 준다.
// - 값을 배수로 증가시킬 때 곱하기 연산을 하는 것보다 비트 이동 연산을 하는 것이 빠르기 때문에
//   실무에서는 이 비트 이동 연산을 자주 사용한다.

// 10년차 넘어갈때까지 곱하기 써. 분위기봐가면서 써.