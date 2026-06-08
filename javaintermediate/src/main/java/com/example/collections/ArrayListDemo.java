package com.example.collections;

import java.util.ArrayList;

// use the generics
// <> means generics in Java

public class ArrayListDemo {
    public static void main(String[] args) {

        // unlimited elements
        // homogenous elements and hence same datatype
        // ArrayList can be created only for object types and not primitives
        // ArrayList allows duplicate values
        // is an ordered collection (maintains index)

        ArrayList<String> names = new ArrayList<>();

        // add elements
        names.add("John");
        names.add("Alex");
        names.add("Bill");
        names.add("Jill");
        names.add("Jill");

        // Size of the ArrayList
        System.out.println(names.size());

        // Access the element with its index
        System.out.println(names.get(0));

        // update ArrayList element
        String temp = names.set(0, "Sara");
        System.out.println(temp + " has been relaced with " + names.get(0));

        // delete an ArrayList element
        temp = names.remove(0);
        System.out.println(temp + " has been removed with ");

        // check if an object is existing
        System.out.println(names.contains("Bill"));

        // return index of the object
        int i = names.indexOf("Bill");
        System.out.println(i);

        // print all names
        System.out.println(names); // array of the names

        // using loops to print
        // enchanced loop
        for (String x : names) {
            System.out.println(x);
        }
        System.out.println("--------------------");
        // traditional loop
        for (int j = 0; j < names.size(); j++) {
            System.out.println(names.get(j));
        }

    }
}
