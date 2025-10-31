package com.igreaper.learning.Introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    Student getInfo(){
        return new Student();
    }
}
