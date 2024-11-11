package com.desafio1.pedido;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.desafio1.pedido.entities.Order;
import com.desafio1.pedido.services.OrderService;

@SpringBootApplication
public class PedidoApplication implements CommandLineRunner {
	
	OrderService orderService;
	
	public PedidoApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(PedidoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order1 = new Order(1034, 150.0, 20.0);	
		Order order2 = new Order(2282, 800.0, 10.0);	
		Order order3 = new Order(1309, 95.90, 0.0);	

		System.out.println("Exemplo 1:");
		System.out.println("Pedido código: " + order1.getCode());
		System.out.println("Valor total: R$ " + orderService.total(order1));
		System.out.println();
		
		System.out.println("Exemplo 2:");
		System.out.println("Pedido código: " + order2.getCode());
		System.out.println("Valor total: R$ " + orderService.total(order2));
		System.out.println();
		
		System.out.println("Exemplo 3:");
		System.out.println("Pedido código: " + order3.getCode());
		System.out.println("Valor total: R$ " + orderService.total(order3));
		System.out.println();
	}

}
