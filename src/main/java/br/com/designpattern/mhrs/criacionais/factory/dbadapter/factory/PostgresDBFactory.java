package br.com.designpattern.mhrs.criacionais.factory.dbadapter.factory;

import br.com.designpattern.mhrs.criacionais.factory.dbadapter.db.DB;
import br.com.designpattern.mhrs.criacionais.factory.dbadapter.db.PostgresDB;

public class PostgresDBFactory implements FactoryDB {

	@Override
	public DB getDatabase() {
		 return new PostgresDB();
	}

}
