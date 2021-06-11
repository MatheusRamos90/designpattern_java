package br.com.designpattern.mhrs.estruturais.facade.isolated;

import br.com.designpattern.mhrs.estruturais.facade.isolated.facades.CallCenterFacade;
import br.com.designpattern.mhrs.estruturais.facade.isolated.facades.CallCenterNewCardFacade;
import lombok.extern.slf4j.Slf4j;

/**
 * Facade - Oferecer uma interface única para um conjunto de interfaces de um subsistema. Façade define uma interface de nível mais elevado que torna o subsistema mais fácil de usar.
 * */
@Slf4j
public class IsolatedFacadeClient {
	
	public static void main(String[] args) {
		CallCenterFacade facade = new CallCenterFacade();
		CallCenterNewCardFacade newFacade = new CallCenterNewCardFacade();
		Long userNumber = 123456L;
		
		Long cardNumber = facade.getCardByUser(userNumber);
		log.info(cardNumber.toString());
		
		facade.getSumary(cardNumber);
		 
		facade.getPaymentInfoByCard(cardNumber);
		
		newFacade.cancelLastRegister(userNumber);
		
		Long newCardNumber = facade.getCardByUser(userNumber);
		log.info(newCardNumber.toString());
		
		newFacade.orderNewCard(userNumber);
		Long newNewCardNumber = facade.getCardByUser(userNumber);
		log.info(newNewCardNumber.toString());
	}

}
