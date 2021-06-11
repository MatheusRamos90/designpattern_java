package br.com.designpattern.mhrs.criacionais.factory.dbadapter.db;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PostgresDB implements DB {

	@Override
	public void insert(String sql) {
		log.info("Query... Postgres \n".concat(sql));	
	}

	@Override
	public void delete(String sql) {
		log.info("Query... Postgres \n".concat(sql)); 		
	}

}
