package com.example.collections.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamTerminalOps {
    // Stream Terminal Ops
    public static void main(String[] args) {
        List<String> strList = List.of("One", "Two", "Three", "Four");
        List<Integer> intList = List.of(2, 4, 6, 8);

        System.out.println("forEach-------------");
        strList.stream().forEach(System.out::println);
        intList.stream().forEach(System.out::println);

        System.out.println("anyMatch-------------");
        boolean ma = strList.stream().anyMatch(e -> e.contains("Four"));
        System.out.println(ma);

        System.out.println("allMatch-------------");
        boolean bo = intList.stream().allMatch(n -> n % 2 == 0);
        System.out.println(bo);

        System.out.println("NoneMatch-------------");
        bo = intList.stream().allMatch(n -> n % 2 != 0);
        System.out.println(bo);

        System.out.println("collect-------------");
        List<String> temp = strList.stream().filter(s -> s.startsWith("T")).collect(Collectors.toList());
        System.out.println(temp);

    }
}
