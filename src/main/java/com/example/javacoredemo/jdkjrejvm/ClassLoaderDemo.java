package com.example.javacoredemo.jdkjrejvm;

import java.lang.*;

public class ClassLoaderDemo {

    public ClassLoaderDemo() {}

    public void getDemo() {
        try {
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Demo class loader....");
            // returns the Class object associated with this class
            Class cls = Class.forName("com.example.javacoredemo.JavaCoreApplication");

            // returns the ClassLoader object associated with this Class.
            ClassLoader cLoader = cls.getClassLoader();

            if (cLoader == null) {
                System.out.println("The default system class was used.");
            } else {
                // returns the class loader
                Class loaderClass = cLoader.getClass();

                System.out.println("Class associated with ClassLoader = " +
                        loaderClass.getName());
            }
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
    }

}
