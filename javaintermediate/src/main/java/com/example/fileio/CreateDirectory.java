package com.example.fileio;

import java.io.File;

public class CreateDirectory {
    public static void main(String[] args) {
        File file = new File("dir");
        file.mkdir();

        // create sub folders within a folder
        File file1 = new File("dir1\\dire");
        file1.mkdirs();

    }
}
