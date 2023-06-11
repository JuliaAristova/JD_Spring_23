package org.example;

import org.example.configs.SprAppConfig;
import org.example.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Java Code
 * we do not work with xml --> AnnotaionCOnfigurationApplicationContext()
 * @Component in Class or
 * @Bean in AppConfig - method level annotations - for 3d party - we cannot
 * change classes, so we add annotation in config to get object
 */
public class App_JC {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(SprAppConfig.class);

        Course course = container.getBean("java", Course.class);
        course.getTeachingHours();

        Course course2 = container.getBean("selenium", Course.class);
        course2.getTeachingHours();

        Course course3 = container.getBean("cypress", Course.class);
        course3.getTeachingHours();

        System.out.println(course.toString());
    }
}
