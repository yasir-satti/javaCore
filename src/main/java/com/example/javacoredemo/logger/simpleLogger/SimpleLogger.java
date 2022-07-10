package com.example.javacoredemo.logger.simpleLogger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

// tutorial
// https://www.journaldev.com/977/logger-in-java-logging-example



/**
 *
 * @author Yasir Satti
 * <br>
 * <br>Java allows us to create and capture log messages and files through the process of logging.
 *
 * In Java, logging requires frameworks and APIs. Java has a built-in logging framework in the java.util.logging package.
 *
 * We can also use third-party frameworks like Log4j, Logback, and many more for logging purposes.
 *
 * <br>Java Logging Components
 * The figure below represents the core components and the flow of control of the Java Logging API (java.util.logging).
 * <br>
 * <br><img src="javaLogger.jpg" alt="Java Logger components" width="600" height="400">
 *
 *
 * @see <a href="https://www.programiz.com/java-programming/logging" target="_blank"> Java Logging</a>
 *
 * <br>
 * <br>
 * @see <a href="https://www.youtube.com/watch?v=34552m80WrM" target="_blank"> How to use java.util.logging class in Java for Creating logs ( video )</a>
 * <br>
 */
public class SimpleLogger {

    static Logger logger = Logger.getLogger(SimpleLogger.class.getName());

    /**
     * Demonstrates use of logger componenets.
     *
     * @since 1.0
     */
    public void demo(){
        try {
            FileInputStream logFile = new FileInputStream("mylogging.properties");
            LogManager.getLogManager().readConfiguration(logFile);
        } catch (SecurityException | IOException e1) {
            e1.printStackTrace();
        }
        logger.setLevel(Level.FINE);
        logger.addHandler(new ConsoleHandler());
        //adding custom handler
        logger.addHandler(new MyHandler());
        try {
            //FileHandler file name with max size and number of log files limit
            Handler fileHandler = new FileHandler("log/simplelogger.log", 2000, 5);
            fileHandler.setFormatter(new MyFormatter());
//            setting custom filter for FileHandler
            fileHandler.setFilter(new MyFilter());
            logger.addHandler(fileHandler);

            for(int i=0; i<1000; i++){
                //logging messages
                logger.log(Level.INFO, "Msg"+i);
            }
            logger.log(Level.CONFIG, "Config data");
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }
    }

}
