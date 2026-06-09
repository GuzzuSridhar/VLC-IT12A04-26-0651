package com.example.fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("myfile.txt"));
            bw.write("Any text here... Buffered writer is economical on the number of IO operations");
            bw.newLine();
            bw.write("Any text here... Buffered writer is economical on the number of IO operations");
            System.out.println("Hello");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
