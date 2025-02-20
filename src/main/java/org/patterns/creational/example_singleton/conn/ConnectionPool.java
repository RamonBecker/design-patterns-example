package org.patterns.creational.example_singleton.conn;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ConnectionPool {
    private static ConnectionPool singleton = new ConnectionPool();
    public final static int POOL_SIZE = 2;
    private List<Connection> connectionsPool;

    public static ConnectionPool getInstance() {
        return singleton;
    }

    private ConnectionPool() {
        System.out.println("Creating Connection Pool");
        connectionsPool = new ArrayList<Connection>();

        for (int i = 0; i < POOL_SIZE; i++) {
            connectionsPool.add(new Connection());
        }
    }

    public Connection getConnection() {

        Optional<Connection> avaiable = connectionsPool.stream().filter(conn -> !conn.isInUse()).findFirst();

        if (avaiable.isEmpty()) {
            System.out.println("No Connections avaiable");
            return null;
        }

        Connection conn = avaiable.get();

        conn.setInUse(true);
        return conn;
    }

    public void leaveConnection(Connection conn) {
        conn.setInUse(false);
    }
}
