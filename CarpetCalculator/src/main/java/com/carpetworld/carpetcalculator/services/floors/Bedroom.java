package com.carpetworld.carpetcalculator.services.floors;

import com.carpetworld.carpetcalculator.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Bedroom implements Floor {

    @Value("${width}")
    BigDecimal width;

    @Override
    public BigDecimal getArea() {
        return width.pow(2);
    }
}
