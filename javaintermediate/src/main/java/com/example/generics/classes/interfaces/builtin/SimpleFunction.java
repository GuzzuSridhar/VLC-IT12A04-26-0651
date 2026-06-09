package com.example.generics.classes.interfaces.builtin;

import java.util.function.Function;

public class SimpleFunction {

    public static void main(String[] args) {
        // using imperative methods
        int resImp = incrementByOne(1); // 2
        System.out.println(resImp);

        // using functional methods
        System.out.println(addOne.apply(10)); // 11
        System.out.println(len.apply("Hello")); // 5
        System.out.println(up.apply("Hello")); // HELLO
    }

    // Imperative Method (traditional Java)
    static int incrementByOne(int num) {
        return num + 1;
    }

    // functional Method (Java 8+ functional java)
    // using the java.util.function.Function interface which accepts one arg and a
    // return type

    static Function<Integer, Integer> addOne = n -> n + 1;
    static Function<String, Integer> len = n -> n.length();
    static Function<String, String> up = n -> n.toUpperCase();
}
