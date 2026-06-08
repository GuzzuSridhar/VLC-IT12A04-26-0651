package com.example.exceptions.custom;

public class UseCustomException {
    public static void main(String[] args) {
        int age = 10;

        try {
            if (age < 18) {
                throw new MyException("Not Allowed as the age is less tha 18");
            }
        } catch (MyException myException) {
            System.out.println(myException.getMessage());
        }
    }

}
