package com.eomcs.basic.ex04;

//형변환 : 정수 변수 ==> 부동소수점 변수
public class Exam91 {

  public static void main(String[] args) {

    byte b = 100;
    short s = 200;
    int i = 18_3456_6789;
    long l = 344_9876_9998_7654_3219L;
    
    // 메모리 크기에 상관없이 정수 변수의 값을 부동소수점 변수에 넣을 때
    // 컴파일 오류가 발생하지 않는다.
    // 단 실행할 때 유효자릿수가 넘어가면 값이 짤릴 수 있다.
    float f;
    f = b;
    System.out.println(f); //100.0
    f = s;
    System.out.println(f); //200.0
    f = i;
    System.out.println(f); //1.83456678E9
    f = l;
    System.out.println(f); //3.44987689E18
    // float에 유효자릿수 7자리 이상 숫자 들어갈 순 있으나 정상적으로 안들어갈 뿐. 
    // 잘린다거나.. 그래서 에러 안뜸
    // float는 지수부8비트 가수부23비트(정수부분)
    // long 값을 float에 넣을 때는 컴파일 오류 안떠도 안심할 수 없다. 값이 반올림, 짤렸을 가능성 있다.
    // int 10자리까지 가능하기 때문에 float 유효자릿수 7자리 넘어서 값이 잘릴 가능성 크다
    
    
    double d;
    d = b;
    System.out.println(d); //100.0
    d = s;
    System.out.println(d); //200.0
    d = i;
    System.out.println(d); //1.834566789E9
    d = l;
    System.out.println(d); //3.449876999876543E18
    // int +_20억이라 10자리니까 더블에 넣으면 유효자릿수15자리라서 갠찮
    // long은 15자리 넘어갈 수 있음 19자리넣으니 값이 짤림. 그러나 에러 안뜸.
    
    //정수를 부동소수점에 넣을 때 컴파일 에러 안나도 값이 잘릴 수 있다.
    
  }
  
}


