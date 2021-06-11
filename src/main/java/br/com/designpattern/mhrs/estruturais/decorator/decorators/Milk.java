package br.com.designpattern.mhrs.estruturais.decorator.decorators;

import br.com.designpattern.mhrs.estruturais.decorator.model.Drink;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Milk extends DrinkDecorator {
	
	public Milk(Drink drink) {
		super(drink);
	}

	@Override
	public void serve() {
		drink.serve();
		log.info("- Adding 30ml of Milk");
	}

	@Override
	public Double getPrice() {
		return drink.getPrice() + 0.5d;
	}

}
