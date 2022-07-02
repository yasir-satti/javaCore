package com.example.javacoredemo.excption;

/**
 *
 * @author Yasir Satti
 * <br>
 * <br> An exception is an unexpected event that occurs during program execution. It affects the flow of the program
 * instructions which can cause the program to terminate abnormally.
 * <br>
 * <br><img src="javaExceptionHeirachy.png" alt="Java Exception hierarchy" width="600" height="400">
 * <br>
 *
 * <ul>
 *     <li>
 *         Errors:
 *         <br> Errors represent irrecoverable conditions such as Java virtual machine (JVM) running out of memory,
 *         memory leaks, stack overflow errors, library incompatibility, infinite recursion, etc.
 *         <br> Errors are usually beyond the control of the programmer and we should not try to handle errors.
 *     </li>
 *     <li>
 *         Exceptions:
 *         <br> Exceptions can be caught and handled by the program. When an exception occurs within a method, it
 *         creates an object. This object is called the exception object. It contains information about the exception
 *         such as the name and description of the exception and state of the program when the exception occurred.
 *     </li>
 * </ul>
 * <Br>
 *
 * <br>
 * <br>Exceptions can be categorized into two types:
 *
 * <ul>
 *     <li>
 *         RuntimeException ( Unchecked Exceptions ):
 *         <br>A runtime exception happens due to a programming error. They are also known as unchecked exceptions.They
 *         are not checked at compile-time but at run-time.For example:
 *         ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, exceptions under Error class, etc.
 *         <br>You can think about it in this way. “If it is a runtime exception, it is your fault”.
 *         <br> - The NullPointerException would not have occurred if you had checked whether the variable was initialized or
 *         not before using it.
 *         <br> - An ArrayIndexOutOfBoundsException would not have occurred if you tested the array index against the array bounds.
 *     </li>
 *     <li>
 *         IOException ( Checked Exceptions ):
 *         <br>An IOException is also known as a checked exception. They are checked by the compiler at the compile-time
 *         and the programmer is prompted to handle these exceptions. For example, IOException, InterruptedException, etc.
 *     </li>
 * </ul>
 *
 *
 *
 * <br>Refer to <a href="https://www.programiz.com/java-programming/exceptions" target="_blank"> Java Exceptions</a> to
 * learn in detail about checked and unchecked exceptions.
 * <br>
 * <br>Usually, we don't need to handle unchecked exceptions. It's because unchecked exceptions occur due to programming
 * errors. And, it is a good practice to correct them instead of handling them.
 *
 * <br>
 * @see <a href="https://www.programiz.com/java-programming/exception-handling" target="_blank"> Java Try..Catch..Finally block</a>
 * <br>
 * <br>
 * @see <a href="https://stackoverflow.com/questions/1263128/most-common-checked-and-unchecked-java-exceptions" target="_blank"> Most common checked and unchecked Java Exceptions</a>
 * <br>
 * <br>
 * @see <a href="https://programming.guide/java/list-of-java-exceptions.html" target="_blank"> List of Java Exceptions</a>
 */

public class TryCatchFinally {

    /**
     * Demonstrates use of try-catch-finally.
     *
     * @since 1.0
     */

    public void demo(){

        // 1) Try-catch block
        System.out.println("1) Try-Catch exception example...");

        try {
            // code that generate exception
            int divideByZero = 5 / 0;
            System.out.println("Rest of code in try block");
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        }

        // 2) Try-Catch-Finally block
        System.out.println("\n\n2) Try-Catch-finally exception example...");

        try {
            // code that generates exception
            int divideByZero = 5 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        }
        finally {
            System.out.println("This is the finally block");
        }

        // 3) Handle Multiple Exceptions in a catch Block
        System.out.println("\n\n3) Handle Multiple Exceptions in a catch Block example...");

        // Before Javae 7
        System.out.println("Using code before Java 7....");
        try {
            int array[] = new int[10];
            array[10] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        // After Java 7
        System.out.println("\nUsing code after Java 7....");
        try {
            int array[] = new int[10];
            array[10] = 30 / 0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }


    }
}
