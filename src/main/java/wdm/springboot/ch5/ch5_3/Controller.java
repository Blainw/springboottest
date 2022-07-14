package wdm.springboot.ch5.ch5_3;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {

    @RequestMapping("/user/account")
    public String userAccount(){
        return "访问了/user/account地址";
    }

    @RequestMapping("/user/login")
    public String userlogin(){
        return "访问了/user/login地址";
    }

}
