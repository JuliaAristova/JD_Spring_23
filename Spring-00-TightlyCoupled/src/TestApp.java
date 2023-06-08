/*
coupling - how objects are interacting with each other
tightly coupled - not good for development - it is hard to make changes
loosely coupling
 */

public class TestApp {
    public static void main(String[] args) {

       FullTimeMentor fullTimeMentor = new FullTimeMentor();
       PartTimeMentor partTimeMentor = new PartTimeMentor();

       //mentor has dependencies to Fulltime and Parttime objects
       Mentor mentor = new Mentor(fullTimeMentor, partTimeMentor);
       mentor.manageAccount();

       //to add onother type of Mentor  --> create class, update Mentor class constructor and method,update TestApp

    }
}