package com.example.logs.consolelogs;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
// import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

public class ConsoleLogsDemo {
    // get the logger for this class
    static Logger logger = Logger.getLogger(ConsoleLogsDemo.class.getName());

    public static void main(String[] args) {
        // configure the logger

        // create a consolehandler object
        ConsoleHandler consoleHandler = new ConsoleHandler();

        // set the formatter
        // consoleHandler.setFormatter(new SimpleFormatter());
        consoleHandler.setFormatter(new XMLFormatter());

        // set the level of level
        consoleHandler.setLevel(Level.INFO);

        // logger settings

        // setting off the parent handlers
        logger.setUseParentHandlers(false);

        // adding the consolehandler to the logger
        logger.addHandler(consoleHandler);
        logger.setLevel(Level.INFO);

        // log the messages at different levels

        logger.severe("severe message");
        logger.warning("warning messge");
        logger.info("info message"); // default level used
        logger.config("config message");
        logger.fine("fine message");
        logger.finer("finer message");
        logger.finest("finest message");
    }

}
