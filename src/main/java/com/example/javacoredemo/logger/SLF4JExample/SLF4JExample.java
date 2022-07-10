package com.example.javacoredemo.logger.SLF4JExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Yasir Satti
 * <br>
 * <br>Java allows us to create and capture log messages and files through the process of logging.
 *
 * In Java, logging requires frameworks and APIs. Java has a built-in logging framework in the java.util.logging package.
 *
 * We can also use third-party frameworks like Log4j, Logback, and many more for logging purposes.
 * <br>
 * <br>SLF4J stands for Simple Logging Facade for Java. It provides a simple abstraction of all the logging frameworks.
 * It enables a user to work with any of the logging frameworks such as Log4j, Logback, JUL (java.util.logging), etc.
 * using single dependency.
 * <br>
 * <br>SLF4J stands for Simple Logging Facade for Java. It provides a simple abstraction of all the logging frameworks
 * in Java. Thus, it enables a user to work with any of the logging frameworks such as Log4j, Logback and
 * JUL (java.util.logging) using single dependency. You can migrate to the required logging framework
 * at run-time/deployment time. Observe the following diagram to have a better understanding.
 * <br>
 * <br><img src="slf4j.jpeg" alt="SLF4 abstraction" width="600" height="400">
 *
 * <br>
 * @see <a href="https://www.programiz.com/java-programming/annotation-types" target="_blank"> Java Annotation Types</a>
 * <br>
 * @see <a href="https://www.youtube.com/watch?v=yTokW18ujZI" target="_blank"> HOW SLF4J WORKS | SLF4J FACADE EXPLAIN ( video )</a>
 * <br>
 * <br>
 * @see <a href="https://www.youtube.com/watch?v=bDhRkDz6a7Q" target="_blank"> Slf4j, Lockback and Log4J2 ( video )</a>
 */
public class SLF4JExample {
    public void demo(){

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
