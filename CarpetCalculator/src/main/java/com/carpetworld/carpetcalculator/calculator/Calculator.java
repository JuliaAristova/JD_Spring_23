package com.carpetworld.carpetcalculator.calculator;

import com.carpetworld.carpetcalculator.enums.City;
import com.carpetworld.carpetcalculator.interfaces.carpetPrices.Carpet;
import com.carpetworld.carpetcalculator.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Calculator {
    @Autowired
    @Qualifier("carpetVA")
    private Carpet carpet;
    @Autowired
    @Qualifier("bedroom")
    private Floor floor;

    public String getTotalCost(City city) throws Exception {
        BigDecimal cost = carpet.getSqFtPrice(city).multiply(floor.getArea());

        if (cost.compareTo(BigDecimal.ZERO) == 0)
            throw new Exception("This city does not exist");
        return "Total cost for carpet: " + cost;
    }


}
