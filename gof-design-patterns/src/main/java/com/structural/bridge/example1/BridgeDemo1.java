package com.structural.bridge.example1;

public class BridgeDemo1 {

	public static void main(String[] args) {
		Color blue = new Blue();
		Shape square = new Square(blue);
		
		Color red = new Red();
		Shape circle = new Circle(red);
		
		square.applyColor();
		circle.applyColor();
		
		Color green = new Green();
		Shape greenCircle = new Circle(green);
		greenCircle.applyColor();
	}

}
