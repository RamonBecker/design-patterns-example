package org.patterns.creational.dbadapter.factory;


import org.patterns.creational.dbadapter.db.DB;

public interface DBFactory {
	DB getDatabase();
}
