package br.com.designpattern.mhrs.criacionais.factory.monsters.model;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class M1Monster extends Monster {

	@Override
	public void showInformations() {
		log.info("Monster 01");
		log.info("-> Shield 150");
		log.info("-> Damage 260");
	}

}
