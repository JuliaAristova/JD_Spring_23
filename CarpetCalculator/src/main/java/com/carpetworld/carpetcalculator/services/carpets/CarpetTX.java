package com.carpetworld.carpetcalculator.services.carpets;

import com.carpetworld.carpetcalculator.enums.City;
import com.carpetworld.carpetcalculator.interfaces.carpetPrices.Carpet;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class CarpetTX implements Carpet {

    private static final Map<City, BigDecimal> sqFtPriceForCity = new HashMap<>();

    //will generate data
    static {
        sqFtPriceForCity.put(City.AUSTIN, new BigDecimal("2.43"));
        sqFtPriceForCity.put(City.DULLES, new BigDecimal(2.54));
        sqFtPriceForCity.put(City.SAN_ANTONIO, new BigDecimal(2.12));
    }

    @Override
    public BigDecimal getSqFtPrice(City city) {
        BigDecimal defaultValue = BigDecimal.ZERO;

        //to use stream we convert map to set
        //we compare objects ==> ==
        //optional to avoid null pointer exception - if city does nt exist - default value will be returned
        Optional<Map.Entry<City, BigDecimal>> collect = sqFtPriceForCity.entrySet().stream().filter(c -> c.getKey() == city).findFirst();

        return (collect.isPresent()) ? collect.get().getValue() : defaultValue;
    }
}
