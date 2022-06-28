package com.example.javacoredemo.iostreams;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 *
 * @author Yasir Satti
 * <br>
 * <br>The ByteArrayInputStream class of the java.io package can be used to read an array of input data (in bytes).
 *
 * <br>It extends the InputStream abstract class.
 *
 * <br>In ByteArrayInputStream, the input stream is created using the array of bytes. It includes an internal array to
 * store data of that particular byte array.
 *
 * <br>
 * <br> The ByteArrayOutputStream class is dealling with writing an array of output data (in bytes). It extends the
 * OutputStream abstract class.
 *
 *
 * <br>
 * @see <a href="https://www.programiz.com/java-programming/bytearrayinputstream" target="_blank"> Java ByteArrayInputStream</a>
 * <br>
 * <br>
 * @see <a href="https://www.programiz.com/java-programming/bytearrayoutputstream" target="_blank"> Java ByteArrayOutputStream</a>
 * <br>
 * <br>
 * @see <a href="https://www.youtube.com/watch?v=v0vcfwEKKuY" target="_blank">Tutorial ( video ): Java Byte Array Input Output Stream</a>
 */

public class IOByteArrayStream {

    /**
     * Demonstrates methods of both classes ByteArrayInputStream and ByteArrayOutputStream.
     *
     * @since 1.0
     */
    public void demo(){

        // 1 - ByteArrayInputStream: Creates an array of byte
        byte[] array = {1, 2, 3, 4};

        try {
            ByteArrayInputStream input = new ByteArrayInputStream(array);

            System.out.print("1 - ByteArrayInputstream: ");

            System.out.print("\nThe bytes read from the input stream: ");

            for(int i= 0; i < array.length; i++) {

                // Reads the bytes
                int data = input.read();
                System.out.print(data + ", ");
            }
            input.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }

        // 2 - ByteArrayInputStream: Use avaiable() method

        // Creates an array of bytes
        byte[] array2 = { 1, 2, 3, 4 };

        try {
            ByteArrayInputStream input = new ByteArrayInputStream(array2);

            // Returns the available number of bytes
            System.out.println("\nUsing avaible() method:");
            System.out.println("Available bytes at the beginning: " + input.available());

            // Reads 2 bytes from the input stream
            input.read();
            input.read();

            // Returns the available number of bytes
            System.out.println("Available bytes at the end: " + input.available());

            input.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }

        // 3- ByteArrayInputStream: Use skip() method

        // Create an array of bytes
        byte[] array3 = { 1, 2, 3, 4 };

        try {
            ByteArrayInputStream input = new ByteArrayInputStream(array3);

            // Using the skip() method
            input.skip(2);
            System.out.println("\nUsing skip() method:");
            System.out.print("Input stream after skipping 2 bytes: ");

            int data = input.read();
            while (data != -1) {
                System.out.print(data + ", ");
                data = input.read();
            }

            // close() method
            input.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }

        // 4 - ByteArrayOutputStream: write data

        String data = "This is a line of text inside the string.";

        try {
            // Creates an output stream
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] array4 = data.getBytes();

            // Writes data to the output stream
            out.write(array4);

            // Retrieves data from the output stream in string format
            String streamData = out.toString();
            System.out.println("\n\n 2 - ByteArrayOutputstream: \n" + streamData);

            out.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }

        // 5 - ByteArrayOutputStream: access data using toByteArray() and toString()
        String data2 = "This is data.";

        try {
            // Creates an output stream
            ByteArrayOutputStream out = new ByteArrayOutputStream();

            // Writes data to the output stream
            out.write(data2.getBytes());

            // Returns an array of bytes
            byte[] byteData = out.toByteArray();
            System.out.print("\nData using toByteArray() method: \n");
            for(int i=0; i<byteData.length; i++) {
                System.out.print((char)byteData[i]);
            }

            // Returns a string
            String stringData = out.toString();
            System.out.println("\nData using toString(): \n" + stringData);

            out.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
