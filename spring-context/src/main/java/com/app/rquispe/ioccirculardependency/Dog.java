package com.app.rquispe.ioccirculardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dog {
    private final  Person person;
    private String name = "KOKO";

    @Autowired
    public Dog(Person person) {
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
