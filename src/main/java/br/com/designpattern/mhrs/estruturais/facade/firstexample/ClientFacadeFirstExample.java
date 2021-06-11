package br.com.designpattern.mhrs.estruturais.facade.firstexample;

import br.com.designpattern.mhrs.estruturais.facade.firstexample.facade.CallCenterFacade;
import br.com.designpattern.mhrs.estruturais.facade.firstexample.model.Card;
import lombok.extern.slf4j.Slf4j;

/**
 * Facade - Oferecer uma interface única para um conjunto de interfaces de um subsistema. Façade define uma interface de nível mais elevado que torna o subsistema mais fácil de usar.
 * */
@Slf4j
public class ClientFacadeFirstExample {
	
	public static void main(String[] args) {
		CallCenterFacade facade = new CallCenterFacade();
		
		Card card = facade.getCardByUser(123456L);
		log.info(card.toString());
		
		facade.getSumary(card);
		
		facade.getPaymentInfoByCard(card);
		
		facade.cancelLastRegister(card);
		
		Card newCard = facade.getCardByUser(123456L);
		log.info(newCard.toString());
	}

}
