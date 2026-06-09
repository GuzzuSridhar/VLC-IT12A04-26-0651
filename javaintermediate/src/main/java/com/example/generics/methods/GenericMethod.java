package com.example.generics.methods;

public class GenericMethod {
    public static void main(String[] args) {
        // arrays of different types
        String[] sar = { "One", "Two", "Three", "Four" };
        Integer[] iar = { 1, 2, 3, 4 };
        Double[] dar = { 1.5, 2.5, 3.5, 4.5 };
        Character[] car = { 'a', 'b', 'c', 'd' };

        // using the methods to print
        showArr(sar);
        showArr(iar);
        showArr(dar);
        // showArr(car); // will throw an error as the method for the type is not
        // available

        // using the Generic mentod
        printArr(sar);
        printArr(iar);
        printArr(dar);
        printArr(car);

    }

    // write a Generic array to handle all types
    static <T> void printArr(T[] arr) {
        System.out.println();
        System.out.println(" Using the Generics");
        for (T t : arr) {
            System.out.print(t);
        }

    }

    // method to print String array
    static void showArr(String[] s) {
        System.out.println();
        for (String string : s) {
            System.out.print(string + " ");
        }
    }

    // method to print Integer array
    static void showArr(Integer[] i) {
        System.out.println();
        for (Integer integer : i) {
            System.out.print(integer + " ");
        }
    }

    // method to print Double array
    static void showArr(Double[] d) {
        System.out.println();
        for (Double db : d) {
            System.out.print(db + " ");
        }
    }

}
