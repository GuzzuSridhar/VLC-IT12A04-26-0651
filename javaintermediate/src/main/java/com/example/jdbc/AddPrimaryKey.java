package com.example.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AddPrimaryKey {
    public static void main(String[] args) {
        try {
            Connection con = MyDatabase.getConnection();
            Statement stmt = con.createStatement();
            String sql = "alter table emp add primary key (emp_id)";
            stmt.execute(sql);
            System.out.println("Table Altered");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
