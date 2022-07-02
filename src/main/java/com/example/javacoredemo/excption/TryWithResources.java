package com.example.javacoredemo.excption;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Yasir Satti
 * <br>
 * <br>The try-with-resources statement automatically closes all the resources at the end of the statement. A resource
 * is an object to be closed at the end of the program. The try-with-resources statement closes all the resources that
 * implement the <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/AutoCloseable.html" target="_blank"> AutoCloseable interface</a>.
 *
 * <ul>
 *     <li>
 *         try-with-resources with single resource:
 *         <br>We declare only one resource in the try-with-resources statement.
 *     </li>
 *     <li>
 *         try-with-resources with multiple resources:
 *         <br>We can declare more than one resource in the try-with-resources
 *         statement by separating them with a semicolon ;
 *     </li>
 *     <li>
 *         try-with-resources with supressed exceptions:
 *         <br>If exceptions are thrown from both the try block and the
 *         try-with-resources statement, exception from the try block is thrown and exception from the
 *         try-with-resources statement is suppressed. In Java 7 and later, the suppressed exceptions can be retrieved
 *         by calling the Throwable.getSuppressed() method from the exception thrown by the try block. This method
 *         returns an array of all suppressed exceptions. We get the suppressed exceptions in the catch block.
 *     </li>
 * </ul>
 *
 * <br>
 * <br> Before Java 7 introduced this feature, we had to use the finally block to ensure that the resource is closed to
 * avoid resource leaks. The try-with-resources statement does automatic resource management. We need not explicitly
 * close the resources as JVM automatically closes them. This makes the code more readable and easier to write.
 * <br>
 * @see <a href="https://www.programiz.com/java-programming/try-with-resources" target="_blank"> Java try-with-resources</a>
 * <br>
 * @see <a href="https://www.youtube.com/watch?v=rIgHAodCKAc" target="_blank"> Try with Resources and the Auto Closeable Interface in Java (video)</a>
 * <br>
 */

public class TryWithResources {

    /**
     * Demonstrates use of try-with-resources.
     *
     * @since 1.0
     */

    public void demo() {

        // 1) Try-with-resources
        System.out.println("1) Try-with-resources example...");

        String line;
        try(BufferedReader br = new BufferedReader(new FileReader("data/exceptionTryWithResourcestest.txt"))) {
            while ((line = br.readLine()) != null) {
                System.out.println("Line =>"+line);
            }
        } catch (IOException e) {
            System.out.println("IOException in try block =>" + e.getMessage());
        }

        // 2) Try-with-resources with supressed exceptions
        System.out.println("\n\n2) Try-with-resources with supressed exceptions example...");

        String line2;
        try(BufferedReader br = new BufferedReader(new FileReader("data/exceptionTryWithResourcestest.txt"))) {
            while ((line2 = br.readLine()) != null) {
                System.out.println("Line =>"+line2);
            }
        } catch (IOException e) {
            System.out.println("IOException in try block =>" + e.getMessage());
            Throwable[] suppressedExceptions = e.getSuppressed();
            for (int i=0; i<suppressedExceptions.length; i++) {
                System.out.println("Suppressed exception=>" + suppressedExceptions[i]);
            }
        }

        // 3) Try-with-resources with multiple resources declaration
        System.out.println("\n\n3) Try-with-resources with with multiple resources declaration example...");

        try (Scanner scanner = new Scanner(new File("data/exceptionTryWithResourcestest.txt"));
             PrintWriter writer = new PrintWriter(new File("data/exceptionTryWithResourcestest.txt"));) {
            while (scanner.hasNext()) {
                writer.print(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("IOException in try block =>" + e.getMessage());
        }
    }
}
