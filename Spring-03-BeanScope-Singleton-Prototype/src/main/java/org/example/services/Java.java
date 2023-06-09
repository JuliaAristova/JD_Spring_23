package org.example.services;

import org.example.interfaces.Course;

public class Java implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Java weekly teaching hours: 20");
    }
}
