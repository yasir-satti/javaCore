package com.example.javacoredemo.collctions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "Hello", "World", "Globale");
        System.out.println("Collection content is : " + collection);
        System.out.println("Collection size is " + collection.size());
        System.out.println("Collection contains Hello ? " + collection.contains("Hello"));
        System.out.println("Collection contains Africa ? " + collection.contains("Africa"));
        String[] stringArray = collection.toArray(new String[collection.size()]);
        System.out.println("Convert Collection to String Array and get first item : " + stringArray[0]);

        Collection<String> collection2 = new ArrayList<>();
        collection2.addAll(collection);
        System.out.println("Collection2 content is : " + collection2);

        // compare by reference -> false
        System.out.println("is Collection2 == Collection ? " + (collection2 == collection));
        // compare by value -> true
        System.out.println("is Collection2.equals(collection)? " + collection2.equals(collection));
    };
}
