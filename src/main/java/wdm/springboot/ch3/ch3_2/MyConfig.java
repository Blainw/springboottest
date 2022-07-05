package wdm.springboot.ch3.ch3_2;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import wdm.springboot.ch3.ch3_2.Car;

@Configuration
@EnableConfigurationProperties(Car.class)     //首先会自动注入Car类到Ioc容器中，然后再去找配置文件，根据你类中的规则去给属性注入值
public class MyConfig {

}
