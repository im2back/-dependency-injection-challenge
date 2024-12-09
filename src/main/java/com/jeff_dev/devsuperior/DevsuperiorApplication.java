package com.jeff_dev.devsuperior;

import com.jeff_dev.devsuperior.model.Order;
import com.jeff_dev.devsuperior.service.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class DevsuperiorApplication implements CommandLineRunner {

	private final 	OrderService orderService;

    public DevsuperiorApplication(OrderService orderService) {
        this.orderService = orderService;
    }

    public static void main(String[] args) {
		SpringApplication.run(DevsuperiorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Order order = new Order("1034", new BigDecimal(150),20);
		var result = orderService.calc(order);

		System.out.println("Code: "+result.code());
		System.out.println("Total Value: "+ result.totalValue());

	}
}
