package br.com.designpattern.mhrs.criacionais.factory.dbadapter.factory;

import br.com.designpattern.mhrs.criacionais.factory.dbadapter.db.DB;
import br.com.designpattern.mhrs.criacionais.factory.dbadapter.db.OracleDB;

public class OracleDBFactory implements FactoryDB {

	@Override
	public DB getDatabase() {
		return new OracleDB();
	}

}
