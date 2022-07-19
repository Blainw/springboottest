package wdm.springboot.ch6.ch6_3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class MyController {
    @GetMapping("/go")
    public String tiaozhuan(Model model){
        model.addAttribute("link","/upload");
        return "upload";
    }

    @PostMapping("/upload")
    public String upload(Model model,@RequestPart("single")MultipartFile single,@RequestPart("multi")MultipartFile[] multi){
        model.addAttribute("str","单文件名称："+single.getOriginalFilename()+"  多文件数量："+multi.length);
        return "hello";
    }
}
