package com.aysuu.desafio1.services;

import org.springframework.stereotype.Service;

import com.aysuu.desafio1.entities.Order;

@Service
public class ShippingService {
	
	double totalShippimentOrder ; 
	
	public double shipment(Order order) {
		
		if(order.getBasic()<100.00) {
			totalShippimentOrder = 20.00;
			return totalShippimentOrder;
		}
		
		if(100.00 <=order.getBasic() && order.getBasic() < 200.00) {
			totalShippimentOrder = 12.00;
			return totalShippimentOrder;
		}
		
		if(order.getBasic() >= 200.00) {
			totalShippimentOrder = 00.00;
			return totalShippimentOrder;
		}
		return totalShippimentOrder;

			
	}
}
