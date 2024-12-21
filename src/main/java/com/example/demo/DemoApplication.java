package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        var ctx = SpringApplication.run(DemoApplication.class, args);
        MyNewClass myNewClass = ctx.getBean("myBean",MyNewClass.class);
        System.out.println(myNewClass.sayHello());


    }

}