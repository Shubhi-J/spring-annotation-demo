package com.stackroute.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    // bean for lifeCycle demo
    @Bean
    public BeanLifecycleDemoBean beanLifecycleDemoBean(){
        return new BeanLifecycleDemoBean();
    }
}
