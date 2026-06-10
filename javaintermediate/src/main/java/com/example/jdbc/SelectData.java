package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectData {
    public static void main(String[] args) {
        int rows = 0;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "pass");
            assert con != null;
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from emp");
            while (rs.next()) {
                System.out.println(
                        rs.getInt(1)
                                + " "
                                + rs.getString("emp_name"));
                rows++;
            }
        } catch (SQLException e) {

        }
        System.out.println(rows + " Rows selected");
    }
}
