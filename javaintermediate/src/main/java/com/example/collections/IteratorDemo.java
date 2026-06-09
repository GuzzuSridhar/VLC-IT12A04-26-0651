package com.example.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    // An iterator is a java object that provides a way to traverse a collection
    // (List, set, map)
    // no need of underlying details
    // hasNext() , next() and remove()

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alex");
        names.add("Bill");
        names.add("Martin");

        // getting the Iterator for names
        Iterator<String> iterator = names.iterator();

        // iterating thru the list
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
            if (name.equalsIgnoreCase("Martin"))
                iterator.remove(); // removes the current element
        }

        System.out.println(names);

    }
}
