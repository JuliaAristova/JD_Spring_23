package com.example.springDemo.services;

import com.example.springDemo.interfaces.Course;
import com.example.springDemo.interfaces.ExtraSession;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {
    ExtraSession extraSession;

    public Selenium(@Qualifier("interviewPrep") ExtraSession extraSession) {
        this.extraSession = extraSession;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Selenium weekly teaching hours: " + (20 + extraSession.getHoues()));
    }
}
