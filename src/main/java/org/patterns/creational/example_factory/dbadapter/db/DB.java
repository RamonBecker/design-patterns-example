package org.patterns.creational.example_factory.dbadapter.db;

public interface DB {
	void query(String sql);
	void update(String sql);
}
