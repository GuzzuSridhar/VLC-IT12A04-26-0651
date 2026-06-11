package com.example.factory;

public class Manager implements Employee {

    @Override
    public void work() {
        System.out.println("Manager Manages the team.");
    }

}
