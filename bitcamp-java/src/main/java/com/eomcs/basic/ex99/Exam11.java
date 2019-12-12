package com.eomcs.basic.ex99;

//# 콘솔로 출력하기

public class Exam11 {
  public static void main(String[] args) {
    
    // 값 출력하기
    // println() 사용법
    // => 출력 + 줄바꿈
    //시스템이라는 상자안에 아웃이라는 도구가 들었는데 아웃도구가 할 수 있는 기능중에 하나가 프린트 엘엔
    System.out.println(100); 
    System.out.println(3.14);
    System.out.println(true);
    System.out.println('가');
    System.out.println("안녕");

    //값이 없으면 그냥 줄만 바꿈
    System.out.println();

    // print() 사용법
    // => 출력
    System.out.print(100); 
    System.out.print(3.14);
    System.out.print(true);
    System.out.print('가');
    System.out.print("안녕");
    
    //이스케이프 문자를 통해 줄바꿈을 수행한다.(앞에 써도 됨)
    System.out.print('\n');

    System.out.print("OK!\n");
    System.out.print("NO!");
    
    // printf() 사용법
    // => printf("형식", 값1, 값2, ...);
    //형식을 지정하지 않으면 print()와 같다. 
    System.out.printf("\nHello!\n");
    System.out.printf("\n이름: %s", "신나라"); //값이 들어갈 위치에 %s문자., %d 숫자
    System.out.printf("\n나이: %d", 20);

    System.out.printf("\n이름(나이): %s(%d)", "신나라", 20);

    // 정수 삽입
    // %d : decimal
    // %x : hexadecimal
    // %c : character
    System.out.printf("\n %d, %x, %c", 65, 65, 65);

    // 삽입될 값 지정하기**
    // 한 개의 값을 여러 곳에 삽입할 수 있다.
    // => %값위치$d
    // %[n$]s : n은 문자열에 삽입될 값의 순서이다. 순서는 1부터 증가한다.
    // 1$ => 65, 2$ => 66, 3$ => 67
    System.out.printf("%2$d %2$x %2$c\n", 65, 66, 67);
    System.out.printf("\n %1$d, %1$x, %1$c", 65); 
    

    // 논리값 삽입
    // %b : true/false 값을 문자열로 만들어 삽입한다.
    System.out.printf("\n재직자: %s, %b", true, true); //%s는 다됨. 문자열로 나옴


    // 출력할 공간 확보
    // 값을 삽입할 때 사용할 공간을 지정할 수 있다.
    // 문자열을 삽입할 때: 
    //   %[-][사용할공간너비]s : -는 왼쪽 정렬이다. 안 붙이면 기본 오른쪽 정렬이다.
    System.out.printf("\n이름: [%s]", "홍길동"); //공간 확보안하면 텍스트길이만큼만 우측정렬
    System.out.printf("\n이름: [%20s]", "홍길동"); //우측정렬
    System.out.printf("\n이름: [%-20s]", "홍길동"); //좌측정렬
    // 정수를 삽입할 때:
    //   %[0][사용할공간너비]d : 앞의 빈자리는 0으로 채운다.
    //   %[+][0][사용할공간너비]d : +는 숫자 앞에 부호를 붙인다.
    System.out.printf("\n숫자: [%d]", 12345); 
    System.out.printf("\n숫자: [%10d]", 12345); 
    System.out.printf("\n숫자: [%-10d]", 12345); 
    System.out.printf("\n숫자: [%010d]", 12345); //10자리중빈자리0으로채워짐
    System.out.printf("\n숫자: [%+010d], [%+010d]", 12345, -12345); // 숫자: [+000012345], [-000012345]



    // 일시 다루기

    // 현재 날짜 및 시각 정보를 생성한다.
    // java.lang 패키지의 멤버를 사용할 때는 그냥 이름을 지정하면 된다.
    // 그 외 다른 패키지의 멤버를 사용할 때는 반드시 패키지 이름을 함께 지정해야 한다.
    java.util.Date today = new java.util.Date(); 
    today.setDate(9); //앞으로 없어질 명령어 그러나 자바는 상위버전은 하위버전 호환되게 만들것

    System.out.printf("\n%s", today); // Thu Dec 12 12:04:02 KST 2019 출력
    
    // 날짜 객체에서 년, 월, 일, 시, 분, 초, 요일 추출하기
    System.out.printf("\n%tY", today); //년도 추출 / 2019 / Y= 4자리 연도
    System.out.printf("\n%ty", today); //년도 추출 / 19 / y=뒤 두자리 연도
    System.out.printf("\n%tb", today); //월 추출 / 12월 /영문에서는 B=풀네임 b=DEC 
    System.out.printf("\n%tm", today); //월 추출 / 12 숫자만 출력
    System.out.printf("\n%td, %te", today, today); //일 추출 / 09, 9
    System.out.printf("\n%tA, %ta", today, today); //요일 추출 
    System.out.printf("\n%tH, %tI", today, today); //시각 추출 
    System.out.printf("\n%tM", today); //분 추출 
    System.out.printf("\n%tS, %tL, %tN", today, today, today); //초, 밀리초, 나노초 추출 
    System.out.printf("\n%tp, %Tp", today, today); //오전 오후 추출 (pm, PM추출)

    //2019-12-12 12:37:45 출력해봐라
    System.out.printf("\n%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS", today);


    String str;
    str = String.format("\n%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS", today);
    System.out.println(str);


  }
}

