package br.com.designpattern.mhrs.estruturais.decorator.model;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExpressCoffee implements Drink {

	@Override
	public void serve() {
		log.info("- Adding 50ml of express coffee");
	}

	@Override
	public Double getPrice() {
		return 1.5d;
	}
	
}
