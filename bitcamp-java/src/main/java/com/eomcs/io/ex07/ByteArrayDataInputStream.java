package com.eomcs.io.ex07;

import java.io.ByteArrayInputStream;

public class ByteArrayDataInputStream extends ByteArrayInputStream {

  public ByteArrayDataInputStream(byte[] buf) {
    super(buf);
  }

  public String readUTF() throws Exception {
    // 상속 받은 read() 메서드를 사용하여 문자열 출력
    int size = this.read();
    byte[] bytes = new byte[size];
    this.read(bytes); // 배열 개수 만큼 바이트를 읽어 배열에 저장한다.
    return new String(bytes, "UTF-8");
  }
  // 첫번째1바이트읽어, 문자열이 몇바이트로 되어 있는지 문자열 바이트 개수를 알아낸 후 int size = this.read();
  // 그 개수만큼 바이트 배열을 만들고
  // 그 배열에 문자열 데이터를 저장하고
  // 그 바이트 배열에 저장된 문자열데이터로 스트링 객체를 만든다.

  public int readInt() throws Exception {
    // 상속 받은 read() 메서드를 사용하여 int 값 출력
    int value = 0;

    value = this.read() << 24;
    value += this.read() << 16;
    value += this.read() << 8;
    value += this.read();
    return value;
  }

  public long readLong() throws Exception {
    // 상속 받은 read() 메서드를 사용하여 long 값 출력
    long value = 0;
    value += (long) this.read() << 56;
    value += (long) this.read() << 48;
    value += (long) this.read() << 40;
    value += (long) this.read() << 32;
    value += (long) this.read() << 24;
    value += (long) this.read() << 16;
    value += (long) this.read() << 8;
    value += this.read();
    return value;
  }

  public boolean readBoolean() throws Exception {
    // 상속 받은 read() 메서드를 사용하여 boolean 값 출력
    if (this.read() == 1)
      return true;
    else
      return false;
  }

}
