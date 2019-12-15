package com.behavioral.command.example2;

public class CommandPatternDemo2 {
 
	public static void main(String[] args) {
		Stock abcStock = new Stock();
		
		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);
		
		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);
		
		broker.placeOrders();
		
	}
}
