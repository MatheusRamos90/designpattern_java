package br.com.designpattern.mhrs.estruturais.bridge.services;

import br.com.designpattern.mhrs.estruturais.bridge.dao.UserDao;
import br.com.designpattern.mhrs.estruturais.bridge.model.User;

public abstract class UserService {
	protected UserDao dao;

	UserService(UserDao dao) {
		this.dao = dao;
	}
	
	public abstract void save(User user);
}
