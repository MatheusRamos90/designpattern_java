package br.com.designpattern.mhrs.estruturais.bridge.services;

import br.com.designpattern.mhrs.estruturais.bridge.dao.UserDao;
import br.com.designpattern.mhrs.estruturais.bridge.model.User;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserEJB extends UserService {
	public UserEJB(UserDao dao) {
		super(dao);
	}

	@Override
	public void save(User user) {
		log.info("Starting a save operation through EJB Protocol!");
		dao.save(user);
	}
}
