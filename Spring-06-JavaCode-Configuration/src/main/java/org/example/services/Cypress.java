package org.example.services;

import org.example.interfaces.Course;
import org.example.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;


public class Cypress implements Course {

    ExtraSessions extraSessions;

    public Cypress(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Cypress weekly teaching hours: " + (12 + extraSessions.getHours()));
    }
}
