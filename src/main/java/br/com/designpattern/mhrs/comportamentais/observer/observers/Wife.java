package br.com.designpattern.mhrs.comportamentais.observer.observers;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Wife implements Observer {
	
	public void partyTime() {
		log.info("Let's Party! :D");
	}

	@Override
	public void update(boolean status) {
		if(status) {
			partyTime();
		} else {
			log.info("Hold!");
		}
	}
}
