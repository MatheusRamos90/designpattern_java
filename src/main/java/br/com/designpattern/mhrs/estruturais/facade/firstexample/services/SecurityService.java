package br.com.designpattern.mhrs.estruturais.facade.firstexample.services;

import java.util.List;

import br.com.designpattern.mhrs.estruturais.facade.firstexample.model.Card;
import br.com.designpattern.mhrs.estruturais.facade.firstexample.model.Register;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SecurityService {
	private CardService cardService;
	private RegisterService registerService;
	
	public SecurityService(CardService cardService, RegisterService registerService) {
		this.cardService = cardService;
		this.registerService = registerService;
	}

	public List<Register> blockCard(Card card) {
		log.info("Blocking card:" + card);
		List<Register> pendingRegistries = registerService.getRegistersByCard(card);
		cardService.removeCard(card);
		registerService.deleteCardRegistries(card);
		return pendingRegistries;
	}
}
