package br.com.designpattern.mhrs.criacionais.abstractfactory.service.services;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LevelAPIService implements LevelService {

	@Override
	public void start() {
		log.info("Starting level...");
	}

}
