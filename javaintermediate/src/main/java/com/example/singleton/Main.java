package com.example.singleton;

public class Main {
    public static void main(String[] args) {
        Employee e1 = Employee.getInstance();
        Employee e2 = Employee.getInstance();

        // proof of singleton
        System.out.println(e1);
        System.out.println(e1);

        System.out.println(e1 == e2);
    }
}
