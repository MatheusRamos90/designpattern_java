package br.com.designpattern.mhrs.estruturais.decorator.model;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Tea implements Drink {

	@Override
	public void serve() {
		log.info("- Adding 100ml of tea");
	}

	@Override
	public Double getPrice() {
		return 1d;
	}
	
}
