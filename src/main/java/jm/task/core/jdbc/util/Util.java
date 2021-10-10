package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    public static Connection getConnection() {
        Connection connection = null;
        String url = "jdbc:mysql://localhost:3306/jmdb";
        String username = "dan";
        String password = "default";
        String driver = "com.mysql.cj.jdbc.Driver";

        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, password);
        } catch(ClassNotFoundException e) {
            System.err.println("Driver load failed.");
        } catch(SQLException e) {
            System.err.println("SQL connection failed.");
        }
        return connection;
    }

}
