package com.stackroute.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    // bean for movie having dependencies on 3 actors
    @Bean
    @Scope("prototype")
    public Movie movie(){
        return new Movie(actor1(),actor2(),actor3());
    }

    // bean for actor having dependencies on name, gender, age
    @Bean
    public Actor actor1(){
        return new Actor("Ranbir","male",32);
    }

    // bean for actor having dependencies on name, gender, age
    @Bean
    public Actor actor2(){
        return new Actor("Katrina","female",29);
    }

    // bean for actor having dependencies on name, gender, age
    @Bean
    public Actor actor3(){
        return new Actor("Dipika","female",30);
    }
}
