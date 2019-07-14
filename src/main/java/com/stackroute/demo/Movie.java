package com.stackroute.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Movie {

    // create object of actors
    private Actor actor1;
    private Actor actor2;
    private Actor actor3;

    // setter for actor 1 with autoWiring
    @Autowired
    public void setActor1(Actor actor1) {
        this.actor1 = actor1;
    }

    // setter for actor 2 with autoWiring
    @Autowired
    public void setActor2(Actor actor2) {
        this.actor2 = actor2;
    }

    // setter for actor 3 with autoWiring
    @Autowired
    public void setActor3(Actor actor3) {
        this.actor3 = actor3;
    }

    // method to display actor details
    public void displayActor(){
        actor1.displayActorDetails();
        actor2.displayActorDetails();
        actor3.displayActorDetails();

    }

}
