package wdm.springboot.ch2.ch2_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
* 1.配置类里面使用@Bean标注在方法上给容器注册组件，默认是单例的
* 2.配置类本身也是bean组件
* 3.proxyBeanMethod：代理bean的方法，如果为true则交给容器管理，是单例模式，就算不断调用.zhangsan（），返回的都是同一个对象，因为这里被代理了，而如果为false，则代表不代理这里的方法，那么调用.zahngsan（）是普通的对象，由于每次都new一个，所以每次返回的对象都不是同一个，默认true
*                   代理规则：如果容器中有该bean，则返回，没有则创建，保证单例
*                   什么时候true，什么时候false？
*                   true：当有bean依赖时，比如下面，我就想要张三有一只tomcat，这个tomcat是唯一的，整个容器就一个，连地址都是一样的
*                   false：如果没有依赖，每个bean都是单独一个，不会涉及到其他的bean，那么我们就用false，这样一来，我们每次来都会创建一个实例，不用再通过代理，代理的话每次要检查，不用代理就会快很多
*
*                      **********注意；两种方式获取对象***********
*                      1. Ioc容器的getBean（）去取对象：每个对象都是唯一的，比如getBean（“zhangsan”），不论调用多少次，返回的都是一个对象
*                      2. Mybean的实例去调用zhangsan（）方法：假如proxyBeanMethods为true，则先去Ioc容器中找是否有zhangsan这个对象，如果有则返回，没有则创建一个，这里就可以保证单例，和第一种方式结果一样
*                                                         假如proxyBeanMethods为false，则就是普通方法调用，返回的就是一个user对象，每次都不一样
* */

@Configuration(proxyBeanMethods = true)   //告诉springboot这是一个配置类  == xml配置文件
public class MyBean {
    @Bean  //给容器中添加此bean，默认以方法名作为bean的id，返回值类型就是bean的类型，返回的值，就是bean在容器的实例
    public User zhangsan(){
        User user=new User("张三",18);
//        user.setPet(getpet());
        return user;
    }

    @Bean("pet1")     //或者自定义bean在ioc容器中的id，如这里的pet1
    public Pet getpet(){
        return new Pet("猫","tomcat");
    }

}
