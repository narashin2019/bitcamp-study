package com.eomcs.lms.handler;

import java.util.List;
import com.eomcs.lms.domain.Member;
import com.eomcs.util.Prompt;

public class MemberUpdateCommand implements Command {

  List<Member> memberList;

  Prompt prompt;


  public MemberUpdateCommand(Prompt prompt, List<Member> list) {
    this.prompt = prompt;
    this.memberList = list;
  }


  @Override
  public void execute() {
    int index = indexOfMember(prompt.inputInt("번호? "));

    if (index == -1) {
      System.out.println("해당 번호의 회원이 없습니다.");
      return;
    }

    Member oldMember = this.memberList.get(index); // 일단 수정전것을 oldMember에 저장함
    Member newMember = new Member(); // 뉴멤버 식판을 하나 만든다.

    newMember.setNo(oldMember.getNo()); // 숫자는 그대로 받아옴
    newMember.setRegisteredDate(oldMember.getRegisteredDate());

    newMember.setName(
        prompt.inputString(String.format("이름(%s)? ", oldMember.getName()), oldMember.getName()));

    newMember.setEmail(
        prompt.inputString(String.format("이메일(%s)? ", oldMember.getEmail()), oldMember.getEmail()));

    newMember.setPassword(prompt.inputString(String.format("암호(%s)? ", oldMember.getPassword()),
        oldMember.getPassword()));

    newMember.setPhoto(
        prompt.inputString(String.format("사진(%s)? ", oldMember.getPhoto()), oldMember.getPhoto()));

    newMember.setTel(
        prompt.inputString(String.format("전화(%s)? ", oldMember.getTel()), oldMember.getTel()));

    newMember.setRegisteredDate(oldMember.getRegisteredDate());


    if (oldMember.equals(newMember)) {
      System.out.println("회원 변경을 취소하었습니다.");
      return;
    }

    this.memberList.set(index, newMember);
    System.out.println("회원을 변경했습니다.");


  }


  private int indexOfMember(int no) {
    for (int i = 0; i < this.memberList.size(); i++) {
      if (this.memberList.get(i).getNo() == no) {
        return i;
      }
    }
    return -1;
  }

}


