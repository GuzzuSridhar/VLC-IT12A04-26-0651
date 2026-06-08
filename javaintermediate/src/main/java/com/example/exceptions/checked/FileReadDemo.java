package com.example.exceptions.checked;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {
    public static void main(String[] args) {
        FileReader file = null;
        try {
            file = new FileReader("noexistent.txt"); // checked exception and is to be handled
        } catch (IOException i) {
            i.getCause();
        } finally {
            try {
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void testChecked() throws FileNotFoundException, IOException {
        FileReader f = new FileReader("Nonexistent.txt"); // to get the code compiled add a throws statement on the
                                                          // method or add try/ catch
        f.close();
    }
}

// some checked exceptions
/*
 * File IO
 * SqlException
 * 
 */