package org.example.services;

import org.example.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSessions {

    @Override
    public int getHours() {
        return 4;
    }
}
