package com.example.javacoredemo.excption;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InvalidClassException;

/**
 *
 * @author Yasir Satti
 * <br>
 * <br>In Java, exceptions can be categorized into two types:
 *
 * <ul>
 *     <li>
 *         Unchecked Exceptions: They are not checked at compile-time but at run-time.For example:
 *         ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, exceptions under Error class, etc.
 *     </li>
 *     <li>
 *         Checked Exceptions: They are checked at compile-time. For example, IOException, InterruptedException, etc.
 *     </li>
 * </ul>
 *
 *
 * <br>Refer to <a href="https://www.programiz.com/java-programming/exceptions" target="_blank"> Java Exceptions</a> to
 * learn in detail about checked and unchecked exceptions.
 * <br>
 * <br>Usually, we don't need to handle unchecked exceptions. It's because unchecked exceptions occur due to programming
 * errors. And, it is a good practice to correct them instead of handling them.
 *
 * <br>
 * <br> We use the throws keyword in the method declaration to declare the type of exceptions that might occur within it.
 * If a method does not handle exceptions, the type of exceptions that may occur within it must be specified in the
 * throws clause so that methods further up in the call stack can handle them or specify them using throws keyword
 * themselves.
 *
 * <br>
 * <br> Use Throws to handle multiple exceptions
 * <br>
 * <br>You can use throws to handle multiple exception. All you need to do is specifiy them in the method signture like:
 * <br>
 * <br>public static void findFile() throws NullPointerException, IOException, InvalidClassException {}
 *
 * <br>
 * <br> throws keyword Vs. try...catch...finally block
 * <br>
 * <br> There might be several methods that can cause exceptions. Writing try...catch for each method will be tedious
 * and code becomes long and less-readable.
 * <br> throws is also useful when you have checked exception (an exception that must be handled) that you don't want
 * to catch in your current method.
 * <br>
 * <br>
 *
 * <table>
 *     <caption>Java Throw versus Throws</caption>
 * <thead>
 * <tr>
 * <th>Throw</th>
 * <th>Throws</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td>Used within a method (or constructor)</td>
 * <td> - Used with method (or constructor) signature</td>
 * </tr>
 * <tr>
 * <td>Used to throw an exception explicitly</td>
 * <td> - Used to declare exceptions</td>
 * </tr>
 * <tr>
 * <td>Can only throw a single exception</td>
 * <td> - Can declare multiple exceptions</td>
 * </tr>
 * <tr>
 * <td>Followed by a throwable instance</td>
 * <td> - Followed by an exception class name</td>
 * </tr>
 * <tr>
 * <td>Cannot be used to propagate checked exceptions by itself</td>
 * <td> - Can be used to propagate checked exceptions by itself</td>
 * </tr>
 * </tbody>
 * </table>
 * <br>
 * <br>
 * @see <a href="https://www.programiz.com/java-programming/throw-throws" target="_blank"> Java throw and throws</a>
 * <br>
 * @see <a href="https://www.youtube.com/watch?v=nmRM6EcJKdA" target="_blank"> Throw vs Throws in Java Programming (video)</a>
 * <br>
 */

public class ThrowThrows {

    /**
     * Demonstrates use of throws and throw.
     *
     * @since 1.0
     */

    public void demo() {

        // Throws with single exception declaration
        System.out.println("\nThrows with SINGLE exceptions declaration...");

        try {
            findFile();
        } catch (IOException e) {
            System.out.println(e);
        }

        // Throws with multiple exceptions declaration
        System.out.println("\nThrows with MULTIPLE exceptions declaration...");

        try {
            findFile2();
        } catch (NullPointerException | InvalidClassException e) {
            System.out.println(e);
        }

    }

    public static void findFile() throws IOException {
        // code that may produce IOException
        File newFile=new File("test.txt");
        FileInputStream stream=new FileInputStream(newFile);
    }

    public static void findFile2() throws NullPointerException, InvalidClassException {

        // code that may produce NullPointerException
        System.out.println("\ncode that may produce NullPointerException");

        // code that may produce IOException
        System.out.println("\ncode that may produce IOException");

        // code that may produce InvalidClassException
        System.out.println("\ncode that may produce InvalidClassException");
    }


}
