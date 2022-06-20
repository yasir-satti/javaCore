package com.example.javacoredemo.map;

import java.util.SortedMap;
import java.util.TreeMap;


/**
 *
 * @author Yasir Satti
 * <br>
 * <br>The SortedMap interface of the Java collections framework provides sorting of keys stored in a map.
 *
 * It extends the Map interface.
 *
 * <br>A Map that further provides a total ordering on its keys. The map is ordered according to the natural ordering of
 * its keys, or by a Comparator typically provided at sorted map creation time. This order is reflected when iterating
 * over the sorted map's collection views (returned by the entrySet, keySet and values methods). Several additional
 * operations are provided to take advantage of the ordering. (This interface is the map analogue of SortedSet.)
 * <br>
 * <br>All keys inserted into a sorted map must implement the Comparable interface (or be accepted by the specified
 * comparator).
 * <br>
 * <br>All general-purpose sorted map implementation classes should provide four "standard" constructors. It is not
 * possible to enforce this recommendation though as required constructors cannot be specified by interfaces. The
 * expected "standard" constructors for all sorted map implementations are:
 *<br>
 * <br>
 * <ul>
 * <li>A void (no arguments) constructor, which creates an empty sorted map sorted according to the natural ordering of
 * its keys.</li>
 * <li>A constructor with a single argument of type Comparator, which creates an empty sorted map sorted according to
 * the specified comparator.</li>
 * <li>A constructor with a single argument of type Map, which creates a new map with the same key-value mappings as its
 * argument, sorted according to the keys' natural ordering.</li>
 * <li>A constructor with a single argument of type SortedMap, which creates a new sorted map with the same key-value
 * mappings and the same ordering as the input sorted map.</li>
 * </ul>
 *
 *
 * @see <a href="https://www.programiz.com/java-programming/sortedmap" target="_blank"> Java SortedMap Interface</a>
 */

public class MapSortedMapInterface {

    /**
     * Demonstrates methods of SortedMap class.
     *
     * @since 1.0
     */

    public void demo() {

        // Creating SortedMap using TreeMap
        SortedMap<String, Integer> numbers = new TreeMap<>();

        // Insert elements to map
        numbers.put("Two", 2);
        numbers.put("One", 1);
        System.out.println("SortedMap: " + numbers);


        // Access the first key of the map
        System.out.println("First Key: " + numbers.firstKey());

        // Access the last key of the map
        System.out.println("Last Key: " + numbers.lastKey());

        // Remove elements from the map
        int value = numbers.remove("One");
        System.out.println("Removed Value: " + value);
    }
}
