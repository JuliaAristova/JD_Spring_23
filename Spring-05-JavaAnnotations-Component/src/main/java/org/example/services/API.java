package org.example.services;

import org.example.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class API implements Course {

    @Override
    public void geetTeachingHours() {
        System.out.println("API teaching hours: 10");
    }
}
