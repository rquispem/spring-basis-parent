package com.app.rquispe.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.app.rquispe.aop")
@EnableAspectJAutoProxy //1. Habilitamos aspects en nuestra aplicacion
public class Config {

}
