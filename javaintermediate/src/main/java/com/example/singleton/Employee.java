package com.example.singleton;

public class Employee {
    // Singleton class
    private static Employee instance;

    private int id;
    private String name;

    // when a class is singleton the constructor is private
    private Employee() {
        id = 1; // static dummy data
        name = "John"; // static dummy data
    }

    public static Employee getInstance() {
        if (instance == null) {
            instance = new Employee();
        }

        return instance;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }

}
