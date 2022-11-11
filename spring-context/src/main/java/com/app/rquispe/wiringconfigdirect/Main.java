package com.app.rquispe.wiringconfigdirect;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        var myDog = context.getBean(Dog.class);
        var person = context.getBean(Person.class);

        System.out.println(myDog.getName());
        System.out.println(person.getName());
        System.out.println(person.getDog());
    }
}
