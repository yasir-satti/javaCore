package com.example.javacoredemo.map;

import java.time.DayOfWeek;
import java.util.EnumMap;


/**
 *
 * @author Yasir Satti
 * <br>
 * <br>The EnumMap class of the Java collections framework provides a map implementation for elements of an enum.
 *
 * <br>A specialized Map implementation for use with enum type keys.
 *
 * <ul>
 * <li>All of the keys in an enum map must come from a
 * single enum type that is specified, explicitly or implicitly, when the map is created</li>
 *  <li>Enum maps are represented
 *  internally as arrays. This representation is extremely compact and efficient.</li>
 * <li>Enum maps are maintained in the natural order of their keys (the order in which the enum constants are declared).
 * This is reflected in the iterators returned by the collections views (keySet(), entrySet(), and values()).</li>
 * <li>Null keys are not permitted. Attempts to insert a null key will throw NullPointerException.</li>
 * </ul>
 *
 **
 * @see <a href="https://www.programiz.com/java-programming/enummap" target="_blank"> Java EnumMap</a>
 * <br>
 * @see <a href="https://www.youtube.com/watch?v=wq9SJb8VeyM" target="_blank"> Java Enums Explained in 6 Minutes (video)</a>
 */

public class MapEnumMap {

    /**
     * Demonstrates methods of EnumMap class.
     *
     * @since 1.0
     */

    public void demo(){

        // Creating an EnumMap of the DayfOfWeek enum
        EnumMap<DayOfWeek, String> dayOfWeek = new EnumMap<>(DayOfWeek.class);

        // Using the put() Method
        dayOfWeek.put(DayOfWeek.MONDAY, "Work");
        dayOfWeek.put(DayOfWeek.TUESDAY, "Funday");
        System.out.println("EnumMap1: " + dayOfWeek);

        EnumMap<DayOfWeek, String> dayOfWeek2 = new EnumMap<>(DayOfWeek.class);

        // Using the putAll() Method
        dayOfWeek2.putAll(dayOfWeek);
        dayOfWeek2.put(DayOfWeek.WEDNESDAY, "Client visit");
        System.out.println("EnumMap2: " + dayOfWeek2);

    }
}
