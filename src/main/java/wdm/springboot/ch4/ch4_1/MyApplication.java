package wdm.springboot.ch4.ch4_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication

public class MyApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MyApplication.class, args);
        User user = run.getBean("user01",User.class);
        System.out.println(user.getName()+"   "+user.getAge());
    }
}
