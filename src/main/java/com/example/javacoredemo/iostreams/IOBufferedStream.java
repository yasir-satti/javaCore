package com.example.javacoredemo.iostreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOBufferedStream {

    public void demo() {

        System.out.println("1) BufferedInputStream....");

        try {

            // 1) BufferedInputStream
            // use read() method to read data from buffer

            // Creates a FileInputStream
            FileInputStream file = new FileInputStream("data/ioBufferinputStreamInputFile.txt");

            // Creates a BufferedInputStream
            BufferedInputStream input = new BufferedInputStream(file);

            // Reads first byte from file
            int i = input.read();

            System.out.println("\nuse read() method...");

            while (i != -1) {
                System.out.print((char) i);

                // Reads next byte from the file
                i = input.read();
            }
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }

        // use avalable() method

        try {

            // Suppose, the input.txt file contains the following text
            // This is a line of text inside the file.
            FileInputStream file = new FileInputStream("data/ioBufferinputStreamInputFile.txt");

            // Creates a BufferedInputStream
            BufferedInputStream buffer = new BufferedInputStream(file);

            System.out.println("\nuse available() method...");

            // Returns the available number of bytes
            System.out.println("\nAvailable bytes at the beginning: " + buffer.available());

            // Reads bytes from the file
            buffer.read();
            buffer.read();
            buffer.read();

            // Returns the available number of bytes
            System.out.println("Available bytes at the end: " + buffer.available());

            buffer.close();
        } catch (Exception e) {
            e.getStackTrace();
        }

        // use skip() method

        try {
            // Suppose, the input.txt file contains the following text
            // This is a line of text inside the file.
            FileInputStream file = new FileInputStream("data/ioBufferinputStreamInputFile.txt");

            // Creates a BufferedInputStream
            BufferedInputStream buffer = new BufferedInputStream(file);

            System.out.println("\nuse skip() method....");

            // Skips the 5 bytes
            buffer.skip(5);
            System.out.println("Input stream after skipping 5 bytes:");

            // Reads the first byte from input stream
            int i = buffer.read();
            while (i != -1) {
                System.out.print((char) i);

                // Reads next byte from the input stream
                i = buffer.read();
            }

            // Closes the input stream
            buffer.close();
        } catch (Exception e) {
            e.getStackTrace();
        }

        // 2) BufferOutputStream
        // use write() method to write data to buffer

        System.out.println("\n\n2) BufferedOutputStream....");

        System.out.println("\nuse write() method....");

        String data = "This is a line of text inside the file";

        try {
            // Creates a FileOutputStream
            FileOutputStream file = new FileOutputStream("data/ioBufferinputStreamOutputFile.txt");

            // Creates a BufferedOutputStream
            BufferedOutputStream output = new BufferedOutputStream(file);

            byte[] array = data.getBytes();

            // Writes data to the output stream
            output.write(array);
            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }

        System.out.println("\nuse flush() method....");

        try {
            // Creates a FileOutputStream
            FileOutputStream file = new FileOutputStream(" data/ioBufferOutputStreamOutFlush.txt");

            // Creates a BufferedOutputStream
            BufferedOutputStream buffer = new BufferedOutputStream(file);

            // Writes data to the output stream
            buffer.write(data.getBytes());

            // Flushes data to the destination
            buffer.flush();
            System.out.println("Data is flushed to the file.");
            buffer.close();
        } catch (Exception e) {
            e.getStackTrace();


        }
    }
}
