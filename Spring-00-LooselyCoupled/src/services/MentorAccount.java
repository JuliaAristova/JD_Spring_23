package services;

import interfaces.Mentor;
/*
loosely coupled
- when we add another Mentor class - no need to make changes
 */
public class MentorAccount {

    //composition
    // interface can be implemented by multiple classes
    Mentor mentor;

    public MentorAccount(Mentor mentor) {
        this.mentor = mentor;
    }
    public void manageAccount(){
        this.mentor.createAccount();
    }
}
