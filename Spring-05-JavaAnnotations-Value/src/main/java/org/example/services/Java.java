package org.example.services;

import org.example.interfaces.Course;
import org.example.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/*
Value annotation
in config.xml - context:property-placeholder location="application.properties"

 */
@Component
public class Java implements Course {

    @Value("J-01")
    private String batch;
    @Value("${instructor}")
    private String instructor;
    @Value("${days}")
    private String[] days;


    @Autowired
    ExtraSessions extraSessions;

    public void getTeachingHours() {
        System.out.println("Java weekly teaching hours: " + (32 + extraSessions.getHours()));

    }

    @Override
    public String toString() {
        return "Java{" +
                "batch='" + batch + '\'' +
                ", instructor='" + instructor + '\'' +
                ", days=" + Arrays.toString(days) +
                '}';
    }
}
