package com.eomcs.basic.ex04;

//# 배열 

public class Exam61 {
  public static void main(String[] args) {
    // 배열 사용 전
    int kor, eng, math, soc, mus;

    // 배열 사용 후
    int[] score = new int[5]; // OK!
    int score2[] = new int[5]; // OK! C-style. 하지마

    //배열에 값을 저장하는 방법
    score[0] = 100;
    score[1] = 90;
    score[2] = 80;
    score[3] = 70;
    score[0] = 60;

    //*컴파일할 때 발생하는 에러: 그나마 다행 / 실행시 발생하는 에러: 런타임 에러 
    //score[-1] = 100; // 컴파일시에러x 실행시에러뜸. runtime error!
    //score[5] = 100; // runtime error!

    // 배열 레퍼런스(배열의주소담고있는변수)와 인스턴스(값을 저장하는 메모리)를 따로 선언
    int[] arr1 = null; //null=> 주소가0, 의미는 메모리를 가리키지 않음. null안쓰면 error: variable arr1 might not have been initialized
    
    //arr1[0] = 100; // runtime error! 주소가 없다는 에러, java.lang.NullPointerException
    

    //배열 인스턴트 생성
    arr1 = new int[5];
    arr1[0] = 100; // OK! 0=index
    arr1[1] = 100; // OK!

    // 배열 사용
    System.out.println(arr1[0]); //100출력
    System.out.println(arr1[1]); //100출력

    int[] arr2;

    // 배열 레퍼런스는 배열 인스턴스의 주소를 담는다.
    arr2 = arr1; // arr1에 저장된 배열 인스턴스의 주소를 담는다.

    System.out.println(arr1[0]); //100출력
    arr2[0] = 300;
    System.out.println(arr1[0]); //300출력

    // 배열 인스턴스의 각 항목은 생성되는 순간 기본 값으로 자동 초기화 된다.
    // b s i l 배열 : 0 
    // f d : 0.0
    // boolean배열 : false
    // char 배열 ; \u0000
    //cf. 로컬변수에 값을 초기화시키지 않으면 에러뜸
    System.out.println(arr1[2]); // 0출력

    
    int[] arr3 = new int[3];
    arr3[0] = 30;

    arr2 = arr3;
    System.out.println(arr2[0]); // 30출력

    arr1 = arr2;
    System.out.println(arr1[0]); // 30출력

    // 그럼 arr1에 저장되었던 기존 배열 인스턴스에는 
    // 어떻게 접근하는가?
    // => 처음 생성했던 배열 인스턴스의 주소를 갖고 있는
    //    레퍼런스가 없기 때문에 접근할 수 없다.
    // => 이렇게 주소를 잃어버려 접근할 수 없는 메모리를
    //    "가비지(garbage)"라고 부른다.
    // => 가비지는 JVM 실행 중에 메모리가 부족할 때
    //    "가비지 수집기(garbage collector)"에 의해 
    //    메모리에서 해제된다.
    //    물론 JVM을 종료하면 당연히 JVM이 사용하던
    //    모든 메모리를 OS에 반납되기 때문에 
    //    가비지 또한 반납될 것이다.
    //    
    // => 전산학에서는 "가비지"를 "dangling object"라고 부른다.

    // 가비지 동작
    // 1) 메모리가 부족할 때
    // 2) CPU가 한가할 때
    



    // 배열 인스턴스 생성과 동시에 값 초기화 시키기
    int[] arr4 =new int[3];
    arr4[0] =100;
    arr4[1] = 90;
    arr4[3] = 80;
    
    // 초기화 시키는 값 개수 만큼 배열 항목이 생성된다.
    int[] arr5 = new int[] {100, 90, 80};

    // 인스턴스 생성과 동시에 값을 지정할떄는 
    // 배열 개수를 지정하면 안된다.
    //int[] arr6 = new int[3] {100, 90, 80}; // 컴파일오류

    // 배열 선언과 동시에 인스턴스를 초기화 시킬 때는
    // new int[]를 생략할 수 있다.
    int[] arr7 = {100, 90, 80}; // 많이씀

    // 레퍼런스를 생성한 다음에 값을 초기화 시킬 때는 
    // new int[]를 생략할 수 없다.
    int[] arr8;
    //arr8 = {100, 90, 80}]; // 컴파일 오류
    arr8 = new int[] {100, 90, 80};



    // 프리머타입 배열얘기만 한 것.
    
  }
}


