package com.example.factory;

public class Main {
    public static void main(String[] args) {
        // getting objects from factory
        Employee e1 = EmployeeFactory.createEmployee("developer");
        Employee e2 = EmployeeFactory.createEmployee("manager");

        e1.work();
        e2.work();

    }
}
