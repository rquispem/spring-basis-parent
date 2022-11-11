package com.app.rquispe.wiringbeanparams;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        var person = context.getBean(Person.class);
        var dog = context.getBean(Dog.class);

        System.out.println(dog.getName());
        System.out.println(person.getName());
        System.out.println(person.getDog());
    }
}
