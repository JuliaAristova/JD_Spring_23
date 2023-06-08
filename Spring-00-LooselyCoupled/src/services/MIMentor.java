package services;

import interfaces.Mentor;

public class MIMentor implements Mentor {
    @Override
    public void createAccount() {
        System.out.println("Mock Interview Mentor account is created.");
    }
}
