package com.igreaper.learning.Introduction.config;

import org.springframework.context.annotation.Bean;
import org.modelmapper.ModelMapper;

public class MapperConfig {

 @Bean
    public ModelMapper getmodelMapper(){
     return new ModelMapper();
 }
}
