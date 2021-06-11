package br.com.designpattern.mhrs.criacionais.factory.dbadapter.factory;

import br.com.designpattern.mhrs.criacionais.factory.dbadapter.db.DB;

public interface FactoryDB {

	DB getDatabase();
	
}
