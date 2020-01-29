package com.eomcs.io.ex06;

import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream extends FileOutputStream {
  byte[] buf = new byte[8192];
  int cursor;

  public BufferedOutputStream(String filename) throws Exception {
    super(filename);
  }

  @Override
  public void write(int b) throws IOException {
    if (cursor == buf.length) { // 버퍼가 다차면
      this.write(buf); // 버퍼에 들어있는 데이터를 한 번에 출력한다.
      cursor = 0; // 다시 커서를 초기화시킨다.
    }

    // 1바이트 출력하라고 하면 일단 버퍼에 저장할 것이다.
    buf[cursor++] = (byte) b;
  }


  @Override
  public void close() throws IOException {
    this.flush();
    super.close();
  }

  @Override
  public void flush() throws IOException {// 배열에 남아있는 것 방출해야함.
    if (cursor > 0) {
      this.write(buf, 0, cursor);
      cursor = 0;
    }
  }

}

// 데이터 주는대로 버퍼는 쌓아간다.
// 버퍼가 꽉차면 8192 더이상 공간이 없으면 배열을 한번에 write
// 버퍼트 아웃풋스트림의 자체 버퍼가 있다 8192바이트 크기의.
// 커서가 0을 가리킴
// 누군가 write()호출 0번방 채움 커서는 +1증가 커서와 방번호 8192가 같아지면
// 왕창 파일에 buf write함
// flush() 주석처리하면 0320에서 pdf파일이 깨진다. 파일크기가 작아졌넹? 뭐징
// => 버퍼가 8192바이트고 파일이 8292라고 생각해봐.
// 8192버퍼가 꽉차면 1번 write/ 나머지 100을 읽어와서 buf배열에 저장하는데
// 배열이 꽉차지 않아서 파일에 write가 안된 것!!
// -> if (cursor > 0) 따라서 배열이 꽉차지 않았으나
// (커서가 0보다 크다. 0이 아니다.배열에뭔가 있다! 방출하면 0로 세팅되었을것),
// 뭔가 차있다면 flush해야 완전하게 다 write되는 것!
// this.write(buf, 0, cursor); 0번 방부터 커서까지 롸이트

// close() 는 누가 깜빡하고 flush()까먹어도 호출되도록 만든 메서드!

