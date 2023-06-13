package com.example.springDemo;

import com.example.springDemo.interfaces.Course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring07SpringBootDemoApplication {

	public static void main(String[] args) {

		//added automatically - created container and all beans
		ApplicationContext container = SpringApplication.run(Spring07SpringBootDemoApplication.class, args);

		Course course = container.getBean("java", Course.class);
		Course course1 = container.getBean("selenium", Course.class);

		course.getTeachingHours();
		course1.getTeachingHours();

		System.out.println(course.toString());


	}

}
