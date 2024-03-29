package com.creational.prototype.shallowprototype;

public class ShallowPrototypeDemo {

	public static void main(String[] args) {
		ComplexObject complexObject = 
				new ComplexObject(123, "John", new Record());
		System.out.println("Complex object: " + complexObject);
		
		ComplexObject clone = complexObject.clone();
		System.out.println("Clone: " + clone);
		System.out.println("Record: " + clone.getRecord());
	}

}
