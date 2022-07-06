package wdm.springboot.ch4.ch4_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import wdm.springboot.ch4.ch4_2.User;

@SpringBootApplication

public class MyApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MyApplication.class, args);
        User user = run.getBean("user02", User.class);
        System.out.println(user);
    }
}
