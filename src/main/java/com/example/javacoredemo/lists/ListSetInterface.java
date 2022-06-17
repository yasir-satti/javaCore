package com.example.javacoredemo.lists;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ListSetInterface {

    /**
     * Set Interface in Java is present in java.util package. It extends the Collection interface.
     * It represents the unordered set of elements which doesn't allow us to store the duplicate items.
     * We can store at most one null value in Set. Set is implemented by HashSet, LinkedHashSet, and TreeSet.
     *
     *
     */

    Set<String> s1 = new HashSet<String>();
    Set<String> s2 = new LinkedHashSet<String>();
    Set<String> s3 = new TreeSet<String>();
}
