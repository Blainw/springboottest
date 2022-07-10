package wdm.springboot.ch5.ch5_2.ch5_2_3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HiddenHttpMethodFilter;

@Configuration(proxyBeanMethods = false)
public class Myconfig {
    @Bean
    public HiddenHttpMethodFilter hiddenHttpMethodFilter(){
        HiddenHttpMethodFilter f = new HiddenHttpMethodFilter();
        f.setMethodParam("_m");
        return f;
    }
}
