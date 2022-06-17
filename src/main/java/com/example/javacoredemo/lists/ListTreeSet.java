package com.example.javacoredemo.lists;

import java.util.TreeSet;

public class ListTreeSet {

    /**
     * Java TreeSet class implements the Set interface that uses a tree for storage. Like HashSet, TreeSet also
     * contains unique elements. However, the access and retrieval time of TreeSet is quite fast. The elements in
     * TreeSet stored in ascending order.
     *
     * It extends the NavigableSet interface
     *
     * Java TreeSet tutorial with exaples
     * methods (26)
     * https://www.programiz.com/java-programming/treeset
     * https://abhiandroid.com/java/treeset-methods-java-examples.html
     *
     */

    public void demoTreeSet(){

        TreeSet<Integer> evenNumbers = new TreeSet<>();

        // Using the add() method
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        System.out.println("TreeSet: " + evenNumbers);

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);

        // Using the addAll() method
        numbers.addAll(evenNumbers);
        System.out.println("New TreeSet: " + numbers);

    }

}
