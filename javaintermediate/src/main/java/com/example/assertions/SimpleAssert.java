package com.example.assertions;

import java.util.Scanner;

public class SimpleAssert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you age: ");
        // input.nextLine();
        int age = input.nextInt();

        assert age > 18 : "Age is less than 18";
        System.out.println("You are " + age + " years old");
        input.close();
    }

}

// Assertion
/*
 * syntax
 * assert condition : "Error Message"
 * if the condition is false then the message is displayed
 * 
 * Assertions are disabled by default
 * have to be enabled at class level while tunning the class(java command)
 * to enable assertions
 * > java className -ea
 * 
 * Used as debug statements in code by developers
 */
