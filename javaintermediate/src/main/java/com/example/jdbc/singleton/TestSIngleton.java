package com.example.jdbc.singleton;

import java.sql.SQLException;

public class TestSIngleton {
    public static void main(String[] args) {
        try {
            DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
            DatabaseConnection databaseConnection1 = DatabaseConnection.getInstance();

            // proof of singleton and both connections return the same instance (id)
            System.out.println(databaseConnection);
            System.out.println(databaseConnection1);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
