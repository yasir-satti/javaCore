package com.example.javacoredemo.lists;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListArrayListTest {

    @Test
    public void testDemoArrayListWhenCalledThenElementsAddedAndIterationSuccessful() {
        // Arrange
        ListArrayList listArrayList = new ListArrayList();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        listArrayList.demoArrayList();

        // Assert
        String expectedOutput = "Ravi" + System.lineSeparator() +
                "Vijay" + System.lineSeparator() +
                "Ravi" + System.lineSeparator() +
                "Ajay" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}