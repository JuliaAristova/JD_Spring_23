package org.example;

import org.example.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class AppDI_1 {
    public static void main(String[] args) {


        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

       Course course =  container.getBean("java", Course.class);
       Course course2 = container.getBean("selenium", Course.class);
       course.getTeachingHours();
       course2.getTeachingHours();
    }
}