package com.example.optionals;

import java.util.Optional;

// A container object which may or may not contain a non-null value. 
// If a value is present, isPresent() returns true. 
// If no value is present, the object is considered empty and isPresent() returns false.

public class OptionalDemo {
    public static void main(String[] args) {
        // When Optional class is used the string declaration in the following way
        // should not be done
        String test = null;
        // name= Optional.of(test)

        Optional<String> name = Optional.of("John");
        name = Optional.of("Alex"); // reassign the value of optional string
        name = Optional.ofNullable(test); // use ofNullable where null may be expected
        if (name.isPresent())
            System.out.println(name.get());
        else
            System.out.println("Name is not present");
    }

}

/*
 * When you are Sure that no Null values will come in
 * The use
 * Optional.of(value)
 * 
 * When there is a possibility of a null value coming in
 * then use
 * Optional.ofNullable(value)
 */
