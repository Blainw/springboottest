package wdm.springboot.ch2.ch2_4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import wdm.springboot.ch2.ch2_4.User;

@ImportResource("bean.xml")//导入bean配置文件来往ioc容器注入
@SpringBootApplication(scanBasePackages = "wdm.springboot.ch2.ch2_3")
public class MyApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MyApplication.class, args);
        User user= run.getBean("user01", User.class);
        System.out.println(user.getName());
    }
}
