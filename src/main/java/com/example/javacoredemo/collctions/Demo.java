package com.example.javacoredemo.collctions;

import java.util.Iterator;

public class Demo {
    public void demo() {

        // Iterator by implementing Iterable interface
        GenericListIterable<String> list = new GenericListIterable<>();
        Iterator<String> iterator = list.iterator();
        list.add("Hello");
        list.add("World");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        };

        // Collections Interface
        CollectionsDemo.show();

        // List interface
        ListDemo.show();

        // Stream API
        StreamDemo.show();
    };
};
