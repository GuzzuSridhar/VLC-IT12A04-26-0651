package com.example.collections.streams;

import java.util.List;
import java.util.Optional;
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

        System.out.println("count-------------");
        long c = strList.stream().filter(s -> s.startsWith("T")).count();
        System.out.println(c);

        System.out.println("max-------------");
        Optional<Integer> m = intList.stream().max((i, j) -> i.compareTo(j));
        System.out.println(m.get());

        System.out.println("min-------------");
        Optional<Integer> mi = intList.stream().min((i, j) -> i.compareTo(j));
        System.out.println(mi.get());

        System.out.println("reduce-------------");
        int sum = intList.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        int prod = intList.stream().reduce(1, (x, y) -> x * y);
        System.out.println(prod);

    }
}
