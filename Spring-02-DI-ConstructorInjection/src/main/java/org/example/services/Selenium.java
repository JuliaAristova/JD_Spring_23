package org.example.services;

import org.example.interfaces.Course;

public class Selenium implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching hours: 15");
    }
}
