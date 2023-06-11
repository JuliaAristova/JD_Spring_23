package org.example.services;

import org.example.interfaces.Course;
import org.example.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/*
constructor injection
qualifier is inside the constructor
 */

@Component
public class Selenium implements Course {

    @Autowired
    public Selenium(@Qualifier("interviewPreparations") ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    ExtraSessions extraSessions;
    @Override
    public void getTeachingHours() {

        System.out.println("Selenium weekly teaching hours: " + (12 + extraSessions.getHours()));
    }
}
