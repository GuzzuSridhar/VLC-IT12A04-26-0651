package com.example.logs.filelogs;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
// import java.util.logging.XMLFormatter;

public class FileLogDemo {
    // get the logger
    static Logger logger = Logger.getLogger(FileLogDemo.class.getName());

    public static void main(String[] args) {

        // setting up the File handler
        try {
            FileHandler fileHandler = new FileHandler();
            fileHandler = new FileHandler("mylogs.txt", true);
            // set up the formatter
            // fileHandler.setFormatter(new XMLFormatter());
            fileHandler.setFormatter(new SimpleFormatter());

            // logger setup
            logger.setUseParentHandlers(false);
            logger.addHandler(fileHandler);
            logger.setLevel(Level.INFO);
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }

        logger.info("Message logged in the file");

    }

}
