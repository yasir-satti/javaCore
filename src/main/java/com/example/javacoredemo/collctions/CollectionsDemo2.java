package com.example.javacoredemo.collctions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo2<T> {
    private Collection<T> collection;

    CollectionsDemo2(Collection<T> items) {
        this.collection = items;
    };
    public Collection<T> getCollection() {
        return collection;
    };
    public Collection<T> addItemsToCollection(T... items) {
        Collections.addAll(collection, items);
        return collection;
    };
    public Collection<T> reverseItems(){
        List<T> list = new ArrayList<>();
        for (T t : collection) {
            list.add(t);
        }
        Collections.reverse(list);
        return list;
    };

    public void reverseItemsInSitu(){
        Collections.reverse((List<T>) collection);
    };

    public void printItems() {
        for (T t : collection) {
            System.out.println(t);
        }
    }
}
