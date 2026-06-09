package com.example.generics.interfaces.builtin;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {
    // retun a value without input

    public static void main(String[] args) {
        Supplier<LocalDateTime> ctime = () -> LocalDateTime.now();
        System.out.println(ctime.get().getHour() + ":" + ctime.get().getMinute() + ":" + ctime.get().getSecond());

        Supplier<Integer> rand = () -> new Random().nextInt();
        System.out.println(rand.get());

    }
}
