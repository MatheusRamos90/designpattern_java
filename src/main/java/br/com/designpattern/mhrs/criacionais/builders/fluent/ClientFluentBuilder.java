package br.com.designpattern.mhrs.criacionais.builders.fluent;

import java.util.UUID;

import br.com.designpattern.mhrs.criacionais.builders.fluent.builder.UserFluentBuilder;
import br.com.designpattern.mhrs.criacionais.builders.fluent.model.EnumGender;
import br.com.designpattern.mhrs.criacionais.builders.fluent.model.User;
import lombok.extern.slf4j.Slf4j;

/**
 * Builder - Separar a construção de um objeto complexo de sua representação para que o mesmo processo de construção possa criar representações diferentes.
 * */
@Slf4j
public class ClientFluentBuilder {

	public static void main(String[] args) {
		User user1 = new UserFluentBuilder()
				.builder(UUID.randomUUID().toString(), "David")
				.build();
		log.info(user1.toString());
		
		User user2 = new UserFluentBuilder()
				.builder(UUID.randomUUID().toString(), "Peter")
				.gender(EnumGender.MALE)
				.isAdult(Boolean.TRUE)
				.numberDocument("255856699874")
				.build();
		log.info(user2.toString());
	}
	
}
