package com.at7766499.gmail.com.LearningRESTAPIs.mapper;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    public ModelMapper modelmap(){
        return new ModelMapper();
    }
    
}
