package com.hillel.db.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class BaseConnect {
    public static Connection getConnection() throws SQLException {

        String url = "jdbc:mysql://localhost:3306/mysql";

        Properties prop = new Properties();
        prop.put("user", "root");
        prop.put("password", "elenberg");
        prop.put("useSSL", "false");
        prop.put("serverTimezone", "UTC");
        prop.put("characterEncoding", "UTF-8");

        return DriverManager.getConnection(url, prop);
    }
}
