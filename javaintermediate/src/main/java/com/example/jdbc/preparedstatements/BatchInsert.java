package com.example.jdbc.preparedstatements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.example.jdbc.singleton.DatabaseConnection;

public class BatchInsert {
    public static void main(String[] args) {
        try {
            // get the singleton connection
            DatabaseConnection db = DatabaseConnection.getInstance();
            Connection con = db.getConnection();

            PreparedStatement ps = con.prepareStatement("insert into emp(emp_id,emp_name) values(?,?) ");

            // insert multiple records with one execute

            // 1st Employee
            ps.setInt(1, 700);
            ps.setString(2, "xyz");
            ps.addBatch();

            // 2nd Employee
            ps.setInt(1, 701);
            ps.setString(2, "xyz");
            ps.addBatch();

            // 3rd Employee
            ps.setInt(1, 702);
            ps.setString(2, "xyz");
            ps.addBatch();

            int[] rows = ps.executeBatch();
            System.out.println(rows.length + " rows inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
