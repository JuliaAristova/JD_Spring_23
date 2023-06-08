import services.FulltimeMentor;
import services.MIMentor;
import services.MentorAccount;

/*

packages:
interfaces - Mentor Interface
services: Parttime, Fulltime - implements Mentor;
          MentorAccount - manageAccount
From development perspective still not good - we use new - we create objects
 */
public class Test_LC {
    public static void main(String[] args) {

        FulltimeMentor fulltimeMentor = new FulltimeMentor();
        MentorAccount mentor = new MentorAccount(fulltimeMentor);
        mentor.manageAccount();

        MIMentor miMentor = new MIMentor();
        MentorAccount mentor2 = new MentorAccount(miMentor);
        mentor2.manageAccount();


    }
}