package org.example;

import org.example.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 init and destroy method added to bean *config.xml
 After  we close the container, destroy method is executed
 */
public class App_LC {
    public static void main(String[] args) {


        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
        Course course = container.getBean("java", Course.class);
        course.getTeachingHours();

        //close container
        ((ClassPathXmlApplicationContext)container).close();

    }
}
