package com.example.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeEmployee {

    public static void main(String[] args) {

        // create employee object
        Employee john = new Employee(101, "John", 9822);

        // write the record of john to a file
        try (FileOutputStream fos = new FileOutputStream("john.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeObject(john);
            System.out.println("employee saved to external file");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
