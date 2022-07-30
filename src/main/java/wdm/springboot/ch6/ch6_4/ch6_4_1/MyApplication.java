package wdm.springboot.ch6.ch6_4.ch6_4_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;


@ServletComponentScan(basePackages = "wdm.springboot.ch6.ch6_4")
@SpringBootApplication

public class MyApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MyApplication.class, args);
    }
}
