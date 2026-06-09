package com.example.fileio;

import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {

    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("myfile.txt", true);
            writer.write("Hello World ");
            writer.write("\nWritten using Java io");
        } catch (IOException e) {
            e.getMessage();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
