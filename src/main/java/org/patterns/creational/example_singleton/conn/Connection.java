package org.patterns.creational.example_singleton.conn;

public class Connection {
    private boolean inUse;

    public Connection() {
        inUse = false;
    }

    public void query(String sql) {
        System.out.println("Running '" + sql + "' in Connection " + this);
    }

    boolean isInUse() {
        return inUse;
    }

    void setInUse(boolean status) {
        inUse = status;
    }
}
