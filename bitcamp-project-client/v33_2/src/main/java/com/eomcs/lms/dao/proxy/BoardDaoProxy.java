
package com.eomcs.lms.dao.proxy;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
// BoardDao를 구현하는 작업 객체를 대행할 프록시를 정의한다.
// 프록시 객체는 항상 작업 객체와 동일한 인터페이스를 구현해야 한다.
// 마치 자신이 작업 객체인 양 보이기 위함이다.
// 프록시는 자기가 일하지 않고 서버에게 역할을 지시한다.
import java.util.List;
import com.eomcs.lms.dao.BoardDao;
import com.eomcs.lms.domain.Board;

public class BoardDaoProxy implements BoardDao {

  String host;
  int port;

  public BoardDaoProxy(String host, int port) {
    this.host = host;
    this.port = port;
  }

  // Client의 BoardAddCommand.execute()를 이동
  @Override
  public int insert(Board board) throws Exception {

    try (Socket socket = new Socket(host, port);
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream())) {
      out.writeUTF("/board/add");
      out.writeObject(board);
      out.flush();

      String response = in.readUTF();
      if (response.equals("FAIL")) {
        // 저장 실패시 0을 return하는 방법 대신 예외를 던지고 이유를 전달하도록 함
        throw new Exception(in.readUTF());
      }

      return 1; // 저장됨
    }
  }

  // Client의 BoardListCommand.execute()를 이동
  @SuppressWarnings("unchecked")
  @Override
  public List<Board> findAll() throws Exception {
    try (Socket socket = new Socket(host, port);
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream())) {
      out.writeUTF("/board/list");
      out.flush();

      String response = in.readUTF();
      if (response.equals("FAIL")) {
        // 저장 실패시 0을 return하는 방법 대신 예외를 던지고 이유를 전달하도록 함
        throw new Exception(in.readUTF());
      }

      return (List<Board>) in.readObject();
    }
  }

  // Client의 BoardDetailCommand.execute()를 이동
  @Override
  public Board findByNo(int no) throws Exception {
    try (Socket socket = new Socket(host, port);
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream())) {
      out.writeUTF("/board/detail");
      out.writeInt(no); // 번호를 파라미터로 받아옴
      out.flush();

      String response = in.readUTF();
      if (response.equals("FAIL")) {
        // 저장 실패시 0을 return하는 방법 대신 예외를 던지고 이유를 전달하도록 함
        throw new Exception(in.readUTF());
      }

      return (Board) in.readObject();
    }
  }

  // Client의 BoardUpdateCommand.execute()를 이동
  @Override
  public int update(Board board) throws Exception {
    try (Socket socket = new Socket(host, port);
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream())) {
      out.writeUTF("/board/update");
      out.writeObject(board);
      out.flush();

      String response = in.readUTF();
      if (response.equals("FAIL")) {
        // 저장 실패시 0을 return하는 방법 대신 예외를 던지고 이유를 전달하도록 함
        throw new Exception(in.readUTF());
      }

      return 1; // 변경함
    }
  }

  // Client의 BoardDeleteCommand.execute()를 이동
  @Override
  public int delete(int no) throws Exception {
    try (Socket socket = new Socket(host, port);
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream())) {
      out.writeUTF("/board/delete");
      out.writeInt(no);
      out.flush();

      String response = in.readUTF();
      if (response.equals("FAIL")) {
        // 저장 실패시 0을 return하는 방법 대신 예외를 던지고 이유를 전달하도록 함
        throw new Exception(in.readUTF());
      }

      return 1; // 삭제함
    }
  }
}
