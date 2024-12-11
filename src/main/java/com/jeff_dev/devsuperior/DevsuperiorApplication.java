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
		
		System.out.println();
		//pedido1
		System.out.println("## Pedido 1 ##");
		Order order1 = new Order("1034", new BigDecimal(150),20);
		var calc1= orderService.calc(order1);
		
		System.out.println("Pedido código "+ calc1.code());
		System.out.println("Valor total: R$ "+ calc1.totalValue());
		System.out.println();
		
		//pedido2
		System.out.println("## Pedido 2 ##");
		Order order2 = new Order("2282", new BigDecimal(800),10);
		var calc2= orderService.calc(order2);
		
		System.out.println("Pedido código "+ calc2.code());
		System.out.println("Valor total: R$ "+ calc2.totalValue());
		System.out.println();
		
		//pedido3
		System.out.println("## Pedido 3 ##");
		Order order3 = new Order("1309", new BigDecimal(95.90),0);
		var calc3= orderService.calc(order3);
		
		System.out.println("Pedido código "+ calc3.code());
		System.out.printf("Valor total: R$ %.2f%n", calc3.totalValue());
		System.out.println();
		
		

	}
}
