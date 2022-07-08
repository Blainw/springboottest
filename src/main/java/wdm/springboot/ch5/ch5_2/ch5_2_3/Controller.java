package wdm.springboot.ch5.ch5_2.ch5_2_3;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getUser(){
        return "获取用户";
    }
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String savaUser(){
        return "保存用户";
    }
    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    public String deleteUser(){
        return "删除用户";
    }
    @PutMapping("/user")
    public String updateUser(){
        return "修改用户";
    }
}
