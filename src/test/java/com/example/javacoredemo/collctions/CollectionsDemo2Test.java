package com.example.javacoredemo.collctions;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollectionsDemo2Test {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    private final PrintStream original = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    };

    @AfterEach
    public void restoreStreams() {
        System.setOut(original);
    };
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
    public void reverseStringItemsInCollection() {
        String[] items = new String[]{"Hello", "World", "!"};
        Collection<String> expectedCollection = new ArrayList<>();
        Collections.addAll(expectedCollection, items);

        String[] reversedItems = new String[]{"!","World", "Hello"};
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, reversedItems);

        CollectionsDemo2<String> collectionDemo2 = new CollectionsDemo2<>(collection);
        Collection<String> resultCollection = collectionDemo2.reverseItems();

        assertEquals(expectedCollection, resultCollection);
    };
    @Test
    public void reverseStringItemsInSitu() {
        String[] items = new String[]{"Hello", "World", "!"};
        Collection<String> expectedCollection = new ArrayList<>();
        Collections.addAll(expectedCollection, items);

        String[] reversedItems = new String[]{"!","World", "Hello"};
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, reversedItems);

        CollectionsDemo2<String> collectionDemo2 = new CollectionsDemo2<>(collection);
        collectionDemo2.reverseItemsInSitu();
        Collection<String> resultCollection = collectionDemo2.getCollection();

        assertEquals(expectedCollection, resultCollection);
    };
    @Test
    public void printStringItems() {
        String[] items = new String[]{"Hello", "World", "!"};
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, items);

        CollectionsDemo2<String> collectionDemo2 = new CollectionsDemo2<>(collection);

        String expectedOutput = "Hello\n" +
                "World\n" +
                "!\n";

        collectionDemo2.printItems();

        assertEquals(expectedOutput, outContent.toString());
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

    @Test
    public void reverseIntegerItemsInCollection() {
        Integer[] items = new Integer[]{23,45,56};
        Collection<Integer> expectedCollection = new ArrayList<>();
        Collections.addAll(expectedCollection, items);

        Integer[] reversedItems = new Integer[]{56,45,23};
        Collection<Integer> collection = new ArrayList<>();
        Collections.addAll(collection, reversedItems);

        CollectionsDemo2<Integer> collectionDemo2 = new CollectionsDemo2<>(collection);
        Collection<Integer> resultCollection = collectionDemo2.reverseItems();

        assertEquals(expectedCollection, resultCollection);
    };
    @Test
    public void reverseIntegerItemsInSitu() {
        Integer[] items = new Integer[]{56,45,23};
        Collection<Integer> expectedCollection = new ArrayList<>();
        Collections.addAll(expectedCollection, items);

        Integer[] reversedItems = new Integer[]{23, 45, 56};
        Collection<Integer> collection = new ArrayList<>();
        Collections.addAll(collection, reversedItems);

        CollectionsDemo2<Integer> collectionDemo2 = new CollectionsDemo2<>(collection);
        collectionDemo2.reverseItemsInSitu();
        Collection<Integer> resultCollection = collectionDemo2.getCollection();

        assertEquals(expectedCollection, resultCollection);
    };
    @Test
    public void printIntegerItems() {
        Integer[] items = new Integer[]{23, 45, 56};
        Collection<Integer> collection = new ArrayList<>();
        Collections.addAll(collection, items);

        CollectionsDemo2<Integer> collectionDemo2 = new CollectionsDemo2<>(collection);

        String expectedOutput = "23\n" +
                "45\n" +
                "56\n";

        collectionDemo2.printItems();

        assertEquals(expectedOutput, outContent.toString());
    };
}
