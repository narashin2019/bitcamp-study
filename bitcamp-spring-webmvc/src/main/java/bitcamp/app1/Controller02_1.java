// GET, POST 구분하기
package bitcamp.app1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/c02_1")
public class Controller02_1 {

  // 테스트 방법:
  // => http://localhost:9999/bitcamp-spring-webmvc/html/app1/c02_1.html

  @RequestMapping(method = RequestMethod.GET) // GET 요청일 때만 호출된다. //ctrl 스페이스 로 사용가능한거 다 볼 수 있음
  @ResponseBody
  public String handler1() {
    return "get";
  }

  @RequestMapping(method = RequestMethod.POST) // POST 요청일 때만 호출된다.
  @ResponseBody
  public String handler2() {
    return "post";
  }
}
