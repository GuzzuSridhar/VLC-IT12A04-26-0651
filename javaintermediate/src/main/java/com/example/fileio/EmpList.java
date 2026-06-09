package com.example.fileio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class EmpList {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Employee e = new Employee(100, "John");
        logEmp(e.getName());
        Employee e1 = new Employee(100, "Alex");
        logEmp(e.getName());
    }

    public static void logEmp(String name) {
        File log = new File("log.txt");
        LocalDateTime now = LocalDateTime.now();
        BufferedWriter br = null;
        try {
            if (!log.exists())
                log.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            br = new BufferedWriter(new FileWriter("log.txt", true));
            br.write("\n");
            br.write("Employee " + name + " created at : "
                    + now.getDayOfMonth()
                    + ":" + now.getMonth()
                    + ":"
                    + now.getYear()
                    + " - "
                    + now.getHour()
                    + ":" + now.getMinute());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
