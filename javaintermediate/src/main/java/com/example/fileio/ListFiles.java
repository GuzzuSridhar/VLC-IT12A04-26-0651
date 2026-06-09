package com.example.fileio;

import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        File projectFiles = new File("D:\\javai\\javaintermediate\\src\\main\\java\\com\\example\\fileio");
        String[] files = projectFiles.list();
        for (String string : files) {
            System.out.println(string);
        }
    }
}
