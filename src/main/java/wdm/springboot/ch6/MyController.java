package wdm.springboot.ch6;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @GetMapping("/go")
    public String tiaozhuan(Model model){
        model.addAttribute("str","hello world");
        model.addAttribute("link","http://www.wdm-server.top/");
        return "hello";
    }
}
