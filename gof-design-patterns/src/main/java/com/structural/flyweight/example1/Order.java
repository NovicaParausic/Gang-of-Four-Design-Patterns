package com.structural.flyweight.example1;

public class Order {

	private final int orderNumeber;
	private final Item item;

	public Order(int orderNumeber, Item item) {
		this.orderNumeber = orderNumeber;
		this.item = item;
	}
	
	void processOrder() {
		System.out.println("Ordering " + item + " for order number: " +orderNumeber);
	}
}
