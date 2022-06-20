package com.example.javacoredemo.map;

import java.util.TreeMap;

/**
 *
 * @author Yasir Satti
 * <br>
 * <br>A SortedMap extended with navigation methods returning the closest matches for given search targets. TreeMap is
 * a map implementation that keeps its entries sorted according to the natural ordering of its keys or better still
 * using a comparator if provided by the user at construction time.
 * <br>
 * <br>TreeMap implements NavigableMap interface and bases its internal working on the principles of red-black trees.
 * There are key things to remember in order to understand how they fit into TreeMap:
 *
 * <ul>
 *     <li>
 *         First of all, a red-black tree is a data structure that consists of nodes; picture an inverted mango tree
 *         with its root in the sky and the branches growing downward. The root will contain the first element added
 *         to the tree.
 *
 *         <br>The rule is that starting from the root, any element in the left branch of any node is always less than
 *         the element in the node itself. Those on the right are always greater. What defines greater or less than is
 *         determined by the natural ordering of the elements or the defined comparator at construction as we saw
 *         earlier.
 *         <br>his rule guarantees that the entries of a treemap will always be in sorted and predictable order.
 *     </li>
 *     <li>
 *         Secondly, a red-black tree is a self-balancing binary search tree. This attribute and the above guarantee
 *         that basic operations like search, get, put and remove take logarithmic time O(log n).
 *         <br>Being self-balancing is key here. As we keep inserting and deleting entries, picture the tree growing
 *         longer on one edge or shorter on the other.
 *         <br>This would mean that an operation would take a shorter time on the shorter branch and longer time on the
 *         branch which is furthest from the root, something we would not want to happen.
 *         <br>Therefore, this is taken care of in the design of red-black trees. For every insertion and deletion, the maximum height of the tree on any edge is maintained at O(log n) i.e. the tree balances itself continuously.
 *     </li>
 * </ul>
 *
 * Br>
 * <br> Constructors (4)
 * <br> Methods (18)
 *
 * @see <a href="https://www.programiz.com/java-programming/navigablemap" target="_blank"> Java TreeMap</a>
 * <br>
 * <br>
 * @see <a href="https://www.javaprogramto.com/2021/12/java-treemap-comparator.html" target="_blank"> Java TreeMap Comparator tutorial</a>
 * <br>
 * <br>
 * @see <a href="https://www.baeldung.com/cs/red-black-trees" target="_blank">Introduction to Red-Black Trees</a>
 *
 * <br>
 * <br><img src="red-black-tree.png" alt="Red-black tree" width="600" height="400">
 */

public class MapTreeMap {

    /**
     * Demonstrates methods of MapTreeMap class.
     *
     * @since 1.0
     */

    public void demo(){
        // Creating TreeMap of even numbers
        TreeMap<String, Integer> evenNumbers = new TreeMap<>();

        // Using put()
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);

        // Using putIfAbsent()
        evenNumbers.putIfAbsent("Six", 6);
        System.out.println("TreeMap of even numbers: " + evenNumbers);

        //Creating TreeMap of numbers
        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);

        // Using putAll()
        numbers.putAll(evenNumbers);
        System.out.println("TreeMap of numbers: " + numbers);

        // Access TreeMap Elements
        TreeMap<String, Integer> values = new TreeMap<>();

        values.put("One", 1);
        values.put("Two", 2);
        values.put("Three", 3);

        System.out.println("+++++ Demosntrate Access TreeMap Elements");
        System.out.println("TreeMap: " + values);

        // Using entrySet()
        System.out.println("Key/Value mappings: " + values.entrySet());

        // Using keySet()
        System.out.println("Keys: " + values.keySet());

        // Using values()
        System.out.println("Values: " + values.values());

        // Methods for Navigation
        TreeMap<String, Integer> elements = new TreeMap<>();
        elements.put("First", 1);
        elements.put("Second", 2);
        elements.put("Third", 3);
        elements.put("Fourth", 6);


        System.out.println("+++++ Demosntrate methods for Tree map navigation");
        System.out.println("TreeMap: " + elements);

        // Using the firstKey() method
        String firstKey = elements.firstKey();
        System.out.println("First Key: " + firstKey);

        // Using the lastKey() method
        String lastKey = elements.lastKey();
        System.out.println("Last Key: " + lastKey);

        // Using firstEntry() method
        System.out.println("First Entry: " + elements.firstEntry());


        // Using the lastEntry() method
        System.out.println("Last Entry: " + elements.lastEntry());

        // Using higher()
        System.out.println("Using higherKey(): " + elements.higherKey("Fourth"));
        System.out.println("Using higherEntry(): " + elements.higherEntry("Fourth"));

        // Using lower()
        System.out.println("\nUsing lowerKey(): " + elements.lowerKey("Fourth"));
        System.out.println("Using lowerEntry(): " + elements.lowerEntry("Fourth"));

        // Using ceiling()
        System.out.println("\nUsing ceilingKey(): " + elements.ceilingKey("Fourth"));
        System.out.println("Using ceilingEntry(): " + elements.ceilingEntry("Fourth"));

        // Using floor()
        System.out.println("\nUsing floorKey(): " + elements.floorKey("Fourth"));
        System.out.println("Using floorEntry(): " + elements.floorEntry("Fourth"));

        //Using the pollFirstEntry() method
        System.out.println("Using pollFirstEntry(): " + elements.pollFirstEntry());

        // Using the pollLastEntry() method
        System.out.println("Using pollLastEntry(): " + elements.pollLastEntry());

        System.out.println("Updated TreeMap: " + elements);

        TreeMap<String, Integer> order = new TreeMap<>();
        order.put("First", 1);
        order.put("Second", 2);
        order.put("Third", 3);
        order.put("Fourth", 4);
        System.out.println("TreeMap: " + order);

        System.out.println("\nUsing headMap() Method:");
        // Using headMap() with default booleanValue
        System.out.println("Without boolean value: " + order.headMap("Fourth"));

        // Using headMap() with specified booleanValue
        System.out.println("With boolean value: " + order.headMap("Fourth", true));

        TreeMap<String, Integer> sample = new TreeMap<>();
        sample.put("First", 1);
        sample.put("Second", 2);
        sample.put("Third", 3);
        sample.put("Fourth", 4);
        System.out.println("TreeMap: " + sample);

        System.out.println("\nUsing tailMap() Method:");
        // Using tailMap() with default booleanValue
        System.out.println("Without boolean value: " + sample.tailMap("Second"));

        // Using tailMap() with specified booleanValue
        System.out.println("With boolean value: " + sample.tailMap("Second", false));
    }
}
