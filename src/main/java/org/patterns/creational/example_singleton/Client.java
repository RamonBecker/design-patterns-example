package org.patterns.creational.example_singleton;


import org.patterns.creational.example_singleton.conn.Connection;
import org.patterns.creational.example_singleton.conn.ConnectionPool;

public class Client {

    public static void doQuery() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();

        if (conn != null)
            conn.query("SELECT * FROM A1");
    }


    public static void main(String[] args) throws InterruptedException {
        System.out.println("Connection Pool Size: " + ConnectionPool.POOL_SIZE);
        int pool = ConnectionPool.POOL_SIZE;
        System.out.println(pool);
        doQuery();
    }
}
