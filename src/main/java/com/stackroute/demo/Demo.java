package com.stackroute.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

    public static void main(String[] args) {

        // Create object of movie class
        Movie movie;

        ApplicationContext context=new AnnotationConfigApplicationContext(com.stackroute.demo.Config.class);

        // get the object of movie from movie bean
        movie = context.getBean( Movie.class);

        // call method to display actor details
        movie.displayActor();
   }
}
