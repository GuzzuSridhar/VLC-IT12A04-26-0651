package com.example.jdbc.preparedstatements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.example.jdbc.singleton.DatabaseConnection;

public class SelectRecords {
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

            PreparedStatement stmt = con.prepareStatement("select * from emp where emp_id = ? or emp_name=?");
            stmt.setInt(1, eno);
            stmt.setString(2, ename);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("emp_id")
                        + " - "
                        + rs.getString("emp_name")
                        + " - "
                        + rs.getDate("doj"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
