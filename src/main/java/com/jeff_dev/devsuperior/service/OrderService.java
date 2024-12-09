package com.jeff_dev.devsuperior.service;

import com.jeff_dev.devsuperior.model.Order;
import com.jeff_dev.devsuperior.model.OrderOutPut;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class OrderService {

    private final ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public OrderOutPut calc(Order order) {
        var orderValue = applyingDiscount(order);
        var totalValue = shippingService.addingDeliveryValue(orderValue);
        return new OrderOutPut(order.code(), totalValue);
    }

    private BigDecimal applyingDiscount(Order order) {
        BigDecimal discountPercent = BigDecimal.valueOf(order.discount()).divide(BigDecimal.valueOf(100));
        BigDecimal discountValue = order.basicValue().multiply(discountPercent);
        return order.basicValue().subtract(discountValue);
    }


}
