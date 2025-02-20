package org.patterns.creational.example_factory.dbadapter.factory;


import org.patterns.creational.example_factory.dbadapter.db.DB;

public interface DBFactory {
	DB getDatabase();
}
