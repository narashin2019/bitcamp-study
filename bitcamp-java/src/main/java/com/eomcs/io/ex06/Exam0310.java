// BufferedInputStream 사용 후 - 데이터 읽는데 걸린 시간 측정
package com.eomcs.io.ex06;

public class Exam0310 {

  public static void main(String[] args) throws Exception {
    BufferedInputStream in = new BufferedInputStream("temp/jls11.pdf");

    int b;

    long startTime = System.currentTimeMillis(); // 밀리초

    int callCount = 0;
    while ((b = in.read()) != -1)
      callCount++; // 파일을 끝까지 읽는다.

    long endTime = System.currentTimeMillis();

    System.out.println(endTime - startTime);
    System.out.println(callCount);

    in.close();
  }

}

// while ((b = in.read()) 0110과의 차이:
// 겉 문장은 같지만(1바이트씩읽음) 실제로0310은 8192만큼 한번에 퍼와서 읽음
