package com.aysuu.desafio1;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aysuu.desafio1.entities.Order;
import com.aysuu.desafio1.services.OrderService;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {
	
	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		int code;
		double basic;
		double discount;
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
						
		System.out.print( "Digite o codigo do pedido:");
		code = sc.nextInt();
		
		System.out.print( "Digite o valor basico do pedido:");
		basic = sc.nextDouble(); //150.00;
		
					
		System.out.print( "Digite o valor de porcentagem de desconto do pedido:");
		discount = sc.nextDouble(); //discount = 20;
		
		sc.close();
		
		Order order = new Order(code, basic, discount);
		
		System.out.println("Pedido Código: " + code);
		
		double totaOrderCost = orderService.total(order);
		
		System.out.println("Valor total: " + totaOrderCost);
		
	}
	
}
