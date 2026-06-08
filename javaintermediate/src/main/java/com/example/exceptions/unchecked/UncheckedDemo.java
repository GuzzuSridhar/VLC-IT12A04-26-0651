package com.example.exceptions.unchecked;

public class UncheckedDemo {
    public int divide(int i, int j) {
        return divide(i, j); // may raise an unchecked exception (Arithmetic exception)
    }
}

/*
 * Unchecked Exceptions
 * Arithmetic
 * Inputmissmatch
 * ArrayIndex
 * StringIndex
 * 
 */
