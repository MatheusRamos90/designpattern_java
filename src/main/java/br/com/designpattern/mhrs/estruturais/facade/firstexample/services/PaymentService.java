package br.com.designpattern.mhrs.estruturais.facade.firstexample.services;

import java.util.List;

import br.com.designpattern.mhrs.estruturais.facade.firstexample.model.Card;
import br.com.designpattern.mhrs.estruturais.facade.firstexample.model.Register;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PaymentService {
	private RegisterService registerService;
	
	public PaymentService(RegisterService registerService) {
		this.registerService = registerService;
	}

	public void getPaymentInfoByCard(Card card) {
		List<Register> registers = registerService.getRegistersByCard(card);
		double sum = registers.stream()
				.reduce(0d, (partialValue, reg) -> partialValue + reg.getValue(), Double::sum);
		log.info(String.format("You have to pay %.2f until next week", sum));
	}
}
