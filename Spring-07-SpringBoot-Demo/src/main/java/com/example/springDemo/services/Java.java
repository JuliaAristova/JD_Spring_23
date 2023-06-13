package com.example.springDemo.services;

import com.example.springDemo.interfaces.Course;
import com.example.springDemo.interfaces.ExtraSession;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    ExtraSession extraSession;
    @Value("${instructor")
    private String name;

    public Java(@Qualifier("officeHours") ExtraSession extraSession) {
        this.extraSession = extraSession;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Java weekly teaching hours: " + (30 + extraSession.getHoues()));
    }

    @Override
    public String toString() {
        return "Java{" +
                "name='" + name + '\'' +
                '}';
    }
}
