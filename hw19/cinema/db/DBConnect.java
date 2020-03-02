package com.hillel.cinema.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    private final String url = "jdbc:mysql://localhost:3306/mysql";
    private final String USER = "root";
    private final String PASS = "elenberg";
    private Connection connection;

    public DBConnect() {
        try {
            connection = DriverManager.getConnection(url, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void close() {
        try {
            if (!connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
