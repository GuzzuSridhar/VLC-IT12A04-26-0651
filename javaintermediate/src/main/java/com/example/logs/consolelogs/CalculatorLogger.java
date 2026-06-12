package com.example.logs.consolelogs;

import java.util.logging.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * A comprehensive calculator program demonstrating Java's standard logging
 * framework.
 * This class configures a custom ConsoleHandler and logs messages at all seven
 * standard
 * logging levels (SEVERE, WARNING, INFO, CONFIG, FINE, FINER, FINEST) during
 * runtime operations.
 */
public class CalculatorLogger {

    // Obtain a logger instance for this class
    private static final Logger logger = Logger.getLogger(CalculatorLogger.class.getName());

    public static void main(String[] args) {
        // Initialize and configure the custom logger settings
        configureLogger();

        logger.log(Level.INFO, "Starting the Calculator application demo...");

        try {
            // 1. Standard Addition (Demonstrates CONFIG, FINE, FINER, FINEST, and INFO
            // levels)
            double sum = add(150.5, 350.25);
            logger.log(Level.INFO, "Addition successfully completed. Result: " + sum);

            // 2. Risky operation - division near limit (Demonstrates WARNING level)
            double largeDiv = divide(1.0, 0.00000001);
            logger.log(Level.INFO, "Highly precise division completed. Result: " + largeDiv);

            // 3. Invalid operation - division by zero (Demonstrates SEVERE level)
            logger.log(Level.FINE, "Attempting potentially dangerous calculation: division by zero.");
            double badDiv = divide(10.0, 0.0);
            logger.log(Level.INFO, "Division completed. Result: " + badDiv);

        } catch (ArithmeticException e) {
            // Log catastrophic failures at the SEVERE level
            logger.log(Level.SEVERE, "An arithmetic error occurred during computation!", e);
        }

        try {
            // 4. Invalid operation - square root of negative number (Demonstrates WARNING
            // and SEVERE)
            logger.log(Level.FINE, "Attempting potentially dangerous calculation: square root of a negative.");
            double sqRoot = squareRoot(-9.0);
            logger.log(Level.INFO, "Square root completed. Result: " + sqRoot);
        } catch (IllegalArgumentException e) {
            logger.log(Level.SEVERE, "A mathematical violation occurred!", e);
        }

        logger.log(Level.INFO, "Calculator application demo completed.");
    }

    /**
     * Configures the Logger instance to use a custom ConsoleHandler and Formatter.
     * Overrides default parent handlers to prevent duplicate console outputs and
     * sets the logging threshold to ALL to capture everything.
     */
    private static void configureLogger() {
        // Disable parent handlers so default JVM handlers don't write duplicate logs to
        // console
        logger.setUseParentHandlers(false);

        // Set the log level of our Logger to ALL so no log messages are filtered out
        // initially
        logger.setLevel(Level.ALL);

        // Create a new ConsoleHandler
        ConsoleHandler handler = new ConsoleHandler();

        // The ConsoleHandler must also be configured to accept ALL levels
        handler.setLevel(Level.ALL);

        // Define a custom formatter for clean, professional console logs
        handler.setFormatter(new Formatter() {
            private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

            @Override
            public String format(LogRecord record) {
                // Formatting format: [Timestamp] [LEVEL] [Source Method] - Message (+ Exception
                // if present)
                StringBuilder builder = new StringBuilder();
                builder.append("[")
                        .append(dateFormat.format(new Date(record.getMillis())))
                        .append("] ")
                        .append(String.format("%-7s", record.getLevel()))
                        .append(" [")
                        .append(record.getSourceClassName())
                        .append(".")
                        .append(record.getSourceMethodName())
                        .append("] - ")
                        .append(formatMessage(record))
                        .append("\n");

                // If there's an exception attached, append its stack trace representation
                if (record.getThrown() != null) {
                    builder.append(record.getThrown().toString()).append("\n");
                    for (StackTraceElement element : record.getThrown().getStackTrace()) {
                        builder.append("\tat ").append(element.toString()).append("\n");
                    }
                }
                return builder.toString();
            }
        });

        // Add the custom handler to our logger
        logger.addHandler(handler);

        // CONFIG: Used for configuration and initialization state logs
        logger.log(Level.CONFIG, "Custom ConsoleHandler configured successfully with Level.ALL threshold.");
    }

    /**
     * Adds two double values. Demonstrates entry logging (FINE), local computation
     * steps (FINER),
     * low-level state representation (FINEST), and general status logs.
     */
    public static double add(double a, double b) {
        // FINE: Used for tracing method execution pathways (Parameters, entry points)
        logger.log(Level.FINE, "Entering 'add' method with parameters a = " + a + ", b = " + b);

        // FINER: Used for tracing detailed developer execution workflows
        logger.log(Level.FINER, "Performing internal mathematical addition...");
        double result = a + b;

        // FINEST: Highly granular logging, representing register-like or precise
        // variable state data
        logger.log(Level.FINEST, "Add raw bit registers: a_bits=" + Double.doubleToLongBits(a) + ", b_bits="
                + Double.doubleToLongBits(b));
        logger.log(Level.FINEST, "Result variable computed: result=" + result);

        logger.log(Level.FINE, "Exiting 'add' method returning: " + result);
        return result;
    }

    /**
     * Divides two double values. Emits WARNING logs for boundary conditions and
     * SEVERE logs for zero denominators.
     */
    public static double divide(double dividend, double divisor) {
        logger.log(Level.FINE,
                "Entering 'divide' method with parameters dividend = " + dividend + ", divisor = " + divisor);

        // WARNING: Used for highly unusual or hazardous operation scenarios that might
        // lead to errors
        if (Math.abs(divisor) < 0.00001 && divisor != 0.0) {
            logger.log(Level.WARNING,
                    "Potential Division-by-Zero proximity hazard! Small divisor detected: " + divisor);
        }

        // SEVERE: Used for catastrophic errors that prevent normal application flow
        if (divisor == 0.0) {
            logger.log(Level.SEVERE,
                    "Calculation Attempt Blocked: Division by absolute zero is mathematically undefined.");
            throw new ArithmeticException("Cannot divide by zero.");
        }

        logger.log(Level.FINER, "Executing division division processing...");
        double result = dividend / divisor;
        logger.log(Level.FINE, "Exiting 'divide' method.");
        return result;
    }

    /**
     * Calculates square root of a double value. Warns for negative inputs and
     * throws on illegal operations.
     */
    public static double squareRoot(double val) {
        logger.log(Level.FINE, "Entering 'squareRoot' method with parameter: val = " + val);

        if (val < 0.0) {
            logger.log(Level.WARNING, "Negative parameter detected for root extraction: " + val);
            logger.log(Level.SEVERE,
                    "Calculations of imaginary numbers are out of range for this real-number calculator.");
            throw new IllegalArgumentException("Square root of a negative number cannot be processed.");
        }

        logger.log(Level.FINER, "Calling Math.sqrt routine...");
        double result = Math.sqrt(val);
        logger.log(Level.FINE, "Exiting 'squareRoot' method.");
        return result;
    }
}