package org.example.services;

import org.example.interfaces.Course;

public class Selenium implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Selenium weekly teaching hours: 15");
    }
}
