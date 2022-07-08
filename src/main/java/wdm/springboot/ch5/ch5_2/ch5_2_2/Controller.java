package wdm.springboot.ch5.ch5_2.ch5_2_2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/index.html")
    public String index(){
        return "你好！";
    }
}
