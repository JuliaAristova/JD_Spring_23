package com.carpetworld.carpetcalculator.interfaces.carpetPrices;

import com.carpetworld.carpetcalculator.enums.City;

import java.math.BigDecimal;

//price per sq.ft price depends on city
public interface Carpet {

//BigDecimal often use in financial cpmpanies where calculations are involved
   BigDecimal getSqFtPrice(City city);
}
