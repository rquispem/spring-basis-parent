package com.app.rquispe.iocbean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {


  public static void main(String[] args) {
    // 1. Creamos una instancia del contexto de Spring
//    var context = new AnnotationConfigApplicationContext();

    // Al crear la instancia de contexto de Spring, enviamos la clase de configuración como un parámetro para indicarle a Spring que la use.
    var context = new AnnotationConfigApplicationContext(Config.class);

    Dog dog = new Dog();
    System.out.println(dog.getName());

    // 2. Obtenemos una referencia de un bean de tipo Dog del contexto de Spring
    Dog dog2 = context.getBean( Dog.class);
//    Dog dog3 = context.getBean("dog3", Dog.class);
    System.out.println(dog2.getName());

//    String hello = context.getBean(String.class);
//    System.out.println(hello);
  }
}
