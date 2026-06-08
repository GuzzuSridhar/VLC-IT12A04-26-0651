package com.example.collections;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // HashSet
        /*
         * 1. is an implementation of the Set interface
         * 2. Unordered collection
         * 3. No duplicates allowed
         */

        HashSet<String> names = new HashSet<>();

        // add elements
        names.add("John");
        names.add("Bill");
        names.add("Alex");
        names.add("Jill");
        names.add("Bill");
        names.add("Bill");
        names.add("Bill");

        // print the names
        System.out.println(names);

        // loop to print
        for (String string : names) {
            System.out.println(string);
        }

        // size
        System.out.println(names.size()); // ignores duplicates

        // search
        System.out.println(names.contains("Bill"));

    }
}
