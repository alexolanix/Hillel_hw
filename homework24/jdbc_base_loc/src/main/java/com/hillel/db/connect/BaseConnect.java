package com.hillel.db.connect;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class BaseConnect {
    public static Connection getConnection() throws SQLException {

        Context envCtx;
        DataSource ds = null;
        try {
            envCtx = (Context) new InitialContext().lookup("java:comp/env");
            ds = (DataSource) envCtx.lookup("jdbc/jdbc_base");
        } catch (NamingException e) {
            e.printStackTrace();
        }

        return ds.getConnection();
    }
}
