package com.eomcs.basic.ex06;

//# 흐름 제어문 - for 반복문과 배열 궁합이 잘맞다.
//
public class Exam4_3 {
  public static void main(String[] args) {
    /*
     1)
        String[] names = new String[5]; //문자열 담을 메모리 5개 만들고(우항) 리모콘names으로 사용한다. names(리모콘) 실제로는 배열의 주소를 갖고 있다. 레퍼런스
        names[0] = "홍길동";
        names[1] = "임꺽정";
        names[2] = "유관순";
        names[3] = "윤봉길";
        names[4] = "안중근";
    
     2), 3)
        String[] names = 
            new String[] {"홍길동", "임꺽정", "유관순", "윤봉길", "안중근"}; // new String[] 생략가능
     */

    
    String[] names = {"홍길동", "임꺽정", "유관순", "윤봉길", "안중근"};
    // int i = 0에서 숫자 바꾸면 원하는 인덱스부터 출력가능
    for (int i = 0; i < names.length; i++) //i는 index의 약자/리모콘에 length버튼 누르면 names.length 배열의 길이 값 5  리턴
      System.out.println(names[i]);

    
    System.out.println("----------------------");

    // 배열의 "처음부터 끝까지" 값을 꺼내는 것이라면 
    // 다음의 for 문법을 사용하라! 아주 편하다!
    // for (배열에서 꺼낸 값을 저장할 변수 선언-타입스트링 이름name : 배열주소-리모콘 names) 문장;
    for (String name : names) 
      System.out.println(name);

    // 위의 방식으로 for 문을 사용할 경우
    // 변수 선언을 바깥에 둘 수 없다. 
    // 밑에 방식 안 됨.
    /*
        String name2;
        for (name2 : names) // 컴파일 오류!
            System.out.println(name2);
     */
  }
}
