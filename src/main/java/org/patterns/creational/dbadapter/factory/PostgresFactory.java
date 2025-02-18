package org.patterns.creational.dbadapter.factory;


import org.patterns.creational.dbadapter.db.DB;
import org.patterns.creational.dbadapter.db.PostgresDB;

public class PostgresFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new PostgresDB();
	}




}
