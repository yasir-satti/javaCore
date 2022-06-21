package com.example.javacoredemo.iostreams;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 *
 * @author Yasir Satti
 * <br>
 * <br>The OutputStream class of the java.io package is an abstract superclass that represents an output stream of
 * bytes.
 *
 * Since OutputStream is an abstract class, it is not useful by itself. However, its subclasses can be used to write
 * data.
 *
 *
 * <ul>
 *     <li>
 *         FileOutputStream
 *     </li>
 *     <li>
 *         ByteArrayOutputStream
 *     </li>
 *     <li>
 *         ObjectOutputStream
 *     </li>
 * </ul>
 *
 * <br>
 * <br> Methods of InputStream (4)
 *
 * <br>The OutputStream class provides different methods that are implemented by its subclasses. Here are some of the
 * commonly used methods:
 * <br>
 *
 * <ul>
 *     <li>
 *         write() - writes the specified byte to the output stream
 *     </li>
 *     <li>
 *         write(byte[] array) - writes the bytes from the specified array to the output stream
 *     </li>
 *     <li>
 *         flush() - forces to write all data present in output stream to the destination
 *     </li>
 *     <li>
 *         close() - closes the output stream
 *     </li>
 * </ul>
 *
 * <br>
 * @see <a href="https://www.programiz.com/java-programming/outputstream" target="_blank"> Java OutputStream</a>
 * <br>
 * <br>
 * @see <a href="https://www.youtube.com/watch?v=_le5GlfBxVY" target="_blank"> Java OutputStream ( video )</a>
 * <br>
 * <br>*
 * <br>
 * <br><img src="JavaOutputStream.png" alt="Java OutnputStream" width="600" height="400">
 */


public class IOoutputStream {

    public void demo(){

        // Write a string to file
        String data = "This is a line of text inside the file.";

        try {
            OutputStream out = new FileOutputStream("outputString.txt");

            // Converts the string into bytes
            byte[] dataBytes = data.getBytes();

            // Writes data to the output stream
            out.write(dataBytes);
            System.out.println("String Data is written to the file.");

            // Closes the output stream
            out.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }

        // Write a character to file
        try {
            OutputStream out = new FileOutputStream("outputChar.txt");

            // Converts the string into bytes
            byte[] dataBytes = data.getBytes();

            // Writes data to the output stream
            out.write(65);
            System.out.println("A character is written to the file.");

            // Closes the output stream
            out.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
