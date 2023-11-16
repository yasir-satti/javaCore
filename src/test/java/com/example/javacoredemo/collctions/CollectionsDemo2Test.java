package com.example.javacoredemo.collctions;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollectionsDemo2Test {

    @Test
    public void addStringItemsToCollection() {
        String[] items = new String[]{"Hello", "World", "!"};
        Collection<String> expectedCollection = new ArrayList<>();
        Collections.addAll(expectedCollection, items);

        Collection<String> collection = new ArrayList<>();
        CollectionsDemo2<String> collectionDemo2 = new CollectionsDemo2<>(collection);

        Collection<String> resultCollection = collectionDemo2.addItemsToCollection(items);
        assertEquals(expectedCollection, resultCollection);
    };

    @Test
    public void addIntegerItemsToCollection() {
        Integer[] items = new Integer[]{23,45,56};
        Collection<Integer> expectedCollection = new ArrayList<>();
        Collections.addAll(expectedCollection, items);

        Collection<Integer> collection = new ArrayList<>();
        CollectionsDemo2<Integer> collectionDemo2 = new CollectionsDemo2<>(collection);

        Collection<Integer> resultCollection = collectionDemo2.addItemsToCollection(items);
        assertEquals(expectedCollection, resultCollection);
    };
}
