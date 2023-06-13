package com.example.springDemo.services;

import com.example.springDemo.interfaces.ExtraSession;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSession {
    @Override
    public int getHoues() {
        return 4;
    }
}
