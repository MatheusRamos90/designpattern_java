package br.com.designpattern.mhrs.criacionais.factory.dbadapter.db;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OracleDB implements DB {

	@Override
	public void insert(String sql) {
		log.info("Query... Oracle \n".concat(sql));	
	}

	@Override
	public void delete(String sql) {
		log.info("Query... Oracle \n".concat(sql));	
	}	

}
