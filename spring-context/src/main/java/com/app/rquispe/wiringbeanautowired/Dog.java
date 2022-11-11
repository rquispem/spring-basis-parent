package com.app.rquispe.wiringbeanautowired;

import org.springframework.stereotype.Component;

@Component
public class Dog {

    public Dog() {
        System.out.println("dog created");
        this.name = "Autowired dog";
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
