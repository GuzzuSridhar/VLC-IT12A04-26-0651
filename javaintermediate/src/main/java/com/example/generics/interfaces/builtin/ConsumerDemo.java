package com.example.generics.interfaces.builtin;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> greet = user -> System.out.println("Hello " + user);
        greet.accept("Simon");

    }

    // imperative program
    public static void greet(String name) {
        System.out.println("Hello " + name);
    }
}
