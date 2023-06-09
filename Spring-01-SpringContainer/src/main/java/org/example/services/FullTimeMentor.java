package org.example.services;

import org.example.interfaces.Mentor;

public class FullTimeMentor implements Mentor {
    @Override
    public void createAccount() {
        System.out.println("Full-time Mentor Account is created.");
    }
}
