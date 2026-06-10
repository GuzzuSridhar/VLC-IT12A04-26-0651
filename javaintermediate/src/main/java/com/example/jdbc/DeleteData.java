package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {
    public static void main(String[] args) {
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "pass");) {
            Statement stmt = con.createStatement();
            String sql = "delete from emp where emp_id = 100";
            int res = stmt.executeUpdate(sql);
            System.out.println(res + " rows deleted");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
