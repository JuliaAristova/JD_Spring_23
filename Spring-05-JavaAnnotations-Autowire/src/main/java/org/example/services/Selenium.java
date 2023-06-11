package org.example.services;

import lombok.EqualsAndHashCode;
import org.example.interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
Setter Injection
 */
@Component
public class Selenium implements Course {

   private OfficeHours officeHours;

    public OfficeHours getOfficeHours() {
        return officeHours;
    }

    @Autowired
    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    @Override
    public void getTeachingHours() {

        System.out.println("Selenium weekly teaching hours: " + (10 + officeHours.getHours()));
    }
}
