package com.app.rquispe.iocabstractions;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.app.rquispe.iocabstractions.proxies",
        "com.app.rquispe.iocabstractions.services", "com.app.rquispe.iocabstractions.repositories"})
public class ProjectConfiguration {
}
