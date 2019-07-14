package com.stackroute.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    // bean for movie having dependencies on 3 actors
    @Bean
    @Scope("prototype")
    public Movie movie() {
        return new Movie();
    }

    // bean for actor having dependencies on name, gender, age
    @Bean
    public Actor actor1(){

        Actor actor1=new Actor();
        actor1.setName("Ranbir");
        actor1.setGender("male");
        actor1.setAge(31);
        return actor1;
    }

    // bean for actor having dependencies on name, gender, age
    @Bean
    public Actor actor2(){

        Actor actor2=new Actor();
        actor2.setName("Dipika");
        actor2.setGender("female");
        actor2.setAge(33);
        return actor2;
    }

    // bean for actor having dependencies on name, gender, age
    @Bean
    public Actor actor3(){

       Actor actor3=new Actor();
        actor3.setName("Katrina");
        actor3.setGender("female");
        actor3.setAge(30);
        return actor3;
    }
}
