package br.com.designpattern.mhrs.comportamentais.observer.observers;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Friend implements Observer {
	
	public void sendGift() {
		log.info("Look, I bought your favorite beer!");
	}

	@Override
	public void update(boolean status) {
		if(status) {
			sendGift();
		} else {
			log.info("Sleep...");
		}
	}
}
