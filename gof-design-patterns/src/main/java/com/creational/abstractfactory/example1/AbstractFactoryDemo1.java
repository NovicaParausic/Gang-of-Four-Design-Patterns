package com.creational.abstractfactory.example1;

import com.creational.abstractfactory.example1.teddyfactory.TeddyToyFactory;
import com.creational.abstractfactory.example1.woodenfactory.WoodenToyFactory;

public class AbstractFactoryDemo1 {

	public static void main(String[] args) {
		
		ToyFactory teddyToyFactory = new TeddyToyFactory();
		ToyFactory woodenToyFactory = new WoodenToyFactory();
		
		Bear teddyBear = teddyToyFactory.getBear();
		Cat teddyCat = teddyToyFactory.getCat();
		
		System.out.println("I've got " + teddyBear.getName() 
							+ " and " + teddyCat.getName());
		
		Bear woodenBear = woodenToyFactory.getBear();
		Cat woodenCat = woodenToyFactory.getCat();
		
		System.out.println("I've got " + woodenBear.getName() 
		+ " and " + woodenCat.getName());
	}
}
