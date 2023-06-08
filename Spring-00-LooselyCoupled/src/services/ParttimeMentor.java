package services;

import interfaces.Mentor;

public class ParttimeMentor implements Mentor {
    @Override
    public void createAccount() {
        System.out.println("Part-time Mentor account is created.");
    }
}
