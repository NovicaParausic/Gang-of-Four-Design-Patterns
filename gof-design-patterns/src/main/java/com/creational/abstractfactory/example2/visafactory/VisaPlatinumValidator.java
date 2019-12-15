package com.creational.abstractfactory.example2.visafactory;

import com.creational.abstractfactory.example2.CreditCard;
import com.creational.abstractfactory.example2.Validator;

public class VisaPlatinumValidator implements Validator{

	@Override
	public boolean iiValid(CreditCard creditCard) {
		return false;
	}

}
