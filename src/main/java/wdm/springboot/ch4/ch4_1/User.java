package wdm.springboot.ch4.ch4_1;


import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data    //生成已有属性的set，get方法
@ToString    //生成tostring方法
@NoArgsConstructor   //生成无参构造器
@AllArgsConstructor   //生成全参构造器
@EqualsAndHashCode    //重写equals和hashCode
@Component("user01")
@ConfigurationProperties(prefix = "user01")
public class User {//注意：需要定制的有参构造器，可以自己在下面写
    private String name;
    private Integer age;

}
