package com.behavioral.command.example2;

import java.util.ArrayList;
import java.util.List;

public class Broker {

	private List<Order> orderList = new ArrayList<>();
	
	public void takeOrder(Order order) {
		orderList.add(order);
	}
	
	public void placeOrders() {
		
		for (Order order : orderList) {
			order.execute();
		}
		orderList.clear();
	}
}
