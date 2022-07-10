package wdm.springboot.ch5.ch5_2.ch5_2_4;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {

    @GetMapping("/name/{name}/age/{age}")          //比如在浏览器的url中输入：/name/王德明/age/23   用{}括起来的变量，可以在控制器方法的形参中获取到
    public Map<String,Object> getUser(@PathVariable("name") String name, @PathVariable("age") Integer age){//用@PathVariable注解能够获取到地址中的变量值
        Map<String,Object> map=new HashMap<>();
        map.put("name",name);
        map.put("age",age);
        return map;
    }

    @GetMapping("/user/{name}/age/{age}/height/{height}/weight/{weight}")
    public Map<String,String> savaInMap(@PathVariable Map<String,String> map){//@PathVariable Map<String,String> map这是一个专属用法，这个map集合能够封装前端url中的参数
        return map;
    }

    @GetMapping("/user")
    public Map<String,String> requestHead(@RequestHeader Map<String,String> map){//@RequestHeader Map<String,String> map这是一个专属用法，这个map集合能够封装请求头
        return map;
    }
}
