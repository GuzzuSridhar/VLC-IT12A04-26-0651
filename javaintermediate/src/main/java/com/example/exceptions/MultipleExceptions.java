package com.example.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptions {

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
        } catch (ArithmeticException | InputMismatchException e) { // multi catch
            // catch (ArithmeticException r) {
            // System.out.println(r.getMessage());
            // } catch (InputMismatchException e) {
            // System.out.println(e.getMessage());
            // }

        } finally {
            scan.close(); // closing the scanner
            System.out.println("Finally executed");
        }
        System.out.println("Done with the operation and print");
    }

    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
