package com.example.javacoredemo.iostreams;

import java.io.*;

/**
 *
 * @author Yasir Satti
 * <br>
 * <br>The ObjectInputStream class of the java.io package can be used to read objects that were previously written by ObjectOutputStream.
 *
 * <br>It extends the InputStream abstract class.
 *
 * <br>Before you learn about the <a href="https://www.programiz.com/java-programming/objectoutputstream" target="_blank">ObjectInputStream</a> class,
 * make sure you know about the ObjectOutputStream Class.
 *
 * <br>The ObjectInputStream is mainly used to read data written by the ObjectOutputStream.
 *
 * Basically, the ObjectOutputStream converts Java objects into corresponding streams. This is known as serialization.
 * Those converted streams can be stored in files or transferred through networks.
 * <br>Now, if we need to read those objects, we will use the ObjectInputStream that will convert the streams back to corresponding objects. This is known as deserialization.
 *
 *
 * <br>
 * @see <a href="https://www.programiz.com/java-programming/objectinputstream" target="_blank"> Java ObjectInputStream</a>
 * <br>
 * @see <a href="https://www.youtube.com/watch?v=KAWoOgKsQns" target="_blank"> Java - Write Object and Read Object to File using Object Stream</a>
 * <br>
 */

public class IOObjectStream {

    public void demo(){

        // 1) ObjectInputStream

        // use of writeObject(), writeInt(), readInt() and readObject() methods
        int data1 = 5;
        String data2 = "This is programiz";
        String dataFile = "objectStream.txt";

        try {
            FileOutputStream file = new FileOutputStream(dataFile);
            ObjectOutputStream output = new ObjectOutputStream(file);

            // Writing to the file using ObjectOutputStream
            output.writeInt(data1);
            output.writeObject(data2);

            FileInputStream fileStream = new FileInputStream(dataFile);
            // Creating an object input stream
            ObjectInputStream objStream = new ObjectInputStream(fileStream);

            //Using the readInt() method
            System.out.println("Integer data :" + objStream.readInt());

            // Using the readObject() method
            System.out.println("String data: " + objStream.readObject());

            output.close();
            objStream.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }

        // use of readObject() method

        // Creates an object of Dog class
        Dog dog = new Dog("Tyson", "Labrador");

        try {
            FileOutputStream file = new FileOutputStream("data/ioObjectInputStream.txt");

            // Creates an ObjectOutputStream
            ObjectOutputStream output = new ObjectOutputStream(file);

            // Writes objects to the output stream
            output.writeObject(dog);

            FileInputStream fileStream = new FileInputStream("data/ioObjectInputStream.txt");

            // Creates an ObjectInputStream
            ObjectInputStream input = new ObjectInputStream(fileStream);

            // Reads the objects
            Dog newDog = (Dog) input.readObject();

            System.out.println("Dog Name: " + newDog.name);
            System.out.println("Dog Breed: " + newDog.breed);

            output.close();
            input.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }


    }
}

class Dog implements Serializable {

    String name;
    String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
}
