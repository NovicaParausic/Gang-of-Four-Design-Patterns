package com.structural.facade.example1;

public class OrederServiceFacedeImpl implements OrederServiceFacade {

	@Override
	public boolean placeOrder(int productId) {
		boolean orderFulfilled = false;
		Product product = new Product();
		product.setProductId(productId);
		
		if (InventroyService.isAvailable(product)) {
			System.out.println("Product with ID: " + product.getProductId() + " is available");
			boolean paymentConfirmed = PaymentService.makePayment();
			if (paymentConfirmed) {
				System.out.println("Payment confirmed");
				ShippingService.shipProduct(product);
				System.out.println("Product shipped");
				orderFulfilled = true;
			}
		}
		return orderFulfilled;
	}

}
