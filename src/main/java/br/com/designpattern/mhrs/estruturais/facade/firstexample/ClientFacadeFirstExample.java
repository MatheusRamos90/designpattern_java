package br.com.designpattern.mhrs.estruturais.facade.firstexample;

import br.com.designpattern.mhrs.estruturais.facade.firstexample.facade.CallCenterFacade;
import br.com.designpattern.mhrs.estruturais.facade.firstexample.model.Card;
import lombok.extern.slf4j.Slf4j;

/**
 * Facade - Oferecer uma interface �nica para um conjunto de interfaces de um subsistema. Fa�ade define uma interface de n�vel mais elevado que torna o subsistema mais f�cil de usar.
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
