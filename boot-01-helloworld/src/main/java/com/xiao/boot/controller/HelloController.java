package com.xiao.boot.controller;


import com.xiao.boot.bean.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String handle01(){
        return "Hi,spring boot 2";
    }
    @Autowired
    Car car;
    @RequestMapping("/car")
    public  Car car01(){

        return car;


    }






}
