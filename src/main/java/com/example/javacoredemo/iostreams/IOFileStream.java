package com.example.javacoredemo.iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Yasir Satti
 * <br>
 * <br>The FileInputStream class of the java.io package can be used to read data (in bytes) from files.
 *
 * It extends the InputStream abstract class.
 *
 *
 * <br>
 * <br> Methods of FileInputStream (9)
 *
 * <br>The InputStream class provides different methods that are implemented by its subclasses. Here are some of the
 * commonly used methods:
 * <br>
 *
 * <ul>
 *     <li>
 *         read() - reads a single byte from the file
 *     </li>
 *     <li>
 *         read(byte[] array) - reads the bytes from the file and stores in the specified array
 *     </li>
 *     <li>
 *         read(byte[] b, int off, int len) - Reads up to len bytes of data from the file into an array of bytes.
 *     </li>
 *     <li>
 *         getChannel() -	returns the object of FileChannel associated with the input stream
 *     </li>
 *     <li>
 *         getFD() -	returns the file descriptor associated with the input stream
 *     </li>
 *     <li>
 *         available() - returns the number of bytes available in the file
 *     </li>
 *     <li>
 *         mark() - marks the position in the file up to which data has been read
 *     </li>
 *     <li>
 *         reset() - returns the control to the point in the file where the mark was set
 *     </li>
 *     <li>
 *         markSupported() - checks if the mark() and reset() method is supported in the file
 *     </li>
 *     <li>
 *         skips() - skips and discards the specified number of bytes from the file
 *     </li>
 *     <li>
 *         close() - closes the file
 *     </li>
 *     <li>
 *         finalize() -	ensures that the close() method is called
 *     </li>
 * </ul>
 *
 * <br>
 * @see <a href="https://www.programiz.com/java-programming/fileinputstream" target="_blank"> Java FileInputStream</a>
 * <br>
 * <br>* <br>
 */

public class IOFileStream {


    /**
     * Demonstrates methods of FileInputStream class.
     *
     * @since 1.0
     */

    public void demo(){

        // 1 - FileInputStream

        String file = "data/ioinputstreamInput.txt";

        // read() method
        try {
            FileInputStream input = new FileInputStream(file);


            System.out.println("FileInputStream...\n\n ");

            System.out.println("Data in the file: ");

            // Reads the first byte
            int i = input.read();

            while(i != -1) {
                System.out.print((char)i);

                // Reads next byte from the file
                i = input.read();
            }
            input.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }

        // avaiable() method
        try {
            // Suppose, the input.txt file contains the following text
            // This is a line of text inside the file.
            FileInputStream input = new FileInputStream(file);

            // Returns the number of available bytes
            System.out.println("\nAvailable bytes at the beginning: " + input.available());

            // Reads 3 bytes from the file
            input.read();
            input.read();
            input.read();

            // Returns the number of available bytes
            System.out.println("\nAvailable bytes at the end: " + input.available());

            input.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }

        // skipe() method
        try {
            // Suppose, the input.txt file contains the following text
            // This is a line of text inside the file.
            FileInputStream input = new FileInputStream(file);

            // Skips the 5 bytes
            input.skip(5);
            System.out.println("Input stream after skipping 5 bytes:");

            // Reads the first byte
            int i = input.read();
            while (i != -1) {
                System.out.print((char) i);

                // Reads next byte from the file
                i = input.read();
            }

            // close() method
            input.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }

        // 2 - FileOutputStream

        String data = "This is a line of text inside the file.";

        try {
            FileOutputStream output = new FileOutputStream("data/fileOutputstream.txt");

            byte[] array = data.getBytes();

            System.out.println("\n\nFileOutputStream...\n ");

            // Writes byte to the file
            output.write(array);

            output.close();

            System.out.println("\nString data written to file...\n ");

        }
        catch(Exception e) {
            e.getStackTrace();
        }

    };

}
