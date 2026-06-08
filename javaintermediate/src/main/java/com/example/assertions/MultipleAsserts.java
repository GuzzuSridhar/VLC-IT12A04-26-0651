package com.example.assertions;

public class MultipleAsserts {

    public static void main(String[] args) {
        int i = getValue();
        assert i > 0 : "Negative values not allowed  but found a negative value ";

        String message = null;// deliberate error for the demp
        assert message != null : "Message is blank or null ";

    }

    public static int getValue() {
        return -5; // deliberate error for the demp
    }
}
