package br.com.designpattern.mhrs.criacionais.factory.dbadapter;

import br.com.designpattern.mhrs.criacionais.factory.dbadapter.db.DB;
import br.com.designpattern.mhrs.criacionais.factory.dbadapter.factory.OracleDBFactory;
import br.com.designpattern.mhrs.criacionais.factory.dbadapter.factory.PostgresDBFactory;

public class ClientFactoryDB {
	
	public static void main(String[] args) {
		
		DB db1 = new PostgresDBFactory().getDatabase();
		db1.insert("INSERT postgres...Client");
		
		DB db2 = new OracleDBFactory().getDatabase();
		db2.insert("INSERT oracle...Client");
		
	}

}
