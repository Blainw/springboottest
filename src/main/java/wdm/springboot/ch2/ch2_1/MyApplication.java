package wdm.example.ch2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MyApplication.class, args);
        String[] names= run.getBeanDefinitionNames();
        for(String name:names){
            System.out.println(name);
        }
        MyBean myBean=run.getBean(MyBean.class);
        System.out.println();
    }
}
