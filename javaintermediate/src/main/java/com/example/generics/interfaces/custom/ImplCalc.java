package com.example.generics.interfaces.custom;

public class ImplCalc {
    public static void main(String[] args) {
        Calculator<Integer> add = (a, b) -> a + b;
        Calculator<Integer> diff = (a, b) -> a - b;
        Calculator<Integer> prod = (a, b) -> a * b;
        Calculator<Integer> div = (a, b) -> a / b;

        // with Strings
        Calculator<String> join = (x, y) -> x + y;

        // applying the Functional Interface
        System.out.println(add.operation(10, 20));
        System.out.println(diff.operation(103, 420));
        System.out.println(prod.operation(130, 520));
        System.out.println(div.operation(130, 520));

        System.out.println(join.operation("Hello ", "World"));
    }
}
