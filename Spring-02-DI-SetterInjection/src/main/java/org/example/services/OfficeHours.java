package org.example.services;

import org.example.interfaces.ExtraSessions;

public class OfficeHours implements ExtraSessions {

    @Override
    public int getHours() {
        return 5;
    }
}
