package org.patterns.creational.example_factory.dbadapter.db;

public class OracleDB implements DB {

	public void query(String sql) {
		System.out.println("Querying " + sql + " in Oracle database");
	}
	
	public void update(String sql) {
		System.out.println("Uptade querry " + sql + " in Oracle database");
	}
}
