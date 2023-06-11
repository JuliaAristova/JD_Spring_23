package org.example;

import org.example.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App_Q {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
        Course course = container.getBean("java", Course.class);
        course.getTeachingHours();

        Course course1 = container.getBean("selenium", Course.class);
        course1.getTeachingHours();
    }

}
