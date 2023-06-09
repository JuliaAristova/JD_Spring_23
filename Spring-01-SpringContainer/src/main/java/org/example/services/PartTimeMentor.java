package org.example.services;

import org.example.interfaces.Mentor;

public class PartTimeMentor implements Mentor {
    @Override
    public void createAccount() {
        System.out.println("Part-time Mentor Account is created.");
    }
}
