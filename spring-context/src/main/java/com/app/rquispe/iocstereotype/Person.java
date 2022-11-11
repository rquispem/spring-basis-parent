package com.app.rquispe.iocstereotype;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Person {

    private String name;

    public Person() {
        this.name = "default person";
    }

    @PostConstruct
    public void init() {
        System.out.println("after person constructor");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroying person");
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
