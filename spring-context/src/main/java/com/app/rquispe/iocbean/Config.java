package com.app.rquispe.iocbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/*
 *Una clase de configuración es una clase especial de Spring que usamos para indicarle a Spring que realice acciones
 *  específicas. Por ejemplo, podemos decirle a Spring que cree beans o que habilite ciertas funcionalidades @EnableXXX
 */
@Configuration
public class Config {

  /*
   *1.  @Bean le permite a Spring saber que necesita llamar a este método cuando inicializa su contexto
   * y agrega el valor devuelto al contexto
   *
   * 2. Para los métodos que usamos para agregar beans en el contexto de Spring,
   * no seguimos laconvención de verbos.
   * Dichos métodos representan las instancias de objetos que devuelven y que ahora serán parte del contexto de Spring.
   *
   * 3. Por defecto el nombre del método también se convierte en el nombre del BEAN.
   * Si se quiere dar otro nombre al bean se puede lograr de las siguientes maneras:
   *  - @Bean(name = "ZEUS")
   *  - @Bean(value = "ZEUS")
   *  - @Bean("ZEUS")
   */
  @Bean
  public Dog dog() {
    var dog = new Dog();
    dog.setName("FIDO");
    return dog;
  }

  /*
   * Exception No qualifying bean of type 'com.app.rquispe.Dog'
   * Spring no puede adivinar a qué instancia ha declarado que se refiere cuando se busca por tipo
   *  - Para resolver este problema de ambigüedad, una opcion sera obtenerlas por nombres
   *  - Otra opcion puede ser marcando uno de los beans como primario, usando la anotacion @Primary
   */
  @Bean
  public Dog dog2() {
    var dog = new Dog();
    dog.setName("ZEUS");
    return dog;
  }

  @Bean
  @Primary
  public Dog dog3() {
    var dog = new Dog();
    dog.setName("ROCCO");
    return dog;
  }
//
//  @Bean
//  public String hello() {
//    return "Hola Mundo";
//  }
}
