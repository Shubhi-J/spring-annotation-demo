package com.stackroute.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Actor {

    // properties of actor
    private String name;
    private String gender;
    private int age;

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // method to display actor details
    public void displayActorDetails(){
        System.out.println("Name of actor is "+this.name+" Gender of actor is "+this.gender+" Age of actor is "+this.age);
    }
}
