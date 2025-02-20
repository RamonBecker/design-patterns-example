package org.patterns.creational.example_factory.dbadapter.factory;


import org.patterns.creational.example_factory.dbadapter.db.DB;
import org.patterns.creational.example_factory.dbadapter.db.PostgresDB;

public class PostgresFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new PostgresDB();
	}




}
