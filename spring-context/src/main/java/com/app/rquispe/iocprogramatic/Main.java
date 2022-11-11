package com.app.rquispe.iocprogramatic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);

        Person person = new Person();
        person.setName("my person programing");

        Supplier<Person> personSupplier = () -> person;
        context.registerBean("person1", Person.class, personSupplier, bc -> bc.setPrimary(true));

        Person p = context.getBean(Person.class);
        System.out.println(p.getName());
    }
}
