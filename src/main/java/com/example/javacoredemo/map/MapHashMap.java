package com.example.javacoredemo.map;

import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author Yasir Satti
 *
 * <br>
 * <br>HashMap is a type of Collection, that stores our data in a pair such that each element has a key associated
 * with it. The pair of key and value is often known as Entry and these entries can have only unique keys.
 *
 * <br>HashMap is a class that implements Map Interface and Extends AbstractMap class which provides the basic
 * structural implementation of Map Interface which minimizes the efforts that are required to implement the
 * Map interface directly in our HashMap Class.
 *
 * <br>
 * <br>Important Note:
 * <br>HashMap allows null key and null value in it, but with a restriction that there can be only one null key and
 * multiple null values.
 *
 * <br>
 * <br>HashMap Internals
 * <br>
 * <ul>
 * <li>hashing</li>
 * <li>capacity</li>
 * <li>threshold</li>
 * <li>rehashing</li>
 * <li>Values present are based on the key</li>
 *  </ul>
 * @see <a href="https://www.baeldung.com/java-hashmap-load-factor#hashmap-internals" target="_blank"> HashMap Internals </a>
 *
 * <br>
 * <br> Load Factor in HashMap
 * <br>
 * The Load factor is a measure that decides when to increase the HashMap capacity to maintain the get() and put()
 * operation complexity of O(1).
 * <br>The default load factor of HashMap is 0.75f (75% of the map size)
 * <br>
 * <br>
 * @see <a href="https://www.javatpoint.com/load-factor-in-hashmap" target="_blank"> Load Factor in HashMap</a>
 *
 * <br>
 * <br> Java HashMap
 *
 * <br>
 * <ul>
 * <li>constructors (4)</li>
 * <li>methods (18)</li>
 * </ul>
 *
 * @see <a href="https://www.https://www.javatpoint.com/java-hashmap" target="_blank"> Java HashMap tutorial</a>
 * <pre>{@code
 * public class MapHashMap {
 *
 *      public void demoHashMap() {
 *
 *      }
 * }
 * }</pre>
 */


public class MapHashMap {


    /**
     *
     * Demonstrates methods of HashMap class
     *
     * @since 1.0
     */

    public void demoHashMap(){

        //Step 1: Defing object of HashMap Class

        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();

        // example constructor with capacity and load factor
        HashMap<Integer,String> hashMapCapacityLoadfactor = new HashMap<Integer,String>(8, 0.6f);

        //Step 2: Adding Key Value pair using put() method

        hashMap.put(1001,"India");

        hashMap.put(1002,"Canada");

        hashMap.put(1003,"Australia");

        //Step 3: Displaying elements of Hash map

        System.out.println("HasMap with put() method: ");
        System.out.println(hashMap);

        System.out.println("\n");

        //Step 4: Displaying key value pairs using for loop, Using getKey and getValue methods to retrieve
        // key and corresponding value

        System.out.println("HashMap with getKey() and getValue() methods: ");

        for(Map.Entry map  :  hashMap.entrySet() )
        {

            System.out.println(map.getKey()+" "+map.getValue());
        }

        System.out.println("\n");

        // Step 5: Use get() method to get value at index X
        String value = hashMap.get(1);
        System.out.println("Value at index 1 using get(0 method: " + value);

        // Step 6: Use ketSet() method to get the keys

        System.out.println("HashMap Keys: " + hashMap.keySet());

        // Step 7: Use values() method to get the values
        System.out.println("HashMap values: " + hashMap.values());

        // Step 8: Use entrySet() method to get the keys/values set
        System.out.println("HashMap Key/Value mapings: " + hashMap.entrySet());

        // Step 9: Use replace() method to replace a value at specific key
        hashMap.replace(1002, "Sudan");
        System.out.println("HashMap using replace(): " + hashMap);

        // Step 10: Use remove() method to remove value at specific key
        hashMap.remove(1002);
        System.out.println("HashMap using replace(): " + hashMap);

        // Step 11: full set of Hash Map methods
        System.out.println("HashMap methods: \n");
        System.out.println(" clear() \n compute() \n computeIfAbsent() \n clone() \n containsKeys() " +
                "\n containsValues() \n entrySet() \n get() \n getOrDefault() \n ketSet() \n put() \n putAll() " +
                "\n putIAbsent() \n values() \n replace() \n replaceAll() \n remove() \n removeAll() \n ");




    };
};
