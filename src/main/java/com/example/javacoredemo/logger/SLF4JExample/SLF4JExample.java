package com.example.javacoredemo.logger.SLF4JExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JExample {
    public static void main(String[] args) {

        demoConsolLogger();
        demoFileLogger();

    }

    public static void demoConsolLogger() {
        //Creating the Logger object
        Logger logger = LoggerFactory.getLogger("consolLogger");

        //Logging the information
        String logMsg = "consol logger using SLF4J-logback";
        logger.info(logMsg);
        logger.debug(logMsg);
        logger.error(logMsg);
        logger.trace(logMsg);
        logger.warn(logMsg);
    };

    public static void demoFileLogger(){

        Logger logger = LoggerFactory.getLogger("fileLogger");

        //Logging the information
        String logMsg = "file logger using SLF4J-logback";
        logger.info(logMsg);
        logger.debug(logMsg);
        logger.error(logMsg);
        logger.trace(logMsg);
        logger.warn(logMsg);
    };
}
