package com.app.rquispe.ioccirculardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person { private final Dog dog;

    @Autowired
    public Person(Dog dog) {
        this.dog = dog;
    }

    public Dog getDog() {
        return dog;
    }
}
