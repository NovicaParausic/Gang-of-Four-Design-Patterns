package com.creational.abstractfactory.example2.amexfactory;

import com.creational.abstractfactory.example2.CreditCard;
import com.creational.abstractfactory.example2.Validator;

public class AmexPlatinumValidator implements Validator{

	@Override
	public boolean iiValid(CreditCard creditCard) {
		return false;
	}

}
