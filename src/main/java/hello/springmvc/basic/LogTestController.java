package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

      // @Slf4j 롬복 사용가능
//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        // sysout은 로그 레벨과 상관없이 그냥 다 출력됨, 지저분해짐
        System.out.println("name = " + name);

        // 로그의 레벨을 정함 //
        // 가능은 하나 권장X +연산이 일어나버려 불필요한 리소스가 사용됨
        // log.trace(" trace log=" + name);
        log.trace(" trace log={}", name);
        log.debug(" debug log={}", name); // 개발서버같은 디버그할때 보는거
        log.info("  info log={}", name); // 비니지스 정보나 운영서비스 정보 같은
        log.warn("  warn log={}", name); // 경고
        log.error(" error log={}", name); // 에러

        return "ok";
    }

}
