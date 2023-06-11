package org.example.services;

import lombok.AllArgsConstructor;
import org.example.interfaces.Course;
import org.example.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*
Extrasessions implemented by 2 classes - we need to add qualifier
field injection
 */
@Component
public class Java implements Course {
    @Autowired
    @Qualifier("officeHours")
    ExtraSessions extraSessions;

    @Override
    public void getTeachingHours() {
        System.out.println("Java weekly teaching hours: " + (20 + extraSessions.getHours()));
    }
}
