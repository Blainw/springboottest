package wdm.springboot.ch5.ch5_2.ch5_2_5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration(proxyBeanMethods = false)
public class Myconfig {

    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        return new WebMvcConfigurer() {//匿名内部类方式
            @Override
            public void addFormatters(FormatterRegistry registry) {//添加格式转换器

                registry.addConverter(new Converter<String, Pet>() {//添加一个自定义类型转换器，将string转换成Pet类型

                    @Override
                    public Pet convert(String source) {//source就是页面提交过来的数据
                        if(!StringUtils.isEmpty(source)){
                            Pet pet =new Pet();
                            String[] data=source.split(",");
                            pet.setBreed(data[0]);
                            pet.setName(data[1]);
                            pet.setAge(Integer.parseInt(data[2]));
                            return pet;
                        }
                        return null;
                    }
                });
            }
        };
    }
}
