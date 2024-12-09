package com.jeff_dev.devsuperior.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;


@Service
public class ShippingService {


    public BigDecimal addingDeliveryValue(BigDecimal orderValue) {

        if (orderValue.compareTo(BigDecimal.valueOf(100)) < 0) {
            orderValue = orderValue.add(BigDecimal.valueOf(20));
        } else if (orderValue.compareTo(BigDecimal.valueOf(100)) >= 0 && orderValue.compareTo(BigDecimal.valueOf(200)) <= 0) {
            orderValue = orderValue.add(BigDecimal.valueOf(12));
        }

        return orderValue;
    }

}







