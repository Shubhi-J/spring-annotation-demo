package com.stackroute.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

    public static void main(String[] args) {

        // create object of movie class
        Movie movie1;
        Movie movie2;

        ApplicationContext context=new AnnotationConfigApplicationContext(com.stackroute.demo.Config.class);

        // get the object of movie from movie bean
        movie1 = context.getBean( Movie.class);
        movie2 = context.getBean( Movie.class);

        // call method to display actor details
        movie1.displayActor();

        // return true if scope of bean is singleton, if prototype then false
        System.out.println(movie1==movie2);
    }
}
