package com.example.jdbc.preparedstatements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.example.jdbc.singleton.DatabaseConnection;

public class InsertRecords {
    public static void main(String[] args) {
        try {
            // get the singleton connection
            DatabaseConnection db = DatabaseConnection.getInstance();
            Connection con = db.getConnection();
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter Employee number: ");
            int eno = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter Employee name: ");
            String ename = scan.nextLine();
            scan.close();

            PreparedStatement stmt = con.prepareStatement("insert into emp(emp_id,emp_name) values(?,?) ");
            stmt.setInt(1, eno);
            stmt.setString(2, ename);
            int rows = stmt.executeUpdate();
            System.out.println(rows + " rows inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
