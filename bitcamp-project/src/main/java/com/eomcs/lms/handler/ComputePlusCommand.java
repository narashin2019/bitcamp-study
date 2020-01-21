// "/hello"명령 처리

package com.eomcs.lms.handler;

import com.eomcs.util.Prompt;

public class ComputePlusCommand implements Command {

  Prompt prompt;

  public ComputePlusCommand(Prompt prompt) {
    this.prompt = prompt;
  }



  @Override
  public void execute() {
    int i1 = prompt.inputInt("수1?");

    int i2 = prompt.inputInt("수2?");

    int result = i1 + i2;

    System.out.printf("계산결과는 %d입니다.\n", result);

  }
}

