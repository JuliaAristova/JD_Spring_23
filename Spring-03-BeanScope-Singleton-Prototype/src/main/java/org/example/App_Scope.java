package org.example;

import org.example.interfaces.Course;
import org.example.services.Java;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App_Scope
{
    public static void main( String[] args )
    {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course = container.getBean("java", Course.class);
        Course course2 = container.getBean("java", Course.class);

        course.getTeachingHours();
        course2.getTeachingHours();
        //default scope="singleton"
        System.out.println("Pointin to the same object: " + course.equals(course2));
        System.out.println("Memory location for course 1: " + course);
        System.out.println("Mempry location for course 2: " + course2);

        Course course3 = container.getBean("selenium", Course.class);
        Course course4 = container.getBean("selenium", Course.class);

        course3.getTeachingHours();
        course4.getTeachingHours();
        //config.xml bean scope="prototype"
        System.out.println("Pointin to the same object: " + course3.equals(course4));
        System.out.println("Memory location for course 1: " + course3);
        System.out.println("Mempry location for course 2: " + course4);
    }
}
