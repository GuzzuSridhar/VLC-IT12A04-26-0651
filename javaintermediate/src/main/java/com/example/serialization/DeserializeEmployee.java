package com.example.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeEmployee {
    public static void main(String[] args) {

        try (
                FileInputStream fis = new FileInputStream("john.ser");
                ObjectInputStream ois = new ObjectInputStream(fis);) {
            Employee john = (Employee) ois.readObject();
            System.out.println(john);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
