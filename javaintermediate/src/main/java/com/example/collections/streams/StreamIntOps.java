package com.example.collections.streams;

import java.util.List;

public class StreamIntOps {
    // Stream Intermediate Operations
    public static void main(String[] args) {

        List<Integer> nums = List.of(10, 12, 2, 2, 4, 6, 6, 8);

        System.out.println("distinct-------------");
        nums.stream().distinct().forEach(System.out::print);

        System.out.println("sorted-------------");
        nums.stream().sorted().forEach(System.out::println);
        nums.stream().distinct().sorted().forEach(System.out::println);

        System.out.println("sorted-------------");
        nums.stream().map(a -> a + 10).forEach(System.out::println);

        System.out.println("filter-------------");
        nums.stream().distinct().filter(x -> x > 10).forEach(System.out::println);

        System.out.println("skip-------------");
        nums.stream().skip(3).forEach(System.out::println);

        System.out.println("limit-------------");
        nums.stream().limit(3).forEach(System.out::println);
    }

}
