package wdm.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/hello")
    public String test(){
        return "你好，springboot";
    }

    @RequestMapping("/wdm")
    public String aaa(){
        return "王德明 hello";
    }
}
