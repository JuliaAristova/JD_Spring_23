package com.carpetworld.carpetcalculator;

import com.carpetworld.carpetcalculator.calculator.Calculator;
import com.carpetworld.carpetcalculator.enums.City;
import com.carpetworld.carpetcalculator.interfaces.carpetPrices.Carpet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CarpetCalculatorApplication {

    public static void main(String[] args) throws Exception{
     ApplicationContext container = SpringApplication.run(CarpetCalculatorApplication.class, args);

        Calculator calculator = container.getBean("calculator", Calculator.class);
        System.out.println(calculator.getTotalCost(City.FAIRFAX));

    }

}
