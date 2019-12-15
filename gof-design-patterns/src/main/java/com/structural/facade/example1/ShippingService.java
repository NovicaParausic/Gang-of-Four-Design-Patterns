package com.structural.facade.example1;

public class ShippingService {

	public static void shipProduct(Product product) {
		//connect with external shipment service to ship product
		System.out.println("Shipping product");
	}
}
