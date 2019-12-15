package com.behavioral.templatemethod.example1;

public class WebOrder extends OrderTemplate {

	@Override
	public void doCheckout() {
		System.out.println("Get items from cart");
		System.out.println("Set gifts preferences");
		System.out.println("Set delivaery address");
		System.out.println("Set billing address");
	}

	@Override
	public void doPayment() {
		System.out.println("Process payment without card present");
	}

	@Override
	public void doReceipt() {
		System.out.println("Email receipt");
	}

	@Override
	public void doDelivery() {
		System.out.println("Ship the item to address");
	}

}
