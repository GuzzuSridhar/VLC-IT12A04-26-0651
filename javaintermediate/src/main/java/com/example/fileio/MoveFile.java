package com.example.fileio;

import java.io.File;

public class MoveFile {
    public static void main(String[] args) {
        File file = new File("d:\\yourfile.txt");
        if (file.renameTo(new File("yourfile.txt")))
            System.out.println("File moved");
        else
            System.out.println("could not move the file");
    }
}
