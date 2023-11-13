package com.example.javacoredemo.collctions;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ListDemo {
    public static void show() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(0, "d");
        System.out.println("List content is : " + list);

        // Use Collections
        List<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "Hello", "World", "Globle", "Hello");
        list2.add(0, "e");
        list2.remove("World");
        list2.lastIndexOf("Hello");
        list2.subList(0, 2);

        System.out.println("\n");
    };
}
