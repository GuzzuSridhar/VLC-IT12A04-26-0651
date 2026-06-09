package com.example.generics.interfaces.custom;

// Functional Interface
// only one method allowed
// validated with a @FunctionalInterface annotation

@FunctionalInterface
public interface Calculator<P> {
    P operation(P n1, P n2);
    // P add(P n1, P n2); // not allowed
}
