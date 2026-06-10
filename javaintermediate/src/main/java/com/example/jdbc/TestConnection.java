package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) {
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "pass");) {
            System.out.println("Connected to MySql");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
