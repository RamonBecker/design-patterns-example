package org.patterns.creational.dbadapter.factory;


import org.patterns.creational.dbadapter.db.DB;
import org.patterns.creational.dbadapter.db.OracleDB;

public class OracleFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new OracleDB();
	}

}
