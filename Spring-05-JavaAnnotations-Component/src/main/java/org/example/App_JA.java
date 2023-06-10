package org.example;

import org.example.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Component in classes
 * default beanId - class Java --> id="java" (camelCase), If all capital - id - all capital
 * cntext:componenet-scan in config.xml
 */
public class App_JA {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course = container.getBean("java", Course.class);
        Course course2 = container.getBean("selenium", Course.class);
        Course course3 = container.getBean("API", Course.class);
        course.geetTeachingHours();
        course2.geetTeachingHours();
        course3.geetTeachingHours();
    }
}
