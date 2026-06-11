package com.example.jdbc.preparedstatements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.example.jdbc.singleton.DatabaseConnection;

public class DeleteRecords {
    public static void main(String[] args) {
        try {
            // get the singleton connection
            DatabaseConnection db = DatabaseConnection.getInstance();
            Connection con = db.getConnection();
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter Employee number: ");
            int eno = scan.nextInt();
            scan.nextLine();
            scan.close();

            PreparedStatement stmt = con.prepareStatement("delete from emp where emp_id = ?");
            stmt.setInt(1, eno);
            int rows = stmt.executeUpdate();
            System.out.println(rows + " rows deleted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
