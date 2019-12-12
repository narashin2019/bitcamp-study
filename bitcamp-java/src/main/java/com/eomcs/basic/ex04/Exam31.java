package com.eomcs.basic.ex04;

import jdk.tools.jlink.internal.SymLinkResourcePoolEntry;

//# 부동소수점 변수 - 변수의 메모리 크기

public class Exam31 {
  public static void main(String[] args) {
    //부동소수점 변수 - 메모리 크기    

    float f; 

    f = 3.141592f;
    System.out.println(f);

    f = 3.1415927f; //3.1415927이 출력되나 우연.
    System.out.println(f);

    f = 0.0000003141592f; //3.141592E-7출력. 소수점 이하인 경우 앞에 0 무시 7자리 유효자리수에 포함 안함
    System.out.println(f);

    f = 0.00000031415929f; //3.1415928E-7출력. 소수점 이하인 경우 앞에 0 무시 7자리
    System.out.println(f);

    f = 314159200000.0f; // 3.14159202E11출력 소수점 이상은 경우 뒤의 0을 포함해서 유효자리수 계산.  
    System.out.println(f);


    double d;

    d = 9.87654321234567;
    System.out.println(d);

    d = 98765432.1234567; //9.87654321234567E7
    System.out.println(d);

    d = 98765432123456.7; //9.87654321234567E13
    System.out.println(d);

    d = 98765432123456.78; //9.876543212345678E13 우연히도 잘나옴
    System.out.println(d);

    d = 98765432123456.74; //9.876543212345673E13 맨마지막 자리 값이 왜곡된다.
    System.out.println(d);


    // 변수와 리터럴
    f = 99999.88f;
    System.out.println(f);

    f = 99999.88777f; // 이미 리터럴이 4바이트 유효자릿수를 넘어갔다. 값이 왜곡된 상태.
    System.out.println(f);

    d = 99999.88f; // 값이 왜곡 4바이트가 8바이트로 바뀌며 왜곡
    System.out.println(d);

    d = 99999.88; // 정상출력
    System.out.println(d);


    //가능하면 부동소수점은 8바이트 double를 써야하는 이유 
    //계산을하는거라면수가작아도무조건더블
    float f1 = 99988.88f;
    float f2 = 11.11111f;
    System.out.println(f1);
    System.out.println(f2);
    float f3 = f1 + f2 
    System.out.println(f3); 
    // 99999.99111 값은 7자리수로 잘려서 출력
    // 각각은 유효자리수 내 라도 연산하면 넘어가는 상황많아 따라서 더블로.
    // f+f=f 이미 결과에서 값이 왜곡된다.
    // 처음부터 double로 해야 값이 왜곡될 가능성이 적다.
    double d1 = 99988.88;
    double d2 = 11.11111;
    System.out.println(d1);
    System.out.println(d2);
    double d3 = d1 + d2 
    System.out.println(d3);
    
    f1 = 3.141592f;
    d1 = f1; // 컴파일ok 단 값은 왜곡될 수 있다.**정수와 다른점 이유는 IEEE754때문임
    System.out.println(d1);

    f1 = d1; // 컴파일 오류
    System.out.println(f1);


  }
}

// 리터럴을 사용할 때 4바이트 리터럴은 7자리 안넘어가게 
// 8바이트 리터럴은 15자리 안넘어가게하라.
// 4바이트 메모리에 저장할 때는 4바이트 리터럴 사용
// 8바이트 메모리에 저장할 때는 8바이트 리터럴 사용
//cf. 정수는 작은 값을 큰 데 넣어도 괜찮음