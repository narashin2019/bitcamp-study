// 데이터 출력 - int 값 출력
package com.eomcs.io.ex04;

import java.io.FileOutputStream;

public class Exam0110 {

  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/test3.data");

    int money = 1_3456_7890; // = 0x080557d2

    out.write(money); // 항상 출력할 때는 맨 끝 1바이트만 출력한다.
    // 4바이트 중에 1바이트. 자바 기본이 int 4바이트라서..

    out.close();

    System.out.println("데이터 출력(out에 write) 완료!");

  }

}


// ****실제로는 4바이트 단위로int 읽고 쓰지만 (C언어처럼)
// 우리는 데이터를 1바이트씩 읽고 쓴다.
