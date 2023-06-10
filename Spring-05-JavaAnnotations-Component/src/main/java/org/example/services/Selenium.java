package org.example.services;

import org.example.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {
    @Override
    public void geetTeachingHours() {
        System.out.println("Selenium weekly teaching hours: 20");
    }
}
