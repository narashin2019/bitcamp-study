package com.eomcs.lms.servlet;

import java.io.PrintStream;
import java.util.Map;
import org.springframework.stereotype.Component;
import com.eomcs.lms.domain.Member;
import com.eomcs.lms.service.BoardService;
import com.eomcs.lms.service.MemberService;
import com.eomcs.util.RequestMapping;

@Component
public class MemberUpdateFormServlet {

  MemberService memberService;

  public MemberUpdateFormServlet(MemberService memberService) {
    this.memberService = memberService;
  }

  @RequestMapping("/member/updateForm")
  public void service(Map<String, String> params, PrintStream out) throws Exception {

    int no = Integer.parseInt(params.get("no"));

    Member member = memberService.get(no);

    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF-8'>");
    out.println("<title>회원 정보 변경</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>회원 변경</h1>");

    if (member == null) {
      out.println("<p>해당 번호의 회원이 없습니다.</p>");
    } else {
      out.println("<form action='/member/update'>");
      out.printf("번호: <input name='no' readonly type='text' value='%d'><br>\n", //
          member.getNo());
      
      out.println("이름:<br>");
      out.printf("<textarea name='name' rows='5' cols='60'>%s</textarea><br>\n", //
          member.getName());
      
      out.println("이메일:<br>");
      out.printf("<textarea name='email' rows='5' cols='60'>%s</textarea><br>\n", //
          member.getName());
      out.println("비밀번호:<br>");
      out.printf("<textarea name='password' rows='5' cols='60'>%s</textarea><br>\n", //
          member.getName());
      out.println("사진:<br>");
      out.printf("<textarea name='photo' rows='5' cols='60'>%s</textarea><br>\n", //
          member.getName());
      out.println("전화번호:<br>");
      out.printf("<textarea name='tel' rows='5' cols='60'>%s</textarea><br>\n", //
          member.getName());
      out.printf("등록일: %s<br>\n", //
          member.getRegisteredDate());
      
      
      
      out.println("<button>변경</button>");
      out.println("</form>");
    }
    out.println("</body>");
    out.println("</html>");
  }
}