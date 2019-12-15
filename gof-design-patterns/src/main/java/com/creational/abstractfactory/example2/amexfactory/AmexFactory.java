package com.creational.abstractfactory.example2.amexfactory;

import com.creational.abstractfactory.example2.CardType;
import com.creational.abstractfactory.example2.CreditCard;
import com.creational.abstractfactory.example2.CreditCardFactory;
import com.creational.abstractfactory.example2.Validator;

public class AmexFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {
		case GOLD:
			return new AmexGoldCreditCard();
		case PLATINUM:
			return new AmexPlatinumCreditCard();
		}
		return null;
	}

	@Override
	public Validator getValidator(CardType cardType) {
		switch (cardType) {
		case GOLD:
			return new AmexGoldValidator();
		case PLATINUM:
			return new AmexPlatinumValidator();
		}
		return null;
	}

}
