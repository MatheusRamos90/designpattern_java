package br.com.designpattern.mhrs.estruturais.bridge.services;

import br.com.designpattern.mhrs.estruturais.bridge.dao.UserDao;
import br.com.designpattern.mhrs.estruturais.bridge.model.User;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserRest extends UserService {
	
	public UserRest(UserDao dao) {
		super(dao);
	}

	@Override
	public void save(User user) {
		log.info("Starting a save operation through Rest Protocol!");
		dao.save(user);
	}

}
