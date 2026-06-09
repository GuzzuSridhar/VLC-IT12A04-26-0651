package com.example.fileio;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("yourfile.txt");
        // check if file exists
        if (file.exists()) {
            file.delete();
            System.out.println("File Deleted");
        } else {
            System.out.println("File Does not Exist");

        }

    }

}
