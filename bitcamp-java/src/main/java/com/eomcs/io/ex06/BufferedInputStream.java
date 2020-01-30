package com.eomcs.io.ex06;

import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStream extends FileInputStream {
  byte[] buf = new byte[8192]; // 바구니 크기는 8192 계속 재사용
  int size; // 배열에 저장되어 있는 바이트의 수
  int cursor; // 바이트 읽은 배열의 위치

  public BufferedInputStream(String filename) throws Exception {
    super(filename);// 8292라 치자
  }

  @Override
  public int read() throws IOException {
    if (cursor == size) { // 버퍼에 저장되어 있는 데이터를 모두 읽었다는 의미
                          // 같지 않으면 읽을 게 더 있다는 의미
                          // 같지 않으면 return문 계속 실행
      if ((size = super.read(buf)) == -1) { // buf8192바구니로 남은바 이트 퍼와서 읽으려 했는데 퍼올 데이터가 없으면(파일끝에 도달하면) -1리턴.
        return -1;
      }
      /*
      if (true) {
      size = super.read(buf);
      if (size == -1) {
      return -1
      }
      */
      
      cursor = 0;
    }
    return buf[cursor++] & 0x000000ff; // int값으로 리턴하는 이유. 선언부가 int리턴한다고 되어 있음.
                                       // 한번에 바이트배열에 꺼낸다음에 읽을때는
                                       // 이거 꼭 주의해라. 이해안감.
  }

  // read(buf)는 8192배열에서 몇 개가 차 있는지 값을 리턴한다. (몇 개를 퍼왔는 지)
  // 8191번방까지 읽어서 값을 리턴하면 커서는 ++해서 8192가 된다. 
  // 사이즈와 커서가 같아져서 안쪽 조건문이 실행된다. 
  // 이때 read(buf)는 다시 호출되는데 남은 200개 값을 리턴한다 (퍼온다).
  // 0번방부터 다시 읽는다.
  // 끝까지 읽어서 사이즈와 커서가 같아진다.
  // read()다시 호출되어서 데이터 퍼오려고 8191바구니를 들고 갔는데 퍼올게 없다 (파일끝에 도달했다) => -1리턴

  @Override
  public int read(byte[] buf) throws IOException {
    int i = 0;
    for (; i < buf.length; i++) {
      // 파일에서 1바이트를 읽어서 파라미터로 받은 바이트배열에 채운다.
      int b = this.read();
      if (b == -1) {
        // 바이트 배열을 다 채우기도 전에 읽을 데이터가 없다면 읽기를 멈춘다(반복중지)
        break;
      }
      buf[i] = (byte) b; // 읽은 걸 바이트 배열에 담는다
    }
    return i; // 지금까지 읽은 데이터의 수를 리턴한다.
  }



}


