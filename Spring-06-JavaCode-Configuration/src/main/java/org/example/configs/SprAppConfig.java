package org.example.configs;
/*
We do not use config.xml
Spring needs to scan classes
 */

import org.example.interfaces.ExtraSessions;
import org.example.services.Cypress;
import org.example.services.InterviewPrep;
import org.example.services.OfficeHours;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.example")
@PropertySource("classpath:application.properties")
public class SprAppConfig {

    //we pass method that returns object of InterviewPrep class - dependency injection
//    @Bean
//    public Cypress cypress(){
//        return new Cypress(interviewPrep());
//    }

    @Bean
    public InterviewPrep interviewPrep() {
        return new InterviewPrep();
    }
    //polymorphic way
    @Bean
    public Cypress cypress() {
        return new Cypress(extraSessions());
    }


    //the other way of DI
    public ExtraSessions extraSessions() {
        return new OfficeHours();
    }


}
