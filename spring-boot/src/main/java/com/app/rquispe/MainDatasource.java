package com.app.rquispe;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//1. Esta anotacion define la clase principal de la aplicacion
@SpringBootApplication
public class MainDatasource {

  public static void main(String[] args) {
    SpringApplication.run(MainDatasource.class, args);
  }
}
