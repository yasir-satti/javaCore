package com.example.javacoredemo.collctions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo2<T> {
    private Collection<T> collection = new ArrayList<>();

    CollectionsDemo2(Collection<T> items) {
        this.collection = collection;
    };
    public Collection<T> addItemsToCollection(T... items) {
        Collections.addAll(collection, items);
        return collection;
    }
}
