package com.example.fileio;

import java.io.File;

public class RenameFile {
    public static void main(String[] args) {
        File file = new File("myfile.txt");
        if (file.renameTo(new File("yourfile.txt")))
            System.out.println("File renamed");
        else
            System.out.println("could not  rename the file");
    }
}
