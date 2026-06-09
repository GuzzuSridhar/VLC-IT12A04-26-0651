package com.example.generics.interfaces.custom;

public class CastDriver {
    public static void main(String[] args) {

        // :: is a method reference operator
        CastType<String, Integer> strToInt = Integer::parseInt;
        CastType<Integer, String> intToStr = Object::toString;

        System.out.println(strToInt.transform("100"));
        System.out.println(intToStr.transform(123));
    }
}
