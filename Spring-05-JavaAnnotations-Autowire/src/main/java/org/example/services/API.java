package org.example.services;

import org.example.interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
field injection
 */
@Component
public class API implements Course {

    @Autowired
    private OfficeHours officeHours;

    @Override
    public void getTeachingHours() {
        System.out.println("API weekly teaching hours: " + (10 + officeHours.getHours()));
    }
}
