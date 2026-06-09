package com.example.generics.interfaces.custom;

@FunctionalInterface
public interface CastType<T, R> {
    R transform(T input);
}
