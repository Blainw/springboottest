package wdm.springboot.ch3.ch3_2;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

          //加这个注解是为了让此类注册到Ioc容器中，只有在容器中，才能使用如下注解进行注入
@ConfigurationProperties(prefix = "mycar1")     //按照配置文件进行注入，通过前缀mycar搜索key，搜索到后拿类中的属性去匹配key的后缀，最终确定关系，进行注入
public class Car {
    private String brand;
    private Double price;

    public Car() {
    }

    public Car(String brand, Double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
