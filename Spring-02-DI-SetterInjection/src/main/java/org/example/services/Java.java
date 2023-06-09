package org.example.services;

import org.example.interfaces.Course;
import org.example.interfaces.ExtraSessions;

/*
Java class has dependency on OfficeHours
 */
public class Java implements Course {

       private OfficeHours officeHours;

    public OfficeHours getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }


    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching hours: " + (20 + officeHours.getHours()));
    }
}
