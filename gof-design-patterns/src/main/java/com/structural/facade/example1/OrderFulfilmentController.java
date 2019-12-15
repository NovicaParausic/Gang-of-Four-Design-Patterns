package com.structural.facade.example1;

public class OrderFulfilmentController {

	OrederServiceFacade facade;
	boolean orderFulfiled = false;
	
	public void orderProduct(int productId) {
		orderFulfiled = facade.placeOrder(productId);
		System.out.println("OrderFulfilmentController fulfilment : " + orderFulfiled);
	}
}
