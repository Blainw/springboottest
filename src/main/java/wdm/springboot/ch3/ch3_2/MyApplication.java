package wdm.springboot.ch3.ch3_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import wdm.springboot.ch3.ch3_2.Car;

@SpringBootApplication()//配置注解扫描位置
public class MyApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MyApplication.class, args);
        Car car1 = run.getBean(Car.class);
        System.out.println(car1);
    }
}
