package com.example.generics.methods;

public class MultipleParams {

    static <T extends Number> void add(T x, T y) { // 2 parameters of same type
        // System.out.println(x);
        // System.out.println(y);
        System.out.println(x.doubleValue() + y.doubleValue());
    }

    static <T, U> void pair(T t, U u) { // multiple parameters of different types (2 types)
        System.out.println("first parameter: " + t + "Second Parameter: " + u);
    }

    public static void main(String[] args) {
        add(10, 20);
        add(30.5, 20.8);

        pair(10, "hello");
        pair("hello", 10);
    }
}
