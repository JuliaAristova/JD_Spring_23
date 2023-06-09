package org.example;

import org.example.interfaces.Mentor;
import org.example.services.PartTimeMentor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

       // BeanFactory container = new ClassPathXmlApplicationContext("config.xml");
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Mentor mentor = (Mentor) container.getBean("fullTimeMentor");
        Mentor mentor2 = container.getBean("partTimeMentor", Mentor.class);

        mentor.createAccount();
        mentor2.createAccount();
    }
}
