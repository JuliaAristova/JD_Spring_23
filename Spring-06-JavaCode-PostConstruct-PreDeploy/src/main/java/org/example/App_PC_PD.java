package org.example;

import org.example.configs.SprAppConfig;
import org.example.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App_PC_PD
{
    public static void main( String[] args ) {

        ApplicationContext containter = new AnnotationConfigApplicationContext(SprAppConfig.class);

        Course course = containter.getBean("java", Course.class);

        course.getTeachingHours();

        Course course2 = containter.getBean("selenium", Course.class);

        course2.getTeachingHours();
        ((AnnotationConfigApplicationContext)containter).close();
    }
}
