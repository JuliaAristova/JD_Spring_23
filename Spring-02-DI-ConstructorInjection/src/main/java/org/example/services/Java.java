package org.example.services;

import org.example.interfaces.Course;
import org.example.interfaces.ExtraSessions;

/*
Java class has dependency on OfficeHours
 */
public class Java implements Course {

    /*   OfficeHours officeHours;
         public Java(OfficeHours officeHours) {
            this.officeHours = officeHours;
        }
    */
    //better solution - polymorphic way
    ExtraSessions extraSessions;

    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching hours: " + (20 + extraSessions.getHours()));
    }
}
