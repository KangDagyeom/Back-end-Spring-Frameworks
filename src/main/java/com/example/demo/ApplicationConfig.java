package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {

    @Bean
    @Qualifier("bean1")
    public MyNewClass myNewClass() {
        return new MyNewClass("First beans");
    }

    @Bean
    @Qualifier("bean2")
    public MyNewClass mySecondClass() {
        return new MyNewClass("Second beans");
    }

    @Bean
    @Primary
    public MyNewClass myThirdClass() {
        return new MyNewClass("Third beans");
    }
}
