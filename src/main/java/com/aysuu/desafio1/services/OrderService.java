package com.aysuu.desafio1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aysuu.desafio1.entities.Order;



@Service
public class OrderService {
	
	
	@Autowired
	private ShippingService shippingService;
	
	public double total(Order order) {
		
		double totalValueWithDiscount = order.getBasic()*(1 - (order.getDiscount()/100.0));
		double totalShippmentCost = shippingService.shipment(order);
		return totalValueWithDiscount + totalShippmentCost;
			
	}
	
	

}
