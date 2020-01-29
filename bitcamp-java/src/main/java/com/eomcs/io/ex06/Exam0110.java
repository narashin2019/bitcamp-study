// 버퍼 사용 전 - 데이터 읽는데 걸린 시간 측정
package com.eomcs.io.ex06;

import java.io.FileInputStream;

public class Exam0110 {

  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/jls11.pdf");

    int b;

    long startTime = System.currentTimeMillis(); // 밀리초

    int callCount = 0;
    while ((b = in.read()) != -1) { // b변수와 -1 비교
      callCount++; // 파일을 끝까지 읽는다.
    }

    // in.read()메서드보면 파일을 끝까지 읽으면 -1을 리턴한다고 되어 있음.
    // while (true) {
    // b = in.read();
    // if (b = -1) {
    // break;
    // }
    // callCount++;
    // }

    long endTime = System.currentTimeMillis();

    System.out.println(endTime - startTime);
    System.out.println(callCount);

    in.close();
  }

}
