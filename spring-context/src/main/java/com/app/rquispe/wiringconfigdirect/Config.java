package com.app.rquispe.wiringconfigdirect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {



    @Bean
    public Person person() {
        var p = new Person();
        p.setName("Ruben");
        p.setDog(dog());
        return p;
    }

    @Bean
    public Dog dog() {
        var p = new Dog();
        p.setName("Zeus");
        return p;
    }
}
