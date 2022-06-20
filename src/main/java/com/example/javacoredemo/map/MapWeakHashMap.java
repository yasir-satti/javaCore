package com.example.javacoredemo.map;

import java.util.WeakHashMap;


/**
 *
 * @author Yasir Satti
 * <br>
 * <br>The WeakHashMap class of the Java collections framework provides the feature of the hash table data structure..
 *
 * <br> It implements the Map interface.
 *
 * <br>Keys of the weak hashmap are of the WeakReference type.
 *
 * <br>The object of a weak reference type can be garbage collected in Java if the reference is no longer used in the
 * program. This means the entry of a map are removed by the garbage collector if the key to that entry is no longer
 * used. This is useful to save resources.
 *
 * @see <a href="https://www.programiz.com/java-programming/weakhashmap" target="_blank"> Java WeakHaskMap</a>
 * <br>
 * @see <a href="https://www.youtube.com/watch?v=r92EAqB5oW4" target="_blank"> What is WeakHashMap in collection (video)</a>
 */

public class MapWeakHashMap {

    /**
     * Demonstrates methods of WeakHashMap class.
     *
     * @since 1.0
     */

    public void demo(){

        WeakHashMap<String, Integer>numbers = new WeakHashMap<>();

        String two = new String("Two");
        Integer twoValue = 2;
        String four = new String("Four");
        Integer fourValue = 4;

        // Inserting elements
        numbers.put(two, twoValue);
        numbers.put(four, fourValue);
        System.out.println("WeakHashMap: " + numbers);

        // Make the reference null
        two = null;

        // Perform garbage collection
        System.gc();

        System.out.println("WeakHashMap after garbage collection: " + numbers);
    }
}
