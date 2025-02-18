package org.patterns.creational.dbadapter;

import org.patterns.creational.dbadapter.db.DB;
import org.patterns.creational.dbadapter.factory.OracleFactory;

public class Client {
    public static void main(String[] args) {


        DB db = new OracleFactory().getDatabase();
        db.query("SELECT * FROM users");
        db.update("INSERT INTO users VALUES ('User', 25)");
    }
}
