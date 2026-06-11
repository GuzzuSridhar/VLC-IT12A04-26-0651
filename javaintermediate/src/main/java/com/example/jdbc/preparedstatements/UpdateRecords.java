package com.example.jdbc.preparedstatements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.example.jdbc.singleton.DatabaseConnection;

public class UpdateRecords {
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

            PreparedStatement stmt = con.prepareStatement("update emp set emp_name= ? where emp_id = ?");
            stmt.setInt(2, eno);
            stmt.setString(1, ename);
            int rows = stmt.executeUpdate();
            System.out.println(rows + " rows Updated");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
