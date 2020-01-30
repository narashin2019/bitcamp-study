// 버퍼 사용 후 - 데이터 읽는데 걸린 시간 측정
package com.eomcs.io.ex06;

import java.io.FileInputStream;

public class Exam0120 {

  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/jls11.pdf");

    byte[] buf = new byte[8192]; // 보통 8KB 정도 메모리를 준비한다.(범용)
    int len = 0;

    long startTime = System.currentTimeMillis(); // 밀리초

    int callCount = 0;
    while ((len = in.read(buf)) != -1) {
      callCount++; // 파일을 끝까지 읽는다.
    }

    long endTime = System.currentTimeMillis();

    System.out.println(endTime - startTime);
    System.out.println(callCount);
    in.close();
  }

}

// 1000000백만바이트=100메가 하면 4번 호출!!!!
// 무조건 배열 용량을 늘려 read() 1번호출 한다고 시간이 무한정 줄어들지 않음 = 헤드이동시간 기본값이 있음.

// 상용, 돈받고 프로그램을 짤 때 버퍼 쓰는게 필수. -> 속도 때문에.
