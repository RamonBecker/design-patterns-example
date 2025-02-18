package org.patterns.creational.dbadapter.db;

public interface DB {
	void query(String sql);
	void update(String sql);
}
