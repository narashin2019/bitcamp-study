package bitcamp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

  public HelloController() {
    System.out.println("HelloController() 호출됨!"); // 객체 생성여부 알아보는 용도
  }

  @RequestMapping("/hello")
  @ResponseBody
  public String hello() throws Exception {
    return "<html><body><h1>Hello!</h1></body></html>";
  }
}
