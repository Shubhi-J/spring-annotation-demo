package com.stackroute.demo;

public class Actor {

    // properties of actor
    private String name;
    private String gender;
    private int age;

    // parameterised constructor
    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // method to display actor details
    public void displayActorDetails(){
        System.out.println("Name of actor is "+this.name+" Gender of actor is "+this.gender+" Age of actor is "+this.age);
    }
}
