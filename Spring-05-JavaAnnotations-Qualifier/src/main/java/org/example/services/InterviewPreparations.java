package org.example.services;

import org.example.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class InterviewPreparations implements ExtraSessions {
    @Override
    public int getHours() {
        return 3;
    }
}
