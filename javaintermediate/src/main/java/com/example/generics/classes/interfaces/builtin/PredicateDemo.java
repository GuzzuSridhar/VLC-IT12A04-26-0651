package com.example.generics.classes.interfaces.builtin;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Employee e = new Employee(100, "John", 50);
        Employee e1 = new Employee(100, "Alex", 60);
        Employee e2 = new Employee(100, "Simon", 45);

        Predicate<Employee> old = em -> em.getAge() > 50;
        System.out.println(old.test(e));
        System.out.println(old.test(e1));
        System.out.println(old.test(e2));
    }
}
