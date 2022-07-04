package wdm.springboot.ch2.ch2_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@Import({User.class})
@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MyApplication.class, args);
        String[] names = run.getBeanDefinitionNames();

        String[] cname=run.getBeanNamesForType(User.class);
        for (String name:cname
             ) {
            System.out.println(name);
        }
    }
}
