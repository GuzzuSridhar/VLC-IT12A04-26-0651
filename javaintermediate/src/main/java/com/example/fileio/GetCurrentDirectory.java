package com.example.fileio;

public class GetCurrentDirectory {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir");
        System.out.println(path);
    }

}
