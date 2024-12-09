package com.jeff_dev.devsuperior.model;

import java.math.BigDecimal;

public record Order(
        String code,
        BigDecimal basicValue,
        Integer discount

) {
}
