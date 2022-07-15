package wdm.springboot.ch6.ch6_1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/go")
    public String tiaozhuan(Model model){
        model.addAttribute("str","hello world");
        model.addAttribute("link","http://www.wdm-server.top/");
        return "hello";
    }
}
