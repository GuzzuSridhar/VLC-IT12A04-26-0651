package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDatabase {
    static Connection getConnection() {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/practice";
        String user = "root";
        String pwd = "pass";

        try {
            con = DriverManager.getConnection(url, user, pwd);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return con;
    }
}