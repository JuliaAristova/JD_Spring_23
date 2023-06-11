package org.example.services;

import org.example.interfaces.Course;
import org.example.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
field injection
Better practice - tu use Interface
 */
@Component
public class API implements Course {

    @Autowired
    private ExtraSessions extraSessions;

    @Override
    public void getTeachingHours() {
        System.out.println("API weekly teaching hours: " + (10 + extraSessions.getHours()));
    }
}
