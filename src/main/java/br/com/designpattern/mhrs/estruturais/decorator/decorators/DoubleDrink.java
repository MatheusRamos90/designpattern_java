package br.com.designpattern.mhrs.estruturais.decorator.decorators;

import br.com.designpattern.mhrs.estruturais.decorator.model.Drink;

public class DoubleDrink extends DrinkDecorator {

	public DoubleDrink(Drink drink) {
		super(drink);
	}

	@Override
	public void serve() {
		drink.serve();
		drink.serve();
	}

	@Override
	public Double getPrice() {
		return drink.getPrice() * 1.75d;
	}
	
}
