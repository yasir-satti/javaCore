package com.example.javacoredemo.generics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    Cat cat = new Cat("Fido", 2);

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    };
    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    };
    @Test
    public void getCatName() {
        String expectedName = "Fido";
        assertEquals(expectedName, cat.getName());
    };
    @Test
    public void getCatAge() {
        int expectedAge = 2;
        assertEquals(expectedAge, cat.getAge());
    };
    @Test
    public void getCatType() {
        String expectedType = "Cat";
        assertEquals(expectedType, cat.getAnimalType());
    };
    @Test
    public void printCatDetails() {
        AnimalPrinter<Cat> catPrinter = new AnimalPrinter<>(cat);
        catPrinter.print();
        assertEquals("Cat name is Fido it is 2 years old.\n", outContent.toString());
    }
}
