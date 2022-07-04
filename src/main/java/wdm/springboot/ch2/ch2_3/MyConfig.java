package wdm.springboot.ch2.ch2_3;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {


    @Bean("tom")
    public Pet getPet(){
        return new Pet("tom","猫咪");
    }

    @ConditionalOnBean(name="tom")//如果有tom这个bean，则执行下面的代码,这个注解还可以放在类上面用来判断
    @Bean("wdm")
    public User getUser(){
        User user=new User("张三",18);
        user.setPet(getPet());
        return user;
    }


}
