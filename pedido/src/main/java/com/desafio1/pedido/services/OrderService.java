package com.desafio1.pedido.services;

import org.springframework.stereotype.Service;

import com.desafio1.pedido.entities.Order;

@Service
public class OrderService {
	
	//@Autowired
	private ShippingService shippingService;	
	
	public OrderService(ShippingService shippingService) {
		this.shippingService = shippingService;
	}

	public Double total(Order order) {				
		return this.shippingService.shipment(order) + order.getBasic() - (order.getBasic() * order.getDiscount());
	}
	
}
