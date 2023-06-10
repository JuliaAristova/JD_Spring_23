package org.example.services;

import org.example.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {
    @Override
    public void geetTeachingHours() {
        System.out.println("Java weekly teaching hours: 30");
    }
}
