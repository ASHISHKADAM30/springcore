package com.itvedant.springcore;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public LocalDate today(){
        System.out.println("LocalDate Bean Created");
        return LocalDate.now();
    }

    @Bean
    public LocalTime current(){
        System.out.println("LocalTime Bean Created");
        return LocalTime.now();
    }
}
