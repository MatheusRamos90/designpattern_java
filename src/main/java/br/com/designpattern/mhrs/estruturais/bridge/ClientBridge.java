package br.com.designpattern.mhrs.estruturais.bridge;

import br.com.designpattern.mhrs.estruturais.bridge.dao.UserMongoDao;
import br.com.designpattern.mhrs.estruturais.bridge.dao.UserMysqlDao;
import br.com.designpattern.mhrs.estruturais.bridge.dao.UserOracleDao;
import br.com.designpattern.mhrs.estruturais.bridge.dao.UserPostgresDao;
import br.com.designpattern.mhrs.estruturais.bridge.model.User;
import br.com.designpattern.mhrs.estruturais.bridge.services.UserEJB;
import br.com.designpattern.mhrs.estruturais.bridge.services.UserRest;
import br.com.designpattern.mhrs.estruturais.bridge.services.UserService;
import br.com.designpattern.mhrs.estruturais.bridge.services.UserSoap;

public class ClientBridge {

	public static void main(String[] args) {
		User user = new User("user", "user@email.com", "passwd");

		UserService userRestOracleService = new UserRest(new UserOracleDao());
		userRestOracleService.save(user);

		UserService userEJBMongoService = new UserEJB(new UserMongoDao());
		userEJBMongoService.save(user);

		UserService userSoapPostgresService = new UserSoap(new UserPostgresDao());
		userSoapPostgresService.save(user);

		// .......

		UserService userRestMysqlService = new UserRest(new UserMysqlDao());
		userRestMysqlService.save(user);
	}

}
