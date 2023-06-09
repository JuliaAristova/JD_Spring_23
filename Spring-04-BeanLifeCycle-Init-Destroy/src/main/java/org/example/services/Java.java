package org.example.services;

import org.example.interfaces.Course;

public class Java implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Java weekly teaching hours: 20");
    }

    //init method - no parameters, any return type (void usually), any name
    public void myInitMethod() {
        System.out.println("Executing init method");
    }

    public void myDestroyMethod() {
        System.out.println("Executing destroy method");
    }
}
