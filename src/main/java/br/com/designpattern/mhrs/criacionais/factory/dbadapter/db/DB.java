package br.com.designpattern.mhrs.criacionais.factory.dbadapter.db;

public interface DB {
	
	void insert(String sql);
	void delete(String sql);
	
}
