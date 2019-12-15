package com.creational.abstractfactory.example1.teddyfactory;

import com.creational.abstractfactory.example1.Bear;
import com.creational.abstractfactory.example1.Cat;
import com.creational.abstractfactory.example1.ToyFactory;

public class TeddyToyFactory implements ToyFactory {

	@Override
	public Bear getBear() {
		return new TeddyBear();
	}

	@Override
	public Cat getCat() {
		return new TeddyCat();
	}

}
