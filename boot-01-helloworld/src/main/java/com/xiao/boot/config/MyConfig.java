package com.xiao.boot.config;

import com.xiao.boot.bean.Car;
import com.xiao.boot.bean.Pet;
import com.xiao.boot.bean.User;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
@EnableConfigurationProperties(Car.class)
public class MyConfig {
@Bean
    public User user01(){
        return  new User("cxz",12);

    }

    @Bean
    public Pet pet01(){
        return  new Pet("dog");

    }




}
