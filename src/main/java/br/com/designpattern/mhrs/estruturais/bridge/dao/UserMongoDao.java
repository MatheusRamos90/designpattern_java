package br.com.designpattern.mhrs.estruturais.bridge.dao;

import br.com.designpattern.mhrs.estruturais.bridge.model.User;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserMongoDao implements UserDao {
	
	@Override
	public void save(User user) {
		log.info("Saving the user in the Mongo Database!");
	}

}
