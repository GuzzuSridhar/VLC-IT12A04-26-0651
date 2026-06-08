package com.example.collections;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        // HashMap
        /*
         * 1. implementation of a Map interface
         * 2. works as KV pair
         * 3. Keys cannot be duplicated
         */

        HashMap<Integer, String> employees = new HashMap<>();

        // add employees
        employees.put(100, "John");
        employees.put(101, "Alex");
        employees.put(102, "Bill");
        employees.put(103, "Sara");

        // retrieve employee
        String name = employees.get(100); // returns null if the key does not exist
        System.out.println(name);

        // check key
        System.out.println(employees.containsKey(100));

        // check value
        System.out.println(employees.containsValue("Jill"));

        // ternary operator to prevent null and print custom message
        name = employees.containsKey(100) ? employees.get(100) : "Not Available";
        System.out.println(name);

        // size
        System.out.println(employees.size());

        // remove KV
        name = employees.remove(100);
        System.out.println(name + " has been deleted");

        System.out.println(" -------------------- ");

        // entrySet for loop
        for (Integer k : employees.keySet()) {
            System.out.println(k + " - " + employees.get(k));
        }

    }
}
