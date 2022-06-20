package com.example.javacoredemo.map;

import java.util.NavigableMap;
import java.util.TreeMap;


/**
 *
 * @author Yasir Satti
 * <br>
 * <br>A SortedMap extended with navigation methods returning the closest matches for given search targets.
 * <br>
 * <br>Methods lowerEntry, floorEntry, ceilingEntry, and higherEntry return Map.Entry objects associated with keys
 * respectively less than, less than or equal, greater than or equal, and greater than a given key, returning null if
 * there is no such key.
 * <br>
 * <br>Similarly, methods lowerKey, floorKey, ceilingKey, and higherKey return only the associated keys.
 * <br>
 * <br>All of these methods are designed for locating, not traversing entries.
 * <br>
 * <br>A NavigableMap may be accessed and traversed in either ascending or descending key order. The descendingMap method
 * returns a view of the map with the senses of all relational and directional methods inverted. The performance of
 * ascending operations and views is likely to be faster than that of descending ones.
 * <br>
 * <br>Methods subMap, headMap, and tailMap differ from the like-named SortedMap methods in accepting additional arguments
 * describing whether lower and upper bounds are inclusive versus exclusive. Submaps of any NavigableMap must implement
 * the NavigableMap interface.
 * <br>
 * <br>This interface additionally defines methods firstEntry, pollFirstEntry, lastEntry, and pollLastEntry that return
 * and/or remove the least and greatest mappings, if any exist, else returning null.
 * <br>
 * <br>Implementations of entry-returning methods are expected to return Map.Entry pairs representing snapshots of mappings
 * at the time they were produced, and thus generally do not support the optional Entry.setValue method. Note however
 * that it is possible to change mappings in the associated map using method put.
 * <br>
 * <br>Methods subMap(K, K), headMap(K), and tailMap(K) are specified to return SortedMap to allow existing implementations
 * of SortedMap to be compatibly retrofitted to implement NavigableMap, but extensions and implementations of this
 * interface are encouraged to override these methods to return NavigableMap. Similarly, SortedMap.keySet() can be
 * overriden to return NavigableSet.
 *
 * @see <a href="https://www.programiz.com/java-programming/navigablemap" target="_blank"> Java NavigableMap Interface</a>
 * <br>
 * <br>
 * @see <a href="https://www.youtube.com/watch?v=t05CJKY9oRI" target="_blank">101 NavigableMap Interface in Java with Example ( video )</a>
 *
 * <br>
 * <br><img src="mapNavigableMap.png" alt="Example of using Navigable Map methods" width="1000" height="600">
 */

public class MapNavigableMapInterface {

    /**
     * Demonstrates methods of MapNavigableMap class.
     *
     * @since 1.0
     */

    public void demo(){

        // Creating NavigableMap using TreeMap
        NavigableMap<String, Integer> numbers = new TreeMap<>();

        // Insert elements to map
        numbers.put("Two", 2);
        numbers.put("One", 1);
        numbers.put("Three", 3);
        System.out.println("NavigableMap: " + numbers);

        // Access the first entry of the map
        System.out.println("First Entry: " + numbers.firstEntry());

        // Access the last entry of the map
        System.out.println("Last Entry: " + numbers.lastEntry());

        // Remove the first entry from the map
        System.out.println("Removed First Entry: " + numbers.pollFirstEntry());

        // Remove the last entry from the map
        System.out.println("Removed Last Entry: " + numbers.pollLastEntry());
    }
}
