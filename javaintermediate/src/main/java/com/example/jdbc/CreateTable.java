package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "pass");) {
            Statement stmt = con.createStatement();
            String sql = "create table emp("
                    + "emp_id int ,"
                    + " emp_name varchar(50))";
            stmt.execute(sql);
            System.out.println("Table Created");
        } catch (SQLException e) {
            e.getMessage();
        }
    }
}
