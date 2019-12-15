package com.behavioral.command.example2;

public class SellStock implements Order {
	
	private Stock abcStock;
	
	public SellStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	@Override
	public void execute() {
		abcStock.sell();
	}

}
