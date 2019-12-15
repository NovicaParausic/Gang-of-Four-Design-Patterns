package com.structural.facade.example1;

public class FacadeDemo1 {

	public static void main(String[] args) {
		OrderFulfilmentController controller = new OrderFulfilmentController();
		controller.facade = new OrederServiceFacedeImpl();
		controller.orderProduct(9);
		boolean result = controller.orderFulfiled;
		System.out.println(result);
			
		
	}
}
