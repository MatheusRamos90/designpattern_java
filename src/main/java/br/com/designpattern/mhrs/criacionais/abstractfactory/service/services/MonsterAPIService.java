package br.com.designpattern.mhrs.criacionais.abstractfactory.service.services;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MonsterAPIService implements MonsterService {

	@Override
	public void create(String name) {
		log.info("Creating monstes with name ".concat(name));
	}

	@Override
	public void showInformations() {
		log.info("Show monster's informations...");
	}

}
