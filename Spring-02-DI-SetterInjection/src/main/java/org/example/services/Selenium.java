package org.example.services;

import lombok.Data;
import org.example.interfaces.Course;
@Data
public class Selenium implements Course {
    OfficeHours officeHours;
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching hours: " + (15 + officeHours.getHours() ));
    }
}
