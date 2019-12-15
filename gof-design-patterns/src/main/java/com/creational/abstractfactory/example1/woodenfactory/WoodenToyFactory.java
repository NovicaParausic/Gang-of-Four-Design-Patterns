package com.creational.abstractfactory.example1.woodenfactory;

import com.creational.abstractfactory.example1.Bear;
import com.creational.abstractfactory.example1.Cat;
import com.creational.abstractfactory.example1.ToyFactory;

public class WoodenToyFactory implements ToyFactory{

	@Override
	public Bear getBear() {
		return new WoodenBear();
	}

	@Override
	public Cat getCat() {
		return new WoodenCat();
	}

}
