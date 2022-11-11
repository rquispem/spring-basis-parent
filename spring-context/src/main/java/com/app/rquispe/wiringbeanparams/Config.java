package com.app.rquispe.wiringbeanparams;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Dog dog() {
        var p =  new Dog();
        p.setName("Zeus");
        return p;
    }

    @Bean
    public Person person(Dog dog) {
        var p = new Person();
        p.setName("Ruben");
        p.setDog(dog);
        return p;
    }
}
