package com.example.collections.custom;

import java.util.ArrayList;

public class EmpList {
    public static void main(String[] args) {
        // create ArrayList of Employees
        ArrayList<Employee> employees = new ArrayList<>();

        // add employees to list
        employees.add(new Employee(100, "John", "Sales", 6766f));
        employees.add(new Employee(101, "Alex", "Mktg", 476f));
        employees.add(new Employee(102, "Bill", "Admin", 276f));
        employees.add(new Employee(103, "Sara", "IT", 8976f));

        // print the employees
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

}
