package com.example.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.example.jdbc.singleton.DatabaseConnection;

public class SelectToList {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        try {
            DatabaseConnection db = DatabaseConnection.getInstance();
            Connection con = db.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from emp");

            while (rs.next()) {
                employees.add(new Employee(rs.getInt("emp_id"), rs.getString(2)));
            }

            rs.close();
            stmt.close();
            con.close();

            // read the table data from the local arraylist

            for (Employee employee : employees) {
                System.out.println(employee);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
