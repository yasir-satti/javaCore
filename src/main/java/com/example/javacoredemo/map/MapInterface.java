package com.example.javacoredemo.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.lang.Integer.valueOf;

public class MapInterface {

    /**
     *
     * The Map interface of the Java collections framework provides the functionality of the map data structure.
     * In Java, elements of Map are stored in key/value pairs. Keys are unique values associated with individual Values.
     *
     * A map cannot contain duplicate keys. And, each key is associated with a single value.
     *
     * Classes that implement Map
     * Since Map is an interface, we cannot create objects from it.
     *
     * In order to use functionalities of the Map interface, we can use these classes:
     *
     * HashMap
     * EnumMap
     * LinkedHashMap
     * WeakHashMap
     * TreeMap
     *
     * Map Interface in Java With Example
     * methods (14)
     *
     * https://abhiandroid.com/java/map
     *
     */

    public void demoMapInterface() {

        // Example 1
        // Creating a map using the HashMap
        Map<String, Integer> numbers = new HashMap<>();

        // Insert elements to the map
        numbers.put("One", 1);
        numbers.put("Two", 2);

        System.out.println("Example 1");

        System.out.println("Map: " + numbers);

        // Access keys of the map
        System.out.println("Keys: " + numbers.keySet());

        // Access values of the map
        System.out.println("Values: " + numbers.values());

        // Access entries of the map
        System.out.println("Entries: " + numbers.entrySet());

        // Remove Elements from the map
        int value = numbers.remove("Two");
        System.out.println("Removed Value: " + value);

        //Example 2
        //Step 1: linkedHashMap object is created
        Map<String, Integer> linkedHashMapobject = new LinkedHashMap<String, Integer>();

        //Step 2: Elements are entered using put() method
        linkedHashMapobject.put("Samsung Grand quattro price ", valueOf(10000));
        linkedHashMapobject.put("Micromax canvas price", valueOf(9000));
        linkedHashMapobject.put("Sony T2 Ultra price", valueOf(20000));
        linkedHashMapobject.put("Nokia Lumia price", valueOf(15000));
        linkedHashMapobject.put("Microsoft Lumia price ", valueOf(16000));

        //Step 3: printing contents of linkedhashMap
        System.out.println("\n\n");
        System.out.println("Example 2");

        System.out.println("Contents of LinkedHashMap : " + linkedHashMapobject);

        System.out.println("\nValues of linkedHashMapobject after iterating over it : \n");

        //Step 4: using for each loop to iterate over linkedHashMap
        for (String key : linkedHashMapobject.keySet()) {
            System.out.println(key + " : " + linkedHashMapobject.get(key));

        }
        ;
    };
}
