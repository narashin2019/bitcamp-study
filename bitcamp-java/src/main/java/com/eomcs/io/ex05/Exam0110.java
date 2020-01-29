// 객체 출력 - 인스턴스의 값을 출력
package com.eomcs.io.ex05;

import java.io.FileOutputStream;

public class Exam0110 {

  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/test4.data");

    Member member = new Member();

    member.name = "AB가각간";
    member.age = 27;
    member.gender = true;

    // 인스턴스의 값을 출력하라!
    // 1) 이름 출력
    byte[] bytes = member.name.getBytes("UTF-8");
    out.write(bytes.length); // 1 바이트
    out.write(bytes); // 문자열 바이트

    // 2) 나이 출력 (4바이트)
    out.write(member.age >> 24);
    out.write(member.age >> 16);
    out.write(member.age >> 8);
    out.write(member.age);

    // 3) 성별 출력 (1바이트)
    if (member.gender)
      out.write(1);
    else
      out.write(0);

    out.close();

    System.out.println("데이터 출력 완료!");

  }

}

// 바이트 단위로 출력하라 = 바이너리 데이터로 출력하라
// 데이터에 어디부터 어디까지가 문자열인지, 정수값인지 등등 알려줘야함.
// 바이너리 데이터를 읽는 쪽에서 이름을 몇바이트인지 알수없어서
// 기계어로 지금부터 이름정보(마커)를 10바이트(크기)만큼 쓴다고 write.
// 바이너리 형식은 간결하다! 장점
// (write)출력한 형식 그대로 읽어야 한다.
// 모든 언어가 다 좋아하는 게 문자열. 비록 사이즈가 커지고 속도가 느려질지라도 = xml, json
// 이름의길이0B = 그다음 11바이트 + 4바이트 1B나이 + 1바이트 01 남성
