package wdm.springboot.ch6.ch6_4.ch6_4_2;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class MyRegistConfig {
    //配置servlet，相当于以前的web.xml配置servlet
    @Bean
    public ServletRegistrationBean myServlet(){
        MyServlet myServlet=new MyServlet();
        //第一个参数是你的servlet对象，后面的是拦截的请求路径
        return new ServletRegistrationBean(myServlet,"/my2","/my3");
    }


    //配置Filter
    @Bean
    public FilterRegistrationBean myFilter(){
        MyFilter myFilter=new MyFilter();
        //1.第一个参数传入的是过滤器对象，后面可以传多个servlet对象
//        return new FilterRegistrationBean(myFilter,myServlet());

        //2.指定拦截路径而不是用servlet,setUrlPatterns要求传入的是一个String集合
        FilterRegistrationBean f=new FilterRegistrationBean(myFilter);
        f.setUrlPatterns(Arrays.asList("/css/*","/my2"));
        return f;
    }

    //配置Listener
    @Bean
    public ServletListenerRegistrationBean myListener(){
        MyListener myListener=new MyListener();
        return new ServletListenerRegistrationBean(myListener);
    }
}
