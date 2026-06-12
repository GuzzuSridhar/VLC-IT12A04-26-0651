package com.example.logs.consolelogs;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LevelsDemo {
    static Logger logger = Logger.getLogger(LevelsDemo.class.getName());

    public static void main(String[] args) {
        logger.setLevel(Level.FINEST); // will work only when the console handler or file handler is configured

        logger.severe("severe message");
        logger.warning("warning messge");
        logger.info("info message"); // default level used
        logger.config("config message");
        logger.fine("fine message");
        logger.finer("finer message");
        logger.finest("finest message");

    }
}

// usage of the log levels

/*
 * 
 * Severe --Error and fatal
 * WARNING -- Warn
 * Info -- information
 * Fine -- Debug
 * Finest -- trace
 */

// The logs above the seleted level are only displayed
// the ones below the selected level are suppressed
