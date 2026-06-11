package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
    public static void main(String[] args) {
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "pass");) {
            Statement stmt = con.createStatement();
            String sql = "insert into emp (emp_id,emp_name) values (112,'Bill')";
            int rows = stmt.executeUpdate(sql);
            System.out.println(rows + " Rows Inserted");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
