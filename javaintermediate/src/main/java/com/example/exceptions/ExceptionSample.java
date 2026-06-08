package com.example.exceptions;

import java.util.Scanner;

public class ExceptionSample {
    public static void main(String[] args) {
        int i = 10, j = 0, res = 0;
        Scanner scan = new Scanner(System.in);
        ;
        try {
            System.out.print("Enter the numerator: ");
            i = scan.nextInt();
            System.out.print("Enter the Denominator: ");
            j = scan.nextInt();
            res = divide(i, j);
            System.out.println(res);
        } catch (ArithmeticException r) {
            System.out.println(r.getMessage());
        } finally {
            // finally is executed in all cases (exception raised or not)
            // used to close connections to resources opened
            scan.close(); // closing the scanner
            System.out.println("Finally executed");
        }
        System.out.println("Done with the operation and print");
    }

    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
