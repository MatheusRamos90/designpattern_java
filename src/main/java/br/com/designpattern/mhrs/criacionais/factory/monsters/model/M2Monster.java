package br.com.designpattern.mhrs.criacionais.factory.monsters.model;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class M2Monster extends Monster {

	@Override
	public void showInformations() {
		log.info("Monster 02");
		log.info("-> Shield 110");
		log.info("-> Damage 50");
	}

}
