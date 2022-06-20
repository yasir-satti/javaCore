package com.example.javacoredemo.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


/**
 *
 * @author Yasir Satti
 *
 * <br>
 * <br>This class extends HashMap and maintains a linked list of the entries in the map, in the order in which they
 * were inserted. This allows insertion-order iteration over the map. That is, when iterating a LinkedHashMap,
 * the elements will be returned in the order in which they were inserted.
 *
 * <br>
 * <ul>
 * <li>It consists of unique elements only</li>
 * <li>It can contain a single null key and several null values</li>
 * <li>Insertion order is maintained</li>
 * <li>Extends HashMap class</li>
 * <li>Values present are based on the key</li>
 * <li>Non synchronized</li>
 * <li>16 is the initial default capacity</li>
 * <li>The load factor is 0.75</li>
 * </ul>
 *
 *
 * <br>HashMap Internals
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
 * @see <a href="https://www.javatpoint.com/load-factor-in-hashmap" target="_blank"> Load Factor in HashMap</a>
 *
 * <br>
 * <br> Java LinkedHashMap tutorial
 *
 * <br>
 * <ul>
 * <li>constructors (5)</li>
 * <li>methods commonly used (8)</li>
 * </ul>
 *
 * @see <a href="https://www.educba.com/java-linkedhashmap/" target="_blank"> Java LinkedHashMap</a>
 *
 *
 * <pre>{@code
 * public class MapLinkedHashMap {
 *
 *      public void demo(){
 *
 *      }
 * }
 * }</pre>
 */

public class MapLinkedHashMap {

    /**
     * Demonstrates methods of LinkedHashMap class.
     *
     * @since 1.0
     */

    public void demo(){

        // create a LinkedHashMap
        LinkedHashMap<Integer, String> obj = new LinkedHashMap<Integer, String>();

        //Adding key-value pair 1
        obj.put(11, "Anna");

        //Adding key-value pair 2
        obj.put(33, "Adam");

        //Adding key-value pair 3
        obj.put(14, "Iza");

        //Adding key-value pair 4
        obj.put(23, "Norah");

        //Adding key-value pair 5
        obj.put(100, "Denan");

        // create an entry set
        Set s = obj.entrySet();

        // Display the elements
        Iterator itr = s.iterator();

        //iterate each element
        while(itr.hasNext()) {
            //create an object for map.entry
            Map.Entry mp = (Map.Entry)itr.next();

            //print each element
            System.out.print("Key in the LinkedHashMap is : "+ mp.getKey() +
                    " and it's corresponding value is: "+mp.getValue()+" \n");
        };

        // Creating LinkedHashMap of even numbers
        LinkedHashMap<String, Integer> evenNumbers = new LinkedHashMap<>();

        // Using put()
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        System.out.println("Original LinkedHashMap: " + evenNumbers);

        // Using putIfAbsent()
        evenNumbers.putIfAbsent("Six", 6);
        System.out.println("Updated LinkedHashMap(): " + evenNumbers);

        //Creating LinkedHashMap of numbers
        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>();
        numbers.put("One", 1);

        // Using putAll()
        numbers.putAll(evenNumbers);
        System.out.println("New LinkedHashMap: " + numbers);

        //Using getOrDefault()
        // Using getOrDefault()
        int value = evenNumbers.getOrDefault("Nine", 9);
        System.out.println("Returned Number using getOrDefault(): " + value);
    };
};
