package br.com.designpattern.mhrs.criacionais.builders.functional;

import java.util.UUID;

import br.com.designpattern.mhrs.criacionais.builders.functional.model.Car;
import lombok.extern.slf4j.Slf4j;

/**
 * Builder - Separar a construção de um objeto complexo de sua representação para que o mesmo processo de construção possa criar representações diferentes.
 * */
@Slf4j
public class ClientFunctionalBuilder {
	
	public static void main(String[] args) {
		Car car1 = new Car.Builder(UUID.randomUUID().toString())
				.build();
		log.info(car1.toString());
		
		Car car2 = new Car.Builder(UUID.randomUUID().toString())
				.model("Mercedes")
				.price(25900.55)
				.isPaid(Boolean.TRUE)
				.build();
		log.info(car2.toString());
	}

}
