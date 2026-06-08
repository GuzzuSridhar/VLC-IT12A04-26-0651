package com.example.collections.custom;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DynamicList {
    // static resources for the Application
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    public static void addEmp() {
        // variables for emp data
        int id = 0;
        String name, dept, next = "y";
        float sal = 0;
        Employee emp;

        // variable for validation
        boolean isValid = false;

        // adding employees
        while (next.equalsIgnoreCase("y")) {
            while (!isValid) {
                System.out.print("Enter Employee Number: ");
                try {
                    id = scan.nextInt();
                    scan.nextLine();
                    isValid = true;
                } catch (InputMismatchException i) {
                    System.out.print("Invalid Employee ID, Please enter a number: ");
                    scan.nextLine();
                }
            }
            // reset the isValid to False
            isValid = false;

            // asking for Employee name

            System.out.print("Enter Employee Name: ");
            name = scan.nextLine();

            // asking for employee department
            System.out.print("Enter Employee Department: ");
            dept = scan.nextLine();

            // ask for salary and validate
            while (!isValid) {
                System.out.print("Enter Employee Salary: ");
                try {
                    sal = scan.nextFloat();
                    scan.nextLine();
                    isValid = true;
                } catch (InputMismatchException i) {
                    System.out.print("Invalid Salary, Please enter a number: ");
                    scan.nextLine();
                }
            }

            // reset the isValid to False
            isValid = false;

            // create employee object
            emp = new Employee(id, name, dept, sal);
            employees.add(emp);

            System.out.println("Employee Added Successfully");

            System.out.println("Do you want to enter another employee record? (y/n):");
            next = scan.nextLine();
        }
    }

    public static void showEmployees() {
        System.out.println("--------------Employee List---------------");
        for (Employee e : employees) {
            System.out.println(e.getEid() + " " + e.getName() + " " + e.getDept() + " " + e.getSal());
        }
        System.out.println("--------------Employee List---------------");
    }

    public static void menu() {
        int choice = 1;
        boolean isValid = false;
        while (choice != 0) {
            while (!isValid) {
                try {
                    System.out.print("\u001B[32m" + " | 1. Add Employees:" + "\u001B[0m");
                    System.out.print("\u001B[33m" + " | 2. View Employees:" + "\u001B[0m");
                    System.out.print("\u001B[31m" + " | 0. Exit Application: |" + "\u001B[0m");
                    System.out.print("\nEnter your choice:");
                    choice = scan.nextInt();
                    scan.nextLine();
                    isValid = true;
                } catch (InputMismatchException i) {
                    System.out.println("Invalid Entry");
                    scan.nextLine();
                }
            }
            isValid = false;

            if (choice == 1)
                addEmp();
            else if (choice == 2)
                showEmployees();
            else if (choice == 0)
                System.exit(0);
            else
                menu();
        }
    }
}
