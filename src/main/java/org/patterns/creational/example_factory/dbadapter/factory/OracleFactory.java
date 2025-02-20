package org.patterns.creational.example_factory.dbadapter.factory;


import org.patterns.creational.example_factory.dbadapter.db.DB;
import org.patterns.creational.example_factory.dbadapter.db.OracleDB;

public class OracleFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new OracleDB();
	}

}
