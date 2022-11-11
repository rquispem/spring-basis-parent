package com.app.rquispe.wiringbeanautowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        final Dog dog = context.getBean(Dog.class);
        final Person person = context.getBean(Person.class);

        System.out.println(dog.getName());
        System.out.println(person.getName());
        System.out.println(person.getDog().getName());
    }
}
