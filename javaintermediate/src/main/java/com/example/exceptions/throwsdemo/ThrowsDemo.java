package com.example.exceptions.throwsdemo;

public class ThrowsDemo {

    public static void main(String[] args) throws ArithmeticException { // by adding the throws in the main method we
                                                                        // acknowdge that the error is not handled (last
                                                                        // level of propogation)
        int i = 10, j = 0;
        // we can handle the exception raised by the called method here

        System.out.println(calculator(i, j));
    }

    public static int divide(int i, int j) throws ArithmeticException {
        // we can handle the runtime error by enclosing the below statement in try/catch
        // propogate the error handing to the calling method
        return i / j;
    }

    public static int calculator(int i, int j) throws ArithmeticException {
        // we can handle the exception by enclosing the below statement in try/catch
        return divide(i, j);
    }

}