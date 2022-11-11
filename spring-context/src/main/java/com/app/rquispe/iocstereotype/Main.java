package com.app.rquispe.iocstereotype;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        Person person = context.getBean(Person.class);
        System.out.println(person.getName());
        context.close();
    }
}
