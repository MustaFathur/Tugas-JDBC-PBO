package com.pbo.fathur;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DatabaseUtil {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/pbo";
        String username = "root";
        String password = "";
        return DriverManager.getConnection(url, username, password);
    }
}
