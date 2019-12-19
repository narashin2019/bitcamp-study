package com.eomcs.oop.test;

// gym 회원 정보를 입력 받아 출력
public class Test12 {

  public static void main(String[] args) {

    class Member {
      int no;
      String name;
      int birthYear;
      char gender;
      float height;
      float weight;
      boolean personalTraning;
    }
    
    // 인스턴스를 3000개 만들 것이다. 
    // 레퍼런스를 3000개 준비하라!
    
    // 다음과 같이 일반적인 방식으로 레퍼런스를 선언하면
    // 너무 길어져서 코딩할 수 없다.
    /*
    Member m0, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10,
      m11, m12, m13, m14, m15, m16, m17;
    */
    // 인스턴스 3000개를 준비하는게 문제가 아니라 인스턴스 주소 3000개를 담을 레퍼런스가 3000개 필요. 
    // 각각 뉴 멤버해서 인스턴스 만들고 각각 레퍼런스 변수에 넣어야해

    //이런 상황에서 배열을 사용하면 쉽게 해결할 수 있다.
    // 즉 배열을 이용하면 많은 레퍼런스 변수를 손쉽게 만들 수 있다.
    
    // 레퍼런스 배열의 주소도 또한 레퍼런스 변수에 담아야 한다.
    Member[] arr = new Member[3000];
    //주의!
    // => Member 인스턴스 주소를 담을 레퍼런스 변수를 3000개 만든다.
    // => Member 인스턴스 3000개 만드는 것이 아니다!!!!!!!!!!!!!
    
    //arr[0].no = 100; //컴파일오류 안뜨는데 런타임 오류 arr[0]의 주소가 없는데 어디서 no를 찾나요?  java.lang.NullPointerException
    
    int count = 0;
    while (count < 3000) {
      arr[count] = new Member(); //new Member()생성자를 만드는 거, 3000개 식판만들기는 이걸로
      count++;
    }
    
    arr[0].no = 100;
    
    System.out.println(arr[0].no);
    System.out.println("OK!");
    
    // 강사님!! 인스턴스를 3000개 만드는 방법은 없나요?
    // => 없다!!
    // 멤버 레퍼런스를 3000개 만든거!! 멤버 인스턴트를 3000개 만든거 아님.
  }
}




// 레퍼런스 배열
//new Member[5]; // 인스턴스를 생성한 후 그 주소를 반드시 저장해야 한다. 에러뜸

// 배열 주소를 저장할 변수 선언
// => 배열의 주소를 저장하는 변수도 "레퍼런스"라 부른다.
//
//Member[] arr;

// 레퍼런스 배열을 선언한다.
// 즉 레퍼런스 배열은 다음과 같다.
// Member m0, m1, m2, m3, m4;
//
//arr = new Member[5];