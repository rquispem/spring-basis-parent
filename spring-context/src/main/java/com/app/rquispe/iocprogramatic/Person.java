package com.app.rquispe.iocprogramatic;

public class Person {

    private String name;

    public Person() {
        this.name = "default person";
    }


    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
