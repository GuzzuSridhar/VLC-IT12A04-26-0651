package com.example.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        // allows adding elements to front and back
        Deque<String> names = new ArrayDeque<>();

        // add elements
        names.addFirst("First");
        names.addLast("Last");
        names.addFirst("FirstAgain");
        names.addLast("LastAgain");

        System.out.println(names);
    }
}
