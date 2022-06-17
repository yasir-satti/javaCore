package com.example.javacoredemo.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterable {

    public void demoListIterable() {
        // create a list
        List<String> list = new ArrayList<String>();

        // add elements
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");

        // Iterate through the list using element
        System.out.println(" *******  Lists Iterator using elements...");
        for (String element : list) {
            System.out.println(element);
        }
        System.out.println("\n");

        // Iterate through the list using forEach()
        System.out.println(" *******  Lists Iterator using forEach()...");
        list.forEach(
                (element) -> {
                    System.out.println(element);
                });
        System.out.println("\n");


        // Iterate through the list using hasNext()
        System.out.println(" *******  Lists Iterator using hasNext()...");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
        System.out.println("\n");
    }
}
