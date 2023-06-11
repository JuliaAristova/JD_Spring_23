package org.example.services;

import org.example.interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
injection:
- constructor injection
- setter
- field
Add annotation - @Autowired
-If only one costructor - @Autowired is optional
 */
@Component
public class Java implements Course {

    private OfficeHours officeHours;

    @Autowired
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Java weekly teaching hours: " + (20 + officeHours.getHours()));
    }
}
