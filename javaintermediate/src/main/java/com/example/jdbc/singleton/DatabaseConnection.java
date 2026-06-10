package com.example.jdbc.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    /*
     * creation of a singleton instance
     * every connection called will return the same connection and not create a new
     * one.
     */

    // Private static Instance of the same class
    private static DatabaseConnection instance;
    private Connection connection;

    // Database URL, username and password
    private static final String URL = "jdbc:mysql://localhost:3306/practice";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "pass";

    // private constructor to prevent instantiation of this class from other classes
    private DatabaseConnection() throws SQLException {
        this.connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    // public static method to provide the single instance
    public static DatabaseConnection getInstance() throws SQLException {
        if (instance == null) {
            instance = new DatabaseConnection();
        } else if (instance.getConnection().isClosed()) {
            instance = new DatabaseConnection();
        }

        return instance;

    }

    // Getter for the connection
    public Connection getConnection() {
        return connection;
    }

}
