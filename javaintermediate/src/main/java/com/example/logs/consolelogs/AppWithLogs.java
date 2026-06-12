package com.example.logs.consolelogs;

import java.util.logging.Logger;

public class AppWithLogs {
    static Logger logger = Logger.getLogger(AppWithLogs.class.getName());

    public static void main(String[] args) {
        try {
            logger.info("Starting the application");
            int res = 10 / 0;
            System.out.println(res);

        } catch (Exception e) {
            logger.warning("Unexpected error");
        }

        logger.info("Application Finished");
    }
}
