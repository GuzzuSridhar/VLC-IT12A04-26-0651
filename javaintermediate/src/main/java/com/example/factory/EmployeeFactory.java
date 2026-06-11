package com.example.factory;

public class EmployeeFactory {
    public static Employee createEmployee(String type) {
        if (type == null) {
            throw new IllegalArgumentException("The type cannot be null.");
        }

        switch (type.toLowerCase()) {

            case "developer":
                return new Developer();

            case "manager":
                return new Manager();

            default:
                throw new IllegalArgumentException("Inavid type");
        }
    }

}
