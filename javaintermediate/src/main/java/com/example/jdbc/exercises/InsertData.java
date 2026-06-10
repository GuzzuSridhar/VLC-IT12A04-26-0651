package com.example.jdbc.exercises;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertData {
    static Connection con = null;
    static String choice = "y";
    static Scanner scan = new Scanner(System.in);
    static Statement stmt = null;

    public static void main(String[] args) {
        con = connectDb();
        while (choice.equalsIgnoreCase("y")) {
            addEmployee();
        }
    }

    static void addEmployee() {
        System.out.println("enter Employee ID: ");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println("enter Employee Name: ");
        String name = scan.nextLine();

        System.out.println("Do you want to enter another employee ");
        choice = scan.next();
        scan.nextLine();

        try {
            stmt = con.createStatement();
            String sql = "insert into emp (emp_id,emp_name) values (" + id + ",'" + name + "'" + ")";
            int rows = stmt.executeUpdate(sql);
            System.out.println(rows + " Rows Inserted");
        } catch (SQLException e) {

        }
        try {
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static Connection connectDb() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "pass");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
}
