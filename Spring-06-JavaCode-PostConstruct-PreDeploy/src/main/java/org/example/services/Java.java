package org.example.services;

import org.example.interfaces.Course;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component

public class Java implements Course {
    public void getTeachingHours() {
        System.out.println("Java weekly teaching hours: 20");
    }

    @PostConstruct
    public void postConstruct() {

        System.out.println("Executing post construct");
    }
    @PreDestroy
    public void preDestroy() {
        System.out.println("Executing pre destroy");
    }
}
